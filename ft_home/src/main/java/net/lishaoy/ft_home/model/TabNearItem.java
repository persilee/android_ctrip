package net.lishaoy.ft_home.model;

import com.google.gson.Gson;

public class TabNearItem {

    /**
     * itag : 《爸爸去哪儿》拍摄地
     * ext : {"biztype":"Poi","cityname":"广州","cityid":"32","modification":"1","redirection":"0"}
     * img : {"img3":{"width":"1200","url":"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg","height":"800"},"img2":{"width":"1200","url":"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg","height":"800"},"img1":{"width":"1200","url":"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg","height":"800"}}
     * subtitle1 : 广州长隆旅游度假区景点人气榜第1名
     * currencyChar : ￥
     * title : 长隆野生动物世界
     * type : h5pictxt
     * jumpurl : https://m.ctrip.com/webapp/you/sight/2020086/6802.html?isHideNavBar=YES
     * protag :
     * price : 185
     * text1 : 48353条评论
     * id : 76896
     * text : 48353条评论
     * traffic : {"duration":"","country":"中国","locationicon":"https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png","city":"广州","text":"广州","trafficicon":""}
     */

    private String itag;
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    private ExtBean ext;
    private ImgBean img;
    private String subtitle1;
    private String currencyChar;
    private String title;
    private String type;
    private String jumpurl;
    private String protag;
    private String price;
    private String text1;
    private String id;
    private String text;
    private TrafficBean traffic;

    public static TabNearItem objectFromData(String str) {

        return new Gson().fromJson(str, TabNearItem.class);
    }

    public String getItag() {
        return itag;
    }

    public void setItag(String itag) {
        this.itag = itag;
    }

    public ExtBean getExt() {
        return ext;
    }

    public void setExt(ExtBean ext) {
        this.ext = ext;
    }

    public ImgBean getImg() {
        return img;
    }

    public void setImg(ImgBean img) {
        this.img = img;
    }

    public String getSubtitle1() {
        return subtitle1;
    }

    public void setSubtitle1(String subtitle1) {
        this.subtitle1 = subtitle1;
    }

    public String getCurrencyChar() {
        return currencyChar;
    }

    public void setCurrencyChar(String currencyChar) {
        this.currencyChar = currencyChar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl;
    }

    public String getProtag() {
        return protag;
    }

    public void setProtag(String protag) {
        this.protag = protag;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TrafficBean getTraffic() {
        return traffic;
    }

    public void setTraffic(TrafficBean traffic) {
        this.traffic = traffic;
    }

    public static class ExtBean {
        /**
         * biztype : Poi
         * cityname : 广州
         * cityid : 32
         * modification : 1
         * redirection : 0
         */

        private String biztype;
        private String cityname;
        private String cityid;
        private String modification;
        private String redirection;

        public static ExtBean objectFromData(String str) {

            return new Gson().fromJson(str, ExtBean.class);
        }

        public String getBiztype() {
            return biztype;
        }

        public void setBiztype(String biztype) {
            this.biztype = biztype;
        }

        public String getCityname() {
            return cityname;
        }

        public void setCityname(String cityname) {
            this.cityname = cityname;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getModification() {
            return modification;
        }

        public void setModification(String modification) {
            this.modification = modification;
        }

        public String getRedirection() {
            return redirection;
        }

        public void setRedirection(String redirection) {
            this.redirection = redirection;
        }
    }

    public static class ImgBean {
        /**
         * img3 : {"width":"1200","url":"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg","height":"800"}
         * img2 : {"width":"1200","url":"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg","height":"800"}
         * img1 : {"width":"1200","url":"https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg","height":"800"}
         */

        private Img3Bean img3;
        private Img2Bean img2;
        private Img1Bean img1;

        public static ImgBean objectFromData(String str) {

            return new Gson().fromJson(str, ImgBean.class);
        }

        public Img3Bean getImg3() {
            return img3;
        }

        public void setImg3(Img3Bean img3) {
            this.img3 = img3;
        }

        public Img2Bean getImg2() {
            return img2;
        }

        public void setImg2(Img2Bean img2) {
            this.img2 = img2;
        }

        public Img1Bean getImg1() {
            return img1;
        }

        public void setImg1(Img1Bean img1) {
            this.img1 = img1;
        }

        public static class Img3Bean {
            /**
             * width : 1200
             * url : https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg
             * height : 800
             */

            private String width;
            private String url;
            private String height;

            public static Img3Bean objectFromData(String str) {

                return new Gson().fromJson(str, Img3Bean.class);
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }
        }

        public static class Img2Bean {
            /**
             * width : 1200
             * url : https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg
             * height : 800
             */

            private String width;
            private String url;
            private String height;

            public static Img2Bean objectFromData(String str) {

                return new Gson().fromJson(str, Img2Bean.class);
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }
        }

        public static class Img1Bean {
            /**
             * width : 1200
             * url : https://youimg1.c-ctrip.com/target/350r1f000001fw8bnEDC0.jpg
             * height : 800
             */

            private String width;
            private String url;
            private String height;

            public static Img1Bean objectFromData(String str) {

                return new Gson().fromJson(str, Img1Bean.class);
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }
        }
    }

    public static class TrafficBean {
        /**
         * duration :
         * country : 中国
         * locationicon : https://images4.c-ctrip.com/target/zc0h1e000001f4j0152BE.png
         * city : 广州
         * text : 广州
         * trafficicon :
         */

        private String duration;
        private String country;
        private String locationicon;
        private String city;
        private String text;
        private String trafficicon;

        public static TrafficBean objectFromData(String str) {

            return new Gson().fromJson(str, TrafficBean.class);
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLocationicon() {
            return locationicon;
        }

        public void setLocationicon(String locationicon) {
            this.locationicon = locationicon;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getTrafficicon() {
            return trafficicon;
        }

        public void setTrafficicon(String trafficicon) {
            this.trafficicon = trafficicon;
        }
    }
}
