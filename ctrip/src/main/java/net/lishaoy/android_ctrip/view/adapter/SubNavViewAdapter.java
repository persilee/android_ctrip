package net.lishaoy.android_ctrip.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.Home;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubNavViewAdapter extends RecyclerView.Adapter<SubNavViewAdapter.MyViewHolder> {


    private Context context;
    private List<Home.SubNavListBean> subNavListBeanList;

    public SubNavViewAdapter(Context context, List<Home.SubNavListBean> subNavListBeanList) {
        this.context = context;
        this.subNavListBeanList = subNavListBeanList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sub_nav, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ImageLoaderManager.getInstance().displayImageForView(holder.homeSubNavImg,subNavListBeanList.get(position).getIcon());
        holder.homeSubNavTxt.setText(subNavListBeanList.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,subNavListBeanList.get(position).getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return subNavListBeanList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.home_sub_nav_img)
        ImageView homeSubNavImg;
        @BindView(R.id.home_sub_nav_txt)
        TextView homeSubNavTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
