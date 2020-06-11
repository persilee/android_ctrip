package net.lishaoy.ft_home.api;

import net.lishaoy.ft_home.model.Home;
import net.lishaoy.ft_home.model.TabFood;
import net.lishaoy.ft_home.model.TabNear;
import net.lishaoy.ft_home.model.TabScenic;
import net.lishaoy.ft_home.model.TabSelect;
import net.lishaoy.lib_network.CommonOkHttpClient;
import net.lishaoy.lib_network.listener.DisposeDataHandle;
import net.lishaoy.lib_network.listener.DisposeDataListener;
import net.lishaoy.lib_network.request.CommonRequest;
import net.lishaoy.lib_network.request.RequestParams;

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
         * tab select 页精选请求接口
         */
        private static String HOME_TAB_SELECT = ROOT_URL + "/soa2/12530/json/ticketSpotSearch?_fxpcqlniredt=09031043410934928682";

        /**
         * tab near 页精选请求接口
         */
        private static String HOME_TAB_NEAR = "https://m.ctrip.com/restapi/soa2/13012/getWaterflowInfo?_fxpcqlniredt=09031043410934928682";
        /**
         * tab scenic 页精选请求接口
         */
        private static String HOME_TAB_SCENIC = ROOT_URL + "/soa2/12530/json/getProductRecommend?_fxpcqlniredt=09031043410934928682";
        /**
         * tab food 页精选请求接口
         */
        private static String HOME_TAB_FOOD = ROOT_URL + "/soa2/10332/json/GetHomePageRestaruantListV706?_fxpcqlniredt=09031043410934928682";
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
        RequestCenter.getRequest(HttpConstants.HOME_URL, null, listener, Home.class);
    }

    public static void requestHomeTabSelect(String pageId, String pageSize, DisposeDataListener listener) {

        String jsonStr = "{\"pageid\":10320662472,\"searchtype\":1,\"districtid\":26,\"needfact\":false,\"sort\":1,\"pidx\":"+ pageId +",\"isintion\":true,\"psize\":"+ pageSize +",\"imagesize\":\"C_230_260\",\"reltype\":0,\"assistfilter\":{\"userChooseSite\":\"26\"},\"spara\":\"\",\"filters\":[],\"excepts\":[],\"abtests\":[],\"extendAssociation\":[{\"key\":\"srhtraceid\",\"value\":\"b6841f25-67bf-3789-4c50-159138ff5300\"}],\"contentType\":\"json\",\"head\":{\"cid\":\"09031043410934928682\",\"ctok\":\"\",\"cver\":\"1.0\",\"lang\":\"01\",\"sid\":\"8888\",\"syscode\":\"09\",\"auth\":\"\",\"extension\":[{\"name\":\"protocal\",\"value\":\"https\"}]},\"ver\":\"7.14.2\"}";
        RequestCenter.postRequest(HttpConstants.HOME_TAB_SELECT, jsonStr, listener, TabSelect.class);
    }

    public static void requestHomeTabNear(String pageId, String pageSize, DisposeDataListener listener) {
        String jsonStr = "{\"componentType\":\"h5\",\"sourceid\":\"djaround\",\"appId\":\"99999999\",\"source\":\"djaround\",\"tabType\":\"\",\"tabId\":\"\",\"deviceInfo\":{\"screenWidth\":375,\"screenHeight\":812,\"deviceType\":\"PHONE\",\"type\":\"H5\",\"os\":\"ios\",\"osv\":\"13.2.3\"},\"globalInfo\":{\"type\":3,\"id\":30,\"name\":\"深圳\"},\"hotelInfo\":{\"checkIn\":\"20200608\",\"checkOut\":\"20200609\"},\"pageInfo\":{\"size\":"+ pageSize +",\"index\":"+ pageId +"},\"coordinate\":{},\"conf\":{},\"selectedFastFilters\":[],\"selectedTabs\":[],\"head\":{\"cid\":\"09031043410934928682\",\"ctok\":\"\",\"cver\":\"1.0\",\"lang\":\"01\",\"sid\":\"8888\",\"syscode\":\"09\",\"xsid\":\"\",\"extension\":[]}}";
        RequestCenter.postRequest(HttpConstants.HOME_TAB_NEAR, jsonStr, listener, TabNear.class);
    }

    public static void requestHomeTabScenic(String pageId, String pageSize, DisposeDataListener listener) {
        String jsonStr = "{\"pageid\":10320657096,\"sceneId\":\"20190729\",\"filterParams\":[{\"type\":1,\"productIds\":[\"6037\",\"2778\",\"50102\",\"13720\",\"2780\",\"2776\",\"4336342\"]},{\"type\":2,\"productIds\":[]}],\"extParams\":[{\"key\":\"traceId\",\"value\":\"e4fd38f4-84b3-e036-7387-1b1e19427700\"},{\"key\":\"imgSize\",\"value\":\"C_230_260\"},{\"key\":\"districtId\",\"value\":\"26\"}],\"pageIndex\":"+ pageId +",\"pageSize\":" + pageSize + ",\"contentType\":\"json\",\"head\":{\"cid\":\"09031043410934928682\",\"ctok\":\"\",\"cver\":\"1.0\",\"lang\":\"01\",\"sid\":\"8888\",\"syscode\":\"09\",\"auth\":\"\",\"extension\":[{\"name\":\"protocal\",\"value\":\"https\"}]},\"ver\":\"8.2.3\"}";
        RequestCenter.postRequest(HttpConstants.HOME_TAB_SCENIC, jsonStr, listener, TabScenic.class);
    }

    public static void requestHomeTabFood(String pageId, String pageSize, DisposeDataListener listener) {
        String jsonStr = "{\"ChoiceGoodFilter\":0,\"CuisineFilter\":[],\"CurrentDestId\":0,\"DistanceFilter\":0,\"FoodFilters\":[],\"GeoType\":\"\",\"IsBusinessOpen\":false,\"IsMeiShiLin\":true,\"IsOnlyList\":false,\"IsOnlyFilter\":false,\"Lat\":0,\"Lon\":0,\"MeiShiLinRestFilter\":0,\"MeiShiLinTypes\":[],\"PriceFilter\":[],\"SceneFilter\":[],\"SellFilter\":[],\"OrderType\":0,\"MetroId\":0,\"PageIndex\":"+ pageId +",\"PageSize\":"+ pageSize +",\"ParentPoiId\":0,\"PositionLat\":0,\"PositionLon\":0,\"RegionId\":0,\"RestClassifyId\":0,\"SubVersion\":1,\"ViewDestId\":26,\"ZoneId\":0,\"IsOnlyRestaurant\":false,\"head\":{\"cid\":\"09031043410934928682\",\"ctok\":\"\",\"cver\":\"1.0\",\"lang\":\"01\",\"sid\":\"8888\",\"syscode\":\"09\",\"xsid\":\"\",\"extension\":[]}}";
        RequestCenter.postRequest(HttpConstants.HOME_TAB_FOOD, jsonStr, listener, TabFood.class);
    }


}
