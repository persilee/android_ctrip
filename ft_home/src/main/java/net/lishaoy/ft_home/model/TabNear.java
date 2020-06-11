package net.lishaoy.ft_home.model;

import com.google.gson.Gson;

import java.util.List;

public class TabNear {


    /**
     * ResponseStatus : {"Timestamp":"/Date(1591541874905+0800)/","Ack":"Success","Errors":[],"Extension":[{"Id":"CLOGGING_TRACE_ID","Value":"5727798569498564209"},{"Id":"RootMessageId","Value":"921812-0a3c854c-442094-3570992"}]}
     * data : {"tabs":[{"type":"TOPIC","id":"choice","name":"精选"}],"tripStatus":"0","done":"0","items":["{\"itag\":\"刺激游乐项目融合自然风光\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"深圳\",\"cityid\":\"30\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"6000\",\"url\":\"https://youimg1.c-ctrip.com/target/100l10000000pz3lf527D.jpg\",\"height\":\"4000\"},\"img2\":{\"width\":\"6000\",\"url\":\"https://youimg1.c-ctrip.com/target/100l10000000pz3lf527D.jpg\",\"height\":\"4000\"},\"img1\":{\"width\":\"6000\",\"url\":\"https://youimg1.c-ctrip.com/target/100l10000000pz3lf527D.jpg\",\"height\":\"4000\"}},\"subtitle1\":\"深圳景点人气榜第2名\",\"currencyChar\":\"￥\",\"title\":\"东部华侨城\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/26/50102.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"68\",\"text1\":\"15099条评论\",\"id\":\"83051\",\"text\":\"15099条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"深圳\",\"text\":\"深圳\",\"trafficicon\":\"\"}}","{\"itag\":\"体验踩沙踏浪与出海捕鱼\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"惠东\",\"cityid\":\"21976\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"4000\",\"url\":\"https://youimg1.c-ctrip.com/target/fd/tg/g3/M05/29/F0/CggYGVYxs6-AFaHKAB5HzjYnxQc304.jpg\",\"height\":\"2667\"},\"img2\":{\"width\":\"4000\",\"url\":\"https://youimg1.c-ctrip.com/target/fd/tg/g3/M05/29/F0/CggYGVYxs6-AFaHKAB5HzjYnxQc304.jpg\",\"height\":\"2667\"},\"img1\":{\"width\":\"4000\",\"url\":\"https://youimg1.c-ctrip.com/target/fd/tg/g3/M05/29/F0/CggYGVYxs6-AFaHKAB5HzjYnxQc304.jpg\",\"height\":\"2667\"}},\"subtitle1\":\"惠东景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"巽寮湾\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/956/110149.html?isHideNavBar=YES\",\"protag\":\"\",\"text1\":\"1568条评论\",\"id\":\"91671\",\"text\":\"1568条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"惠东\",\"text\":\"惠东\",\"trafficicon\":\"\"}}","{\"itag\":\"《爸爸去哪儿》拍摄地\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"广州\",\"cityid\":\"32\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1200\",\"url\":\"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg\",\"height\":\"800\"},\"img2\":{\"width\":\"1200\",\"url\":\"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg\",\"height\":\"800\"},\"img1\":{\"width\":\"1200\",\"url\":\"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg\",\"height\":\"800\"}},\"subtitle1\":\"广州长隆旅游度假区景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"长隆野生动物世界\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/2020086/6802.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"185\",\"text1\":\"48353条评论\",\"id\":\"76896\",\"text\":\"48353条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"广州\",\"text\":\"广州\",\"trafficicon\":\"\"}}","{\"itag\":\"风格多样泡池丰富\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"龙门\",\"cityid\":\"21075\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1024\",\"url\":\"https://youimg1.c-ctrip.com/target/100a0f0000007eqr268FC.jpg\",\"height\":\"576\"},\"img2\":{\"width\":\"1024\",\"url\":\"https://youimg1.c-ctrip.com/target/100a0f0000007eqr268FC.jpg\",\"height\":\"576\"},\"img1\":{\"width\":\"1024\",\"url\":\"https://youimg1.c-ctrip.com/target/100a0f0000007eqr268FC.jpg\",\"height\":\"576\"}},\"subtitle1\":\"惠州景点人气榜第7名\",\"currencyChar\":\"￥\",\"title\":\"南昆山温泉大观园\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/2949/76436.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"105\",\"text1\":\"1544条评论\",\"id\":\"89768\",\"text\":\"1544条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"龙门\",\"text\":\"龙门\",\"trafficicon\":\"\"}}","{\"itag\":\"吹海风漫步并遥望澳门\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"珠海\",\"cityid\":\"31\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"2048\",\"url\":\"https://youimg1.c-ctrip.com/target/100v1f000001h1dgrF226.jpg\",\"height\":\"1367\"},\"img2\":{\"width\":\"2048\",\"url\":\"https://youimg1.c-ctrip.com/target/100v1f000001h1dgrF226.jpg\",\"height\":\"1367\"},\"img1\":{\"width\":\"2048\",\"url\":\"https://youimg1.c-ctrip.com/target/100v1f000001h1dgrF226.jpg\",\"height\":\"1367\"}},\"subtitle1\":\"珠海景点人气榜第4名\",\"currencyChar\":\"￥\",\"title\":\"情侣路\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/27/46146.html?isHideNavBar=YES\",\"protag\":\"\",\"text1\":\"2320条评论\",\"id\":\"10558923\",\"text\":\"2320条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"珠海\",\"text\":\"珠海\",\"trafficicon\":\"\"}}","{\"ext\":{\"biztype\":\"Htl\",\"cityname\":\"深圳\",\"cityid\":\"30\",\"modification\":\"1\",\"redirection\":\"0\"},\"itag\":\"摩登典雅的轻奢之选\",\"img\":{\"img3\":{\"width\":\"684\",\"url\":\"https://images4.c-ctrip.com/target/zc0v10000000otr6a9CA1.jpg\",\"height\":\"896\"},\"img2\":{\"width\":\"684\",\"url\":\"https://images4.c-ctrip.com/target/zc0v10000000otr6a9CA1.jpg\",\"height\":\"896\"},\"img1\":{\"width\":\"684\",\"url\":\"https://images4.c-ctrip.com/target/zc0v10000000otr6a9CA1.jpg\",\"height\":\"896\"}},\"subtitle1\":\"\\\"风景很好,游泳方便\\\"\",\"currencyChar\":\"￥\",\"level\":\"5\",\"type\":\"h5pictxt\",\"title\":\"深圳瑞吉酒店\",\"jumpurl\":\"https://m.ctrip.com/webapp/hotel/hoteldetail/347431.html?daylater=0&days=1&source_from_tag=basebiz_ctrip_app_home\",\"protag\":\"\",\"levelType\":\"diamond\",\"text1\":\"2381条评论\",\"price\":\"1516\",\"id\":\"347431\",\"tag\":\"礼,休闲度假\",\"text\":\"1小时前有订\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"深圳\",\"text\":\"深圳\",\"trafficicon\":\"\"}}","{\"itag\":\"岭南水乡风情主题公园\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"佛山\",\"cityid\":\"251\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1536\",\"url\":\"https://youimg1.c-ctrip.com/target/350t16000000z950d7233.jpg\",\"height\":\"1024\"},\"img2\":{\"width\":\"1536\",\"url\":\"https://youimg1.c-ctrip.com/target/350t16000000z950d7233.jpg\",\"height\":\"1024\"},\"img1\":{\"width\":\"1536\",\"url\":\"https://youimg1.c-ctrip.com/target/350t16000000z950d7233.jpg\",\"height\":\"1024\"}},\"subtitle1\":\"佛山景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"长鹿旅游休博园\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/207/76192.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"68\",\"text1\":\"7258条评论\",\"id\":\"10758630\",\"text\":\"7258条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"佛山\",\"text\":\"佛山\",\"trafficicon\":\"\"}}","{\"itag\":\"一静一动的双月型海湾\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"惠州\",\"cityid\":\"299\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1527\",\"url\":\"https://youimg1.c-ctrip.com/target/10030y000000lwpuv11D6.jpg\",\"height\":\"2000\"},\"img2\":{\"width\":\"1527\",\"url\":\"https://youimg1.c-ctrip.com/target/10030y000000lwpuv11D6.jpg\",\"height\":\"2000\"},\"img1\":{\"width\":\"1527\",\"url\":\"https://youimg1.c-ctrip.com/target/10030y000000lwpuv11D6.jpg\",\"height\":\"2000\"}},\"subtitle1\":\"惠州景点人气榜第4名\",\"currencyChar\":\"￥\",\"title\":\"双月湾\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/213/51020.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"50\",\"text1\":\"668条评论\",\"id\":\"83563\",\"text\":\"668条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"惠州\",\"text\":\"惠州\",\"trafficicon\":\"\"}}","{\"ext\":{\"biztype\":\"Htl\",\"cityname\":\"广州\",\"cityid\":\"32\",\"modification\":\"1\",\"redirection\":\"0\"},\"itag\":\"奢华柏悦 羊城CBD\",\"img\":{\"img3\":{\"width\":\"2493\",\"url\":\"https://dimg11.c-ctrip.com/images/20061c000001cukh5E14B.jpg\",\"height\":\"2510\"},\"img2\":{\"width\":\"2493\",\"url\":\"https://dimg11.c-ctrip.com/images/20061c000001cukh5E14B.jpg\",\"height\":\"2510\"},\"img1\":{\"width\":\"2493\",\"url\":\"https://dimg11.c-ctrip.com/images/20061c000001cukh5E14B.jpg\",\"height\":\"2510\"}},\"subtitle1\":\"\\\"位置好,环境不错\\\"\",\"currencyChar\":\"￥\",\"level\":\"5\",\"type\":\"h5pictxt\",\"title\":\"广州柏悦酒店\",\"jumpurl\":\"https://m.ctrip.com/webapp/hotel/hoteldetail/3742724.html?daylater=0&days=1&source_from_tag=basebiz_ctrip_app_home\",\"protag\":\"\",\"levelType\":\"diamond\",\"text1\":\"2314条评论\",\"price\":\"1283\",\"id\":\"3742724\",\"tag\":\"休闲度假,商务出行\",\"text\":\"1分钟前有订\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"广州\",\"text\":\"广州\",\"trafficicon\":\"\"}}","{\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"潮州\",\"cityid\":\"215\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"4252\",\"url\":\"https://youimg1.c-ctrip.com/target/100q1f000001grm030E6D.jpg\",\"height\":\"2797\"},\"img2\":{\"width\":\"4252\",\"url\":\"https://youimg1.c-ctrip.com/target/100q1f000001grm030E6D.jpg\",\"height\":\"2797\"},\"img1\":{\"width\":\"4252\",\"url\":\"https://youimg1.c-ctrip.com/target/100q1f000001grm030E6D.jpg\",\"height\":\"2797\"}},\"subtitle1\":\"潮州景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"广济桥\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/467/56634.html?isHideNavBar=YES\",\"protag\":\"\",\"text1\":\"827条评论\",\"id\":\"85862\",\"text\":\"827条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"潮州\",\"text\":\"潮州\",\"trafficicon\":\"\"}}"],"ext":{"globalName":"深圳","globalID":"30","isDomesticCity":"1"}}
     */

    private ResponseStatusBean ResponseStatus;
    private DataBean data;

    public static TabNear objectFromData(String str) {

        return new Gson().fromJson(str, TabNear.class);
    }

    public ResponseStatusBean getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(ResponseStatusBean ResponseStatus) {
        this.ResponseStatus = ResponseStatus;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ResponseStatusBean {
        /**
         * Timestamp : /Date(1591541874905+0800)/
         * Ack : Success
         * Errors : []
         * Extension : [{"Id":"CLOGGING_TRACE_ID","Value":"5727798569498564209"},{"Id":"RootMessageId","Value":"921812-0a3c854c-442094-3570992"}]
         */

        private String Timestamp;
        private String Ack;
        private List<?> Errors;
        private List<ExtensionBean> Extension;

        public static ResponseStatusBean objectFromData(String str) {

            return new Gson().fromJson(str, ResponseStatusBean.class);
        }

        public String getTimestamp() {
            return Timestamp;
        }

        public void setTimestamp(String Timestamp) {
            this.Timestamp = Timestamp;
        }

        public String getAck() {
            return Ack;
        }

        public void setAck(String Ack) {
            this.Ack = Ack;
        }

        public List<?> getErrors() {
            return Errors;
        }

        public void setErrors(List<?> Errors) {
            this.Errors = Errors;
        }

        public List<ExtensionBean> getExtension() {
            return Extension;
        }

        public void setExtension(List<ExtensionBean> Extension) {
            this.Extension = Extension;
        }

        public static class ExtensionBean {
            /**
             * Id : CLOGGING_TRACE_ID
             * Value : 5727798569498564209
             */

            private String Id;
            private String Value;

            public static ExtensionBean objectFromData(String str) {

                return new Gson().fromJson(str, ExtensionBean.class);
            }

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getValue() {
                return Value;
            }

            public void setValue(String Value) {
                this.Value = Value;
            }
        }
    }

    public static class DataBean {
        /**
         * tabs : [{"type":"TOPIC","id":"choice","name":"精选"}]
         * tripStatus : 0
         * done : 0
         * items : ["{\"itag\":\"刺激游乐项目融合自然风光\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"深圳\",\"cityid\":\"30\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"6000\",\"url\":\"https://youimg1.c-ctrip.com/target/100l10000000pz3lf527D.jpg\",\"height\":\"4000\"},\"img2\":{\"width\":\"6000\",\"url\":\"https://youimg1.c-ctrip.com/target/100l10000000pz3lf527D.jpg\",\"height\":\"4000\"},\"img1\":{\"width\":\"6000\",\"url\":\"https://youimg1.c-ctrip.com/target/100l10000000pz3lf527D.jpg\",\"height\":\"4000\"}},\"subtitle1\":\"深圳景点人气榜第2名\",\"currencyChar\":\"￥\",\"title\":\"东部华侨城\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/26/50102.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"68\",\"text1\":\"15099条评论\",\"id\":\"83051\",\"text\":\"15099条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"深圳\",\"text\":\"深圳\",\"trafficicon\":\"\"}}","{\"itag\":\"体验踩沙踏浪与出海捕鱼\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"惠东\",\"cityid\":\"21976\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"4000\",\"url\":\"https://youimg1.c-ctrip.com/target/fd/tg/g3/M05/29/F0/CggYGVYxs6-AFaHKAB5HzjYnxQc304.jpg\",\"height\":\"2667\"},\"img2\":{\"width\":\"4000\",\"url\":\"https://youimg1.c-ctrip.com/target/fd/tg/g3/M05/29/F0/CggYGVYxs6-AFaHKAB5HzjYnxQc304.jpg\",\"height\":\"2667\"},\"img1\":{\"width\":\"4000\",\"url\":\"https://youimg1.c-ctrip.com/target/fd/tg/g3/M05/29/F0/CggYGVYxs6-AFaHKAB5HzjYnxQc304.jpg\",\"height\":\"2667\"}},\"subtitle1\":\"惠东景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"巽寮湾\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/956/110149.html?isHideNavBar=YES\",\"protag\":\"\",\"text1\":\"1568条评论\",\"id\":\"91671\",\"text\":\"1568条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"惠东\",\"text\":\"惠东\",\"trafficicon\":\"\"}}","{\"itag\":\"《爸爸去哪儿》拍摄地\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"广州\",\"cityid\":\"32\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1200\",\"url\":\"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg\",\"height\":\"800\"},\"img2\":{\"width\":\"1200\",\"url\":\"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg\",\"height\":\"800\"},\"img1\":{\"width\":\"1200\",\"url\":\"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg\",\"height\":\"800\"}},\"subtitle1\":\"广州长隆旅游度假区景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"长隆野生动物世界\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/2020086/6802.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"185\",\"text1\":\"48353条评论\",\"id\":\"76896\",\"text\":\"48353条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"广州\",\"text\":\"广州\",\"trafficicon\":\"\"}}","{\"itag\":\"风格多样泡池丰富\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"龙门\",\"cityid\":\"21075\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1024\",\"url\":\"https://youimg1.c-ctrip.com/target/100a0f0000007eqr268FC.jpg\",\"height\":\"576\"},\"img2\":{\"width\":\"1024\",\"url\":\"https://youimg1.c-ctrip.com/target/100a0f0000007eqr268FC.jpg\",\"height\":\"576\"},\"img1\":{\"width\":\"1024\",\"url\":\"https://youimg1.c-ctrip.com/target/100a0f0000007eqr268FC.jpg\",\"height\":\"576\"}},\"subtitle1\":\"惠州景点人气榜第7名\",\"currencyChar\":\"￥\",\"title\":\"南昆山温泉大观园\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/2949/76436.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"105\",\"text1\":\"1544条评论\",\"id\":\"89768\",\"text\":\"1544条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"龙门\",\"text\":\"龙门\",\"trafficicon\":\"\"}}","{\"itag\":\"吹海风漫步并遥望澳门\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"珠海\",\"cityid\":\"31\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"2048\",\"url\":\"https://youimg1.c-ctrip.com/target/100v1f000001h1dgrF226.jpg\",\"height\":\"1367\"},\"img2\":{\"width\":\"2048\",\"url\":\"https://youimg1.c-ctrip.com/target/100v1f000001h1dgrF226.jpg\",\"height\":\"1367\"},\"img1\":{\"width\":\"2048\",\"url\":\"https://youimg1.c-ctrip.com/target/100v1f000001h1dgrF226.jpg\",\"height\":\"1367\"}},\"subtitle1\":\"珠海景点人气榜第4名\",\"currencyChar\":\"￥\",\"title\":\"情侣路\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/27/46146.html?isHideNavBar=YES\",\"protag\":\"\",\"text1\":\"2320条评论\",\"id\":\"10558923\",\"text\":\"2320条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"珠海\",\"text\":\"珠海\",\"trafficicon\":\"\"}}","{\"ext\":{\"biztype\":\"Htl\",\"cityname\":\"深圳\",\"cityid\":\"30\",\"modification\":\"1\",\"redirection\":\"0\"},\"itag\":\"摩登典雅的轻奢之选\",\"img\":{\"img3\":{\"width\":\"684\",\"url\":\"https://images4.c-ctrip.com/target/zc0v10000000otr6a9CA1.jpg\",\"height\":\"896\"},\"img2\":{\"width\":\"684\",\"url\":\"https://images4.c-ctrip.com/target/zc0v10000000otr6a9CA1.jpg\",\"height\":\"896\"},\"img1\":{\"width\":\"684\",\"url\":\"https://images4.c-ctrip.com/target/zc0v10000000otr6a9CA1.jpg\",\"height\":\"896\"}},\"subtitle1\":\"\\\"风景很好,游泳方便\\\"\",\"currencyChar\":\"￥\",\"level\":\"5\",\"type\":\"h5pictxt\",\"title\":\"深圳瑞吉酒店\",\"jumpurl\":\"https://m.ctrip.com/webapp/hotel/hoteldetail/347431.html?daylater=0&days=1&source_from_tag=basebiz_ctrip_app_home\",\"protag\":\"\",\"levelType\":\"diamond\",\"text1\":\"2381条评论\",\"price\":\"1516\",\"id\":\"347431\",\"tag\":\"礼,休闲度假\",\"text\":\"1小时前有订\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"深圳\",\"text\":\"深圳\",\"trafficicon\":\"\"}}","{\"itag\":\"岭南水乡风情主题公园\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"佛山\",\"cityid\":\"251\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1536\",\"url\":\"https://youimg1.c-ctrip.com/target/350t16000000z950d7233.jpg\",\"height\":\"1024\"},\"img2\":{\"width\":\"1536\",\"url\":\"https://youimg1.c-ctrip.com/target/350t16000000z950d7233.jpg\",\"height\":\"1024\"},\"img1\":{\"width\":\"1536\",\"url\":\"https://youimg1.c-ctrip.com/target/350t16000000z950d7233.jpg\",\"height\":\"1024\"}},\"subtitle1\":\"佛山景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"长鹿旅游休博园\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/207/76192.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"68\",\"text1\":\"7258条评论\",\"id\":\"10758630\",\"text\":\"7258条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"佛山\",\"text\":\"佛山\",\"trafficicon\":\"\"}}","{\"itag\":\"一静一动的双月型海湾\",\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"惠州\",\"cityid\":\"299\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"1527\",\"url\":\"https://youimg1.c-ctrip.com/target/10030y000000lwpuv11D6.jpg\",\"height\":\"2000\"},\"img2\":{\"width\":\"1527\",\"url\":\"https://youimg1.c-ctrip.com/target/10030y000000lwpuv11D6.jpg\",\"height\":\"2000\"},\"img1\":{\"width\":\"1527\",\"url\":\"https://youimg1.c-ctrip.com/target/10030y000000lwpuv11D6.jpg\",\"height\":\"2000\"}},\"subtitle1\":\"惠州景点人气榜第4名\",\"currencyChar\":\"￥\",\"title\":\"双月湾\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/213/51020.html?isHideNavBar=YES\",\"protag\":\"\",\"price\":\"50\",\"text1\":\"668条评论\",\"id\":\"83563\",\"text\":\"668条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"惠州\",\"text\":\"惠州\",\"trafficicon\":\"\"}}","{\"ext\":{\"biztype\":\"Htl\",\"cityname\":\"广州\",\"cityid\":\"32\",\"modification\":\"1\",\"redirection\":\"0\"},\"itag\":\"奢华柏悦 羊城CBD\",\"img\":{\"img3\":{\"width\":\"2493\",\"url\":\"https://dimg11.c-ctrip.com/images/20061c000001cukh5E14B.jpg\",\"height\":\"2510\"},\"img2\":{\"width\":\"2493\",\"url\":\"https://dimg11.c-ctrip.com/images/20061c000001cukh5E14B.jpg\",\"height\":\"2510\"},\"img1\":{\"width\":\"2493\",\"url\":\"https://dimg11.c-ctrip.com/images/20061c000001cukh5E14B.jpg\",\"height\":\"2510\"}},\"subtitle1\":\"\\\"位置好,环境不错\\\"\",\"currencyChar\":\"￥\",\"level\":\"5\",\"type\":\"h5pictxt\",\"title\":\"广州柏悦酒店\",\"jumpurl\":\"https://m.ctrip.com/webapp/hotel/hoteldetail/3742724.html?daylater=0&days=1&source_from_tag=basebiz_ctrip_app_home\",\"protag\":\"\",\"levelType\":\"diamond\",\"text1\":\"2314条评论\",\"price\":\"1283\",\"id\":\"3742724\",\"tag\":\"休闲度假,商务出行\",\"text\":\"1分钟前有订\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"广州\",\"text\":\"广州\",\"trafficicon\":\"\"}}","{\"ext\":{\"biztype\":\"Poi\",\"cityname\":\"潮州\",\"cityid\":\"215\",\"modification\":\"1\",\"redirection\":\"0\"},\"img\":{\"img3\":{\"width\":\"4252\",\"url\":\"https://youimg1.c-ctrip.com/target/100q1f000001grm030E6D.jpg\",\"height\":\"2797\"},\"img2\":{\"width\":\"4252\",\"url\":\"https://youimg1.c-ctrip.com/target/100q1f000001grm030E6D.jpg\",\"height\":\"2797\"},\"img1\":{\"width\":\"4252\",\"url\":\"https://youimg1.c-ctrip.com/target/100q1f000001grm030E6D.jpg\",\"height\":\"2797\"}},\"subtitle1\":\"潮州景点人气榜第1名\",\"currencyChar\":\"￥\",\"title\":\"广济桥\",\"type\":\"h5pictxt\",\"jumpurl\":\"https://m.ctrip.com/webapp/you/sight/467/56634.html?isHideNavBar=YES\",\"protag\":\"\",\"text1\":\"827条评论\",\"id\":\"85862\",\"text\":\"827条评论\",\"traffic\":{\"duration\":\"\",\"country\":\"中国\",\"locationicon\":\"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png\",\"city\":\"潮州\",\"text\":\"潮州\",\"trafficicon\":\"\"}}"]
         * ext : {"globalName":"深圳","globalID":"30","isDomesticCity":"1"}
         */

        private String tripStatus;
        private String done;
        private ExtBean ext;
        private List<TabsBean> tabs;
        private List<String> items;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public String getTripStatus() {
            return tripStatus;
        }

        public void setTripStatus(String tripStatus) {
            this.tripStatus = tripStatus;
        }

        public String getDone() {
            return done;
        }

        public void setDone(String done) {
            this.done = done;
        }

        public ExtBean getExt() {
            return ext;
        }

        public void setExt(ExtBean ext) {
            this.ext = ext;
        }

        public List<TabsBean> getTabs() {
            return tabs;
        }

        public void setTabs(List<TabsBean> tabs) {
            this.tabs = tabs;
        }

        public List<String> getItems() {
            return items;
        }

        public void setItems(List<String> items) {
            this.items = items;
        }

        public static class ExtBean {
            /**
             * globalName : 深圳
             * globalID : 30
             * isDomesticCity : 1
             */

            private String globalName;
            private String globalID;
            private String isDomesticCity;

            public static ExtBean objectFromData(String str) {

                return new Gson().fromJson(str, ExtBean.class);
            }

            public String getGlobalName() {
                return globalName;
            }

            public void setGlobalName(String globalName) {
                this.globalName = globalName;
            }

            public String getGlobalID() {
                return globalID;
            }

            public void setGlobalID(String globalID) {
                this.globalID = globalID;
            }

            public String getIsDomesticCity() {
                return isDomesticCity;
            }

            public void setIsDomesticCity(String isDomesticCity) {
                this.isDomesticCity = isDomesticCity;
            }
        }

        public static class TabsBean {
            /**
             * type : TOPIC
             * id : choice
             * name : 精选
             */

            private String type;
            private String id;
            private String name;

            public static TabsBean objectFromData(String str) {

                return new Gson().fromJson(str, TabsBean.class);
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
