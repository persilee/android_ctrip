package net.lishaoy.lib_network.response;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;

import net.lishaoy.lib_network.exception.OkHttpException;
import net.lishaoy.lib_network.listener.DisposeDataHandle;
import net.lishaoy.lib_network.listener.DisposeDownloadListener;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class CommonFileCallback implements Callback {

    /**
     * the java layer exception, do not same to the logic error
     */
    protected final int NETWORK_ERROR = -1; // the network relative error
    protected final int IO_ERROR = -2; // the JSON relative error
    protected final String EMPTY_MSG = "";
    /**
     * 将其它线程的数据转发到UI线程
     */
    private static final int PROGRESS_MESSAGE = 0x01;
    private Handler mDeliveryHandler;
    private DisposeDownloadListener mListener;
    private String mFilePath;
    private int mProgress;

    public CommonFileCallback(DisposeDataHandle handle) {
        this.mListener = (DisposeDownloadListener) handle.mListener;
        this.mFilePath = handle.mSource;
        this.mDeliveryHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                switch (msg.what) {
                    case PROGRESS_MESSAGE:
                        mListener.onProgress((Integer) msg.obj);
                        break;
                }
            }
        };
    }

    @Override
    public void onFailure(@NotNull Call call, @NotNull final IOException e) {
        mDeliveryHandler.post(new Runnable() {
            @Override
            public void run() {
                mListener.onFailure(new OkHttpException(NETWORK_ERROR, e));
            }
        });
    }

    @Override
    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
        final File file = handleResponse(response);
        mDeliveryHandler.post(new Runnable() {
            @Override
            public void run() {
                if (file != null) {
                    mListener.onSuccess(file);
                } else {
                    mListener.onFailure(new OkHttpException(IO_ERROR, EMPTY_MSG));
                }
            }
        });
    }

    private File handleResponse(Response response) {
        if (response == null) {
            return null;
        }
        InputStream inputStream = null;
        File file = null;
        FileOutputStream outputStream = null;
        byte[] buffer = new byte[2048];
        int length;
        double sumLength;
        double currentLength = 0;
        try {
            checkLocalFilePath(mFilePath);
            file = new File(mFilePath);
            outputStream = new FileOutputStream(file);
            inputStream = response.body().byteStream();
            sumLength = response.body().contentLength();
            while ((length = inputStream.read(buffer)) != -1){
                outputStream.write(buffer,0, buffer.length);
                currentLength += length;
                mProgress = (int) (currentLength / sumLength * 100);
                mDeliveryHandler.obtainMessage(PROGRESS_MESSAGE,mProgress).sendToTarget();
            }
            outputStream.flush();
        } catch (Exception e) {
            file = null;
        }finally {
            try {
                if(outputStream != null){
                    outputStream.close();
                }
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                file = null;
            }
        }



        return null;
    }

    private void checkLocalFilePath(String localFilePath) {
        File path = new File(localFilePath.substring(0,
                localFilePath.lastIndexOf("/") + 1));
        File file = new File(localFilePath);
        if (!path.exists()) {
            path.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
