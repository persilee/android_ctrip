package net.lishaoy.android_ctrip.api;

import net.lishaoy.android_ctrip.model.Home;
import net.lishaoy.android_ctrip.model.TabSelect;
import net.lishaoy.lib_network.CommonOkHttpClient;
import net.lishaoy.lib_network.listener.DisposeDataHandle;
import net.lishaoy.lib_network.listener.DisposeDataListener;
import net.lishaoy.lib_network.request.CommonRequest;
import net.lishaoy.lib_network.request.RequestParams;

import java.util.Map;

/**
 * 请求中心
 */
public class RequestCenter {

    static class HttpConstants {
        private static final String ROOT_URL = "https://sec-m.ctrip.com/restapi";

        /**
         * 首页请求接口
         */
        private static String HOME_URL = "https://cdn.lishaoy.net/ctrip/homeConfig.json";

        /**
         * tab页精选请求接口
         */
        private static String HOME_TAB_SELECT = ROOT_URL + "/soa2/12530/json/ticketSpotSearch?_fxpcqlniredt=09031043410934928682";
    }

    //根据参数发送所有get请求
    public static void getRequest(String url, RequestParams params, DisposeDataListener listener,
                                  Class<?> clazz) {
        CommonOkHttpClient.get(CommonRequest.
                createGetRequest(url, params), new DisposeDataHandle(listener, clazz));
    }
    //根据参数发送所有post请求
    public static void postRequest(String url, String jsonStr, DisposeDataListener listener,
                                  Class<?> clazz) {
        CommonOkHttpClient.post(CommonRequest.createPostJsonRequest(url, jsonStr), new DisposeDataHandle(listener, clazz));
    }
    public static void requestHome(DisposeDataListener listener) {
        RequestCenter.getRequest(HttpConstants.HOME_URL,null,listener, Home.class);
    }
    public static void requestHomeTabSelect(DisposeDataListener listener) {
        String jsonStr = "{\"pageid\":10320662472,\"searchtype\":1,\"districtid\":26,\"needfact\":false,\"sort\":1,\"pidx\":2,\"isintion\":true,\"psize\":20,\"imagesize\":\"C_230_260\",\"reltype\":0,\"assistfilter\":{\"userChooseSite\":\"26\"},\"spara\":\"\",\"filters\":[],\"excepts\":[],\"abtests\":[],\"extendAssociation\":[{\"key\":\"srhtraceid\",\"value\":\"b6841f25-67bf-3789-4c50-159138ff5300\"}],\"contentType\":\"json\",\"head\":{\"cid\":\"09031043410934928682\",\"ctok\":\"\",\"cver\":\"1.0\",\"lang\":\"01\",\"sid\":\"8888\",\"syscode\":\"09\",\"auth\":\"\",\"extension\":[{\"name\":\"protocal\",\"value\":\"https\"}]},\"ver\":\"7.14.2\"}";
        RequestCenter.postRequest(HttpConstants.HOME_TAB_SELECT,jsonStr,listener, TabSelect.class);
    }


}
