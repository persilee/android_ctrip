package net.lishaoy.ft_home.model;

import com.google.gson.Gson;

import java.util.List;

public class Home {

    /**
     * config : {"searchUrl":"https://m.ctrip.com/restapi/h5api/globalsearch/search?source=mobileweb&action=mobileweb&keyword="}
     * searchPlaceHolderList : [{"text":"超值星期三"},{"text":"攻略·景点·酒店"},{"text":"缤纷6月，门票低至5折起！"},{"text":"欢乐谷"},{"text":"餐馆·游记"},{"text":"出游福利计划"}]
     * bannerList : [{"icon":"https://dimg04.c-ctrip.com/images/zg041h000001hoqla603F.jpg","sIcon":"https://cdn.lishaoy.net/ctrip/banner1.jpg","url":"https://m.ctrip.com/webapp/you/gspoi/sight/0/5356386.html?seo=0"},{"icon":"https://dimg04.c-ctrip.com/images/zg0l1g000001hg8q2E0D1.jpg","sIcon":"https://cdn.lishaoy.net/ctrip/banner2.jpg","url":"https://m.ctrip.com/tangram/NjQ2MQ==?ctm_ref=vactang_page_6461&isHideNavBar=YES"},{"icon":"https://dimg04.c-ctrip.com/images/zg0i1g000001h9oh9009F.jpg","sIcon":"https://cdn.lishaoy.net/ctrip/banner3.jpg","url":"https://contents.ctrip.com/activitysetupapp/mkt/index/clwyky?ctm_ref=vdc_ctm_3642"},{"icon":"https://dimg04.c-ctrip.com/images/zg0a1h000001hr5gy3D2D.jpg","sIcon":"https://cdn.lishaoy.net/ctrip/banner4.jpg","url":"https://m.ctrip.com/tangram/NjM0Ng==?ctm_ref=vactang_page_6346&isHideNavBar=YES"},{"icon":"https://dimg04.c-ctrip.com/images/zg0p1h000001hlzdt606F.jpg","sIcon":"https://cdn.lishaoy.net/ctrip/banner5.jpg","url":"https://m.ctrip.com/webapp/you/gspoi/sight/0/50102.html?seo=0"},{"icon":"https://dimg04.c-ctrip.com/images/zg0c1h000001hrqn4997E.jpg","sIcon":"https://cdn.lishaoy.net/ctrip/banner6.jpg","url":"https://m.ctrip.com/tangram/NjU3Ng==?ctm_ref=vactang_page_6576&isHideNavBar=YES"}]
     * localNavList : [{"icon":"https://cdn.lishaoy.net/ctrip/lbsguide.png","title":"攻略·景点","url":"https://m.ctrip.com/webapp/you/place/2.html?ishideheader=true&secondwakeup=true&dpclickjump=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"ffffff","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/piao.png","title":"门票·玩乐","url":"https://dp.ctrip.com/webapp/ticket/tickethttps://m.ctrip.com/webapp/ticket/ticket?secondwakeup=true&dpclickjump=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"ffffff","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/food.png","title":"美食林","url":"https://m.ctrip.com/webapp/you/foods/address.html?new=1&ishideheader=true&secondwakeup=true&dpclickjump=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"ffffff","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/around.png","title":"周边游","url":"https://m.ctrip.com/webapp/vacations/tour/around?secondwakeup=true&dpclickjump=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"ffffff","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/onedaytravel.png","title":"一日游","url":"https://m.ctrip.com/webapp/activity/daytour?secondwakeup=true&dpclickjump=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"ffffff","hideAppBar":true}]
     * gridNav : {"hotel":{"startColor":"fa5956","endColor":"fa9b4d","mainItem":{"title":"酒店","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-hotel.png","url":"https://m.ctrip.com/webapp/hotel/","statusBarColor":"4289ff"},"item1":{"title":"酒店","url":"https://m.ctrip.com/webapp/hotel/?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"4289ff"},"item2":{"title":"民宿·客栈","url":"https://m.ctrip.com/webapp/inn-v2/home?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F"},"item3":{"title":"特价·爆款","url":"https://m.ctrip.com/webapp/cw/hotel/instoreflagship/productHome.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item4":{"title":"民宿 客栈","url":"https://m.ctrip.com/webapp/inn/index","hideAppBar":true}},"flight":{"startColor":"4b8fed","endColor":"53bced","mainItem":{"title":"机票","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-flight.png","url":"https://m.ctrip.com/html5/flight/swift/index"},"item1":{"title":"机票","url":"https://m.ctrip.com/html5/flight/swift/index?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item2":{"title":"火车票","url":"https://m.ctrip.com/webapp/train/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F#/index?VNK=35f3baea"},"item3":{"title":"汽车·船票","url":"https://m.ctrip.com/webapp/bus/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item4":{"title":"专车·租车","url":"https://m.ctrip.com/webapp/car/index?s=ctrip&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}},"travel":{"startColor":"34c2aa","endColor":"6cd557","mainItem":{"title":"旅游","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-travel.png","url":"https://m.ctrip.com/webapp/vacations/tour/vacations","hideAppBar":true,"statusBarColor":"19A0F0"},"item1":{"title":"旅游","url":"https://m.ctrip.com/webapp/vacations/tour/vacations?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"19A0F0","hideAppBar":true},"item2":{"title":"高铁游","url":"https://m.ctrip.com/webapp/train/crh/plan/crhList.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"19A0F0","hideAppBar":true},"item3":{"title":"邮轮游","url":"https://m.ctrip.com/webapp/cruise/index?ctm_ref=C_vac_cruise&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item4":{"title":"定制游","url":"https://m.ctrip.com/webapp/dingzhi/index?ctm_ref=C_vac_custom&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}}}
     * subNavList : [{"icon":"https://cdn.lishaoy.net/ctrip/freetravel.png","title":"自由行","url":"https://m.ctrip.com/tangram/MjczNQ==?ctm_ref=vactang_page_2735&navBarStyle=white&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/wifi.png","title":"WiFi电话卡","url":"https://m.ctrip.com/webapp/activity/wifi?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/visa.png","title":"保险·签证","url":"https://m.ctrip.com/visa/extend/entry?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/globalshop.png","title":"换钞·购物","url":"https://m.ctrip.com/webapp/fshome/crnweb/home.html?bid=2&cid=3&pid=3&ctm_ref=M_ps_1home_gg_mh&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/hpgsguild.png","title":"当地向导","url":"https://m.ctrip.com/webapp/vacations/pguider/homepage?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/flight.png","title":"特价机票","url":"https://m.ctrip.com/webapp/flightactivity/muse/index.html?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https://m.ctrip.com/html5/&dCityCode=SHA&dCityName=%E4%B8%8A%E6%B5%B7&dCityType=1","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/card.png","title":"礼品卡","url":"https://m.ctrip.com/webapp/lipin/money?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/creditCard.png","title":"申卡·借钱","url":"https://jr.ctrip.com/m/finweb/page/financeCenter?from=financeCenter&clientSource=CTRIP","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/yiriyou1.png","title":"境外玩乐","url":"https://dp.ctrip.com/webapp/activity/overseasindex","hideAppBar":true},{"icon":"https://cdn.lishaoy.net/ctrip/more.png","title":"更多","url":"https://m.ctrip.com/webapp/more/?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}]
     * salesBox : {"icon":"https://www.devio.org/io/flutter_app/img/sales_box_huodong.png","moreUrl":"https://contents.ctrip.com/activitysetupapp/mkt/index/moreact?popup=close&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F&secondwakeup=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","bigCard1":{"icon":"https://cdn.lishaoy.net/ctrip/yyfl.jpg","url":"https://m.ctrip.com/webapp/membercenter/medical?pushcode=sy_rm1020","hideAppBar":true},"bigCard2":{"icon":"https://cdn.lishaoy.net/ctrip/bydlb.jpg","url":"https://contents.ctrip.com/activitysetupapp/mkt/index/2020qyhbmfl?popup=close&pushcode=nn2025","title":"活动"},"smallCard1":{"icon":"https://cdn.lishaoy.net/ctrip/lxypth.png","url":"https://m.ctrip.com/webapp/mall/index","hideAppBar":true},"smallCard2":{"icon":"https://cdn.lishaoy.net/ctrip/yqzx.jpg","url":"https://smarket.ctrip.com/webapp/promocode/add?source=5","hideAppBar":true},"smallCard3":{"icon":"https://cdn.lishaoy.net/ctrip/yqbzzc.jpg","url":"https://contents.ctrip.com/activitysetupapp/mkt/index/end","title":"活动"},"smallCard4":{"icon":"https://cdn.lishaoy.net/ctrip/jxtjmp.jpg","url":"https://m.ctrip.com/webapp/ticket/index","hideAppBar":true}}
     */

    private ConfigBean config;
    private GridNavBean gridNav;
    private SalesBoxBean salesBox;
    private List<SearchPlaceHolderListBean> searchPlaceHolderList;
    private List<BannerListBean> bannerList;
    private List<LocalNavListBean> localNavList;
    private List<SubNavListBean> subNavList;

    public static Home objectFromData(String str) {

        return new Gson().fromJson(str, Home.class);
    }

    public ConfigBean getConfig() {
        return config;
    }

    public void setConfig(ConfigBean config) {
        this.config = config;
    }

    public GridNavBean getGridNav() {
        return gridNav;
    }

    public void setGridNav(GridNavBean gridNav) {
        this.gridNav = gridNav;
    }

    public SalesBoxBean getSalesBox() {
        return salesBox;
    }

    public void setSalesBox(SalesBoxBean salesBox) {
        this.salesBox = salesBox;
    }

    public List<SearchPlaceHolderListBean> getSearchPlaceHolderList() {
        return searchPlaceHolderList;
    }

    public void setSearchPlaceHolderList(List<SearchPlaceHolderListBean> searchPlaceHolderList) {
        this.searchPlaceHolderList = searchPlaceHolderList;
    }

    public List<BannerListBean> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<BannerListBean> bannerList) {
        this.bannerList = bannerList;
    }

    public List<LocalNavListBean> getLocalNavList() {
        return localNavList;
    }

    public void setLocalNavList(List<LocalNavListBean> localNavList) {
        this.localNavList = localNavList;
    }

    public List<SubNavListBean> getSubNavList() {
        return subNavList;
    }

    public void setSubNavList(List<SubNavListBean> subNavList) {
        this.subNavList = subNavList;
    }

    public static class ConfigBean {
        /**
         * searchUrl : https://m.ctrip.com/restapi/h5api/globalsearch/search?source=mobileweb&action=mobileweb&keyword=
         */

        private String searchUrl;

        public static ConfigBean objectFromData(String str) {

            return new Gson().fromJson(str, ConfigBean.class);
        }

        public String getSearchUrl() {
            return searchUrl;
        }

        public void setSearchUrl(String searchUrl) {
            this.searchUrl = searchUrl;
        }
    }

    public static class GridNavBean {
        /**
         * hotel : {"startColor":"fa5956","endColor":"fa9b4d","mainItem":{"title":"酒店","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-hotel.png","url":"https://m.ctrip.com/webapp/hotel/","statusBarColor":"4289ff"},"item1":{"title":"酒店","url":"https://m.ctrip.com/webapp/hotel/?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"4289ff"},"item2":{"title":"民宿·客栈","url":"https://m.ctrip.com/webapp/inn-v2/home?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F"},"item3":{"title":"特价·爆款","url":"https://m.ctrip.com/webapp/cw/hotel/instoreflagship/productHome.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item4":{"title":"民宿 客栈","url":"https://m.ctrip.com/webapp/inn/index","hideAppBar":true}}
         * flight : {"startColor":"4b8fed","endColor":"53bced","mainItem":{"title":"机票","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-flight.png","url":"https://m.ctrip.com/html5/flight/swift/index"},"item1":{"title":"机票","url":"https://m.ctrip.com/html5/flight/swift/index?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item2":{"title":"火车票","url":"https://m.ctrip.com/webapp/train/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F#/index?VNK=35f3baea"},"item3":{"title":"汽车·船票","url":"https://m.ctrip.com/webapp/bus/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item4":{"title":"专车·租车","url":"https://m.ctrip.com/webapp/car/index?s=ctrip&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}}
         * travel : {"startColor":"34c2aa","endColor":"6cd557","mainItem":{"title":"旅游","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-travel.png","url":"https://m.ctrip.com/webapp/vacations/tour/vacations","hideAppBar":true,"statusBarColor":"19A0F0"},"item1":{"title":"旅游","url":"https://m.ctrip.com/webapp/vacations/tour/vacations?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"19A0F0","hideAppBar":true},"item2":{"title":"高铁游","url":"https://m.ctrip.com/webapp/train/crh/plan/crhList.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"19A0F0","hideAppBar":true},"item3":{"title":"邮轮游","url":"https://m.ctrip.com/webapp/cruise/index?ctm_ref=C_vac_cruise&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true},"item4":{"title":"定制游","url":"https://m.ctrip.com/webapp/dingzhi/index?ctm_ref=C_vac_custom&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}}
         */

        private HotelBean hotel;
        private FlightBean flight;
        private TravelBean travel;

        public static GridNavBean objectFromData(String str) {

            return new Gson().fromJson(str, GridNavBean.class);
        }

        public HotelBean getHotel() {
            return hotel;
        }

        public void setHotel(HotelBean hotel) {
            this.hotel = hotel;
        }

        public FlightBean getFlight() {
            return flight;
        }

        public void setFlight(FlightBean flight) {
            this.flight = flight;
        }

        public TravelBean getTravel() {
            return travel;
        }

        public void setTravel(TravelBean travel) {
            this.travel = travel;
        }

        public static class HotelBean {
            /**
             * startColor : fa5956
             * endColor : fa9b4d
             * mainItem : {"title":"酒店","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-hotel.png","url":"https://m.ctrip.com/webapp/hotel/","statusBarColor":"4289ff"}
             * item1 : {"title":"酒店","url":"https://m.ctrip.com/webapp/hotel/?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"4289ff"}
             * item2 : {"title":"民宿·客栈","url":"https://m.ctrip.com/webapp/inn-v2/home?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F"}
             * item3 : {"title":"特价·爆款","url":"https://m.ctrip.com/webapp/cw/hotel/instoreflagship/productHome.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}
             * item4 : {"title":"民宿 客栈","url":"https://m.ctrip.com/webapp/inn/index","hideAppBar":true}
             */

            private String startColor;
            private String endColor;
            private MainItemBean mainItem;
            private Item1Bean item1;
            private Item2Bean item2;
            private Item3Bean item3;
            private Item4Bean item4;

            public static HotelBean objectFromData(String str) {

                return new Gson().fromJson(str, HotelBean.class);
            }

            public String getStartColor() {
                return startColor;
            }

            public void setStartColor(String startColor) {
                this.startColor = startColor;
            }

            public String getEndColor() {
                return endColor;
            }

            public void setEndColor(String endColor) {
                this.endColor = endColor;
            }

            public MainItemBean getMainItem() {
                return mainItem;
            }

            public void setMainItem(MainItemBean mainItem) {
                this.mainItem = mainItem;
            }

            public Item1Bean getItem1() {
                return item1;
            }

            public void setItem1(Item1Bean item1) {
                this.item1 = item1;
            }

            public Item2Bean getItem2() {
                return item2;
            }

            public void setItem2(Item2Bean item2) {
                this.item2 = item2;
            }

            public Item3Bean getItem3() {
                return item3;
            }

            public void setItem3(Item3Bean item3) {
                this.item3 = item3;
            }

            public Item4Bean getItem4() {
                return item4;
            }

            public void setItem4(Item4Bean item4) {
                this.item4 = item4;
            }

            public static class MainItemBean {
                /**
                 * title : 酒店
                 * icon : https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-hotel.png
                 * url : https://m.ctrip.com/webapp/hotel/
                 * statusBarColor : 4289ff
                 */

                private String title;
                private String icon;
                private String url;
                private String statusBarColor;

                public static MainItemBean objectFromData(String str) {

                    return new Gson().fromJson(str, MainItemBean.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getStatusBarColor() {
                    return statusBarColor;
                }

                public void setStatusBarColor(String statusBarColor) {
                    this.statusBarColor = statusBarColor;
                }
            }

            public static class Item1Bean {
                /**
                 * title : 酒店
                 * url : https://m.ctrip.com/webapp/hotel/?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * statusBarColor : 4289ff
                 */

                private String title;
                private String url;
                private String statusBarColor;

                public static Item1Bean objectFromData(String str) {

                    return new Gson().fromJson(str, Item1Bean.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getStatusBarColor() {
                    return statusBarColor;
                }

                public void setStatusBarColor(String statusBarColor) {
                    this.statusBarColor = statusBarColor;
                }
            }

            public static class Item2Bean {
                /**
                 * title : 民宿·客栈
                 * url : https://m.ctrip.com/webapp/inn-v2/home?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 */

                private String title;
                private String url;

                public static Item2Bean objectFromData(String str) {

                    return new Gson().fromJson(str, Item2Bean.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class Item3Bean {
                /**
                 * title : 特价·爆款
                 * url : https://m.ctrip.com/webapp/cw/hotel/instoreflagship/productHome.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item3Bean objectFromData(String str) {

                    return new Gson().fromJson(str, Item3Bean.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }

            public static class Item4Bean {
                /**
                 * title : 民宿 客栈
                 * url : https://m.ctrip.com/webapp/inn/index
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item4Bean objectFromData(String str) {

                    return new Gson().fromJson(str, Item4Bean.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }
        }

        public static class FlightBean {
            /**
             * startColor : 4b8fed
             * endColor : 53bced
             * mainItem : {"title":"机票","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-flight.png","url":"https://m.ctrip.com/html5/flight/swift/index"}
             * item1 : {"title":"机票","url":"https://m.ctrip.com/html5/flight/swift/index?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}
             * item2 : {"title":"火车票","url":"https://m.ctrip.com/webapp/train/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F#/index?VNK=35f3baea"}
             * item3 : {"title":"汽车·船票","url":"https://m.ctrip.com/webapp/bus/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}
             * item4 : {"title":"专车·租车","url":"https://m.ctrip.com/webapp/car/index?s=ctrip&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}
             */

            private String startColor;
            private String endColor;
            private MainItemBeanX mainItem;
            private Item1BeanX item1;
            private Item2BeanX item2;
            private Item3BeanX item3;
            private Item4BeanX item4;

            public static FlightBean objectFromData(String str) {

                return new Gson().fromJson(str, FlightBean.class);
            }

            public String getStartColor() {
                return startColor;
            }

            public void setStartColor(String startColor) {
                this.startColor = startColor;
            }

            public String getEndColor() {
                return endColor;
            }

            public void setEndColor(String endColor) {
                this.endColor = endColor;
            }

            public MainItemBeanX getMainItem() {
                return mainItem;
            }

            public void setMainItem(MainItemBeanX mainItem) {
                this.mainItem = mainItem;
            }

            public Item1BeanX getItem1() {
                return item1;
            }

            public void setItem1(Item1BeanX item1) {
                this.item1 = item1;
            }

            public Item2BeanX getItem2() {
                return item2;
            }

            public void setItem2(Item2BeanX item2) {
                this.item2 = item2;
            }

            public Item3BeanX getItem3() {
                return item3;
            }

            public void setItem3(Item3BeanX item3) {
                this.item3 = item3;
            }

            public Item4BeanX getItem4() {
                return item4;
            }

            public void setItem4(Item4BeanX item4) {
                this.item4 = item4;
            }

            public static class MainItemBeanX {
                /**
                 * title : 机票
                 * icon : https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-flight.png
                 * url : https://m.ctrip.com/html5/flight/swift/index
                 */

                private String title;
                private String icon;
                private String url;

                public static MainItemBeanX objectFromData(String str) {

                    return new Gson().fromJson(str, MainItemBeanX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class Item1BeanX {
                /**
                 * title : 机票
                 * url : https://m.ctrip.com/html5/flight/swift/index?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item1BeanX objectFromData(String str) {

                    return new Gson().fromJson(str, Item1BeanX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }

            public static class Item2BeanX {
                /**
                 * title : 火车票
                 * url : https://m.ctrip.com/webapp/train/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F#/index?VNK=35f3baea
                 */

                private String title;
                private String url;

                public static Item2BeanX objectFromData(String str) {

                    return new Gson().fromJson(str, Item2BeanX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class Item3BeanX {
                /**
                 * title : 汽车·船票
                 * url : https://m.ctrip.com/webapp/bus/?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item3BeanX objectFromData(String str) {

                    return new Gson().fromJson(str, Item3BeanX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }

            public static class Item4BeanX {
                /**
                 * title : 专车·租车
                 * url : https://m.ctrip.com/webapp/car/index?s=ctrip&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item4BeanX objectFromData(String str) {

                    return new Gson().fromJson(str, Item4BeanX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }
        }

        public static class TravelBean {
            /**
             * startColor : 34c2aa
             * endColor : 6cd557
             * mainItem : {"title":"旅游","icon":"https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-travel.png","url":"https://m.ctrip.com/webapp/vacations/tour/vacations","hideAppBar":true,"statusBarColor":"19A0F0"}
             * item1 : {"title":"旅游","url":"https://m.ctrip.com/webapp/vacations/tour/vacations?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"19A0F0","hideAppBar":true}
             * item2 : {"title":"高铁游","url":"https://m.ctrip.com/webapp/train/crh/plan/crhList.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","statusBarColor":"19A0F0","hideAppBar":true}
             * item3 : {"title":"邮轮游","url":"https://m.ctrip.com/webapp/cruise/index?ctm_ref=C_vac_cruise&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}
             * item4 : {"title":"定制游","url":"https://m.ctrip.com/webapp/dingzhi/index?ctm_ref=C_vac_custom&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F","hideAppBar":true}
             */

            private String startColor;
            private String endColor;
            private MainItemBeanXX mainItem;
            private Item1BeanXX item1;
            private Item2BeanXX item2;
            private Item3BeanXX item3;
            private Item4BeanXX item4;

            public static TravelBean objectFromData(String str) {

                return new Gson().fromJson(str, TravelBean.class);
            }

            public String getStartColor() {
                return startColor;
            }

            public void setStartColor(String startColor) {
                this.startColor = startColor;
            }

            public String getEndColor() {
                return endColor;
            }

            public void setEndColor(String endColor) {
                this.endColor = endColor;
            }

            public MainItemBeanXX getMainItem() {
                return mainItem;
            }

            public void setMainItem(MainItemBeanXX mainItem) {
                this.mainItem = mainItem;
            }

            public Item1BeanXX getItem1() {
                return item1;
            }

            public void setItem1(Item1BeanXX item1) {
                this.item1 = item1;
            }

            public Item2BeanXX getItem2() {
                return item2;
            }

            public void setItem2(Item2BeanXX item2) {
                this.item2 = item2;
            }

            public Item3BeanXX getItem3() {
                return item3;
            }

            public void setItem3(Item3BeanXX item3) {
                this.item3 = item3;
            }

            public Item4BeanXX getItem4() {
                return item4;
            }

            public void setItem4(Item4BeanXX item4) {
                this.item4 = item4;
            }

            public static class MainItemBeanXX {
                /**
                 * title : 旅游
                 * icon : https://pic.c-ctrip.com/platform/h5/home/grid-nav-items-travel.png
                 * url : https://m.ctrip.com/webapp/vacations/tour/vacations
                 * hideAppBar : true
                 * statusBarColor : 19A0F0
                 */

                private String title;
                private String icon;
                private String url;
                private boolean hideAppBar;
                private String statusBarColor;

                public static MainItemBeanXX objectFromData(String str) {

                    return new Gson().fromJson(str, MainItemBeanXX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }

                public String getStatusBarColor() {
                    return statusBarColor;
                }

                public void setStatusBarColor(String statusBarColor) {
                    this.statusBarColor = statusBarColor;
                }
            }

            public static class Item1BeanXX {
                /**
                 * title : 旅游
                 * url : https://m.ctrip.com/webapp/vacations/tour/vacations?secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * statusBarColor : 19A0F0
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private String statusBarColor;
                private boolean hideAppBar;

                public static Item1BeanXX objectFromData(String str) {

                    return new Gson().fromJson(str, Item1BeanXX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getStatusBarColor() {
                    return statusBarColor;
                }

                public void setStatusBarColor(String statusBarColor) {
                    this.statusBarColor = statusBarColor;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }

            public static class Item2BeanXX {
                /**
                 * title : 高铁游
                 * url : https://m.ctrip.com/webapp/train/crh/plan/crhList.html?from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * statusBarColor : 19A0F0
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private String statusBarColor;
                private boolean hideAppBar;

                public static Item2BeanXX objectFromData(String str) {

                    return new Gson().fromJson(str, Item2BeanXX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getStatusBarColor() {
                    return statusBarColor;
                }

                public void setStatusBarColor(String statusBarColor) {
                    this.statusBarColor = statusBarColor;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }

            public static class Item3BeanXX {
                /**
                 * title : 邮轮游
                 * url : https://m.ctrip.com/webapp/cruise/index?ctm_ref=C_vac_cruise&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item3BeanXX objectFromData(String str) {

                    return new Gson().fromJson(str, Item3BeanXX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }

            public static class Item4BeanXX {
                /**
                 * title : 定制游
                 * url : https://m.ctrip.com/webapp/dingzhi/index?ctm_ref=C_vac_custom&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
                 * hideAppBar : true
                 */

                private String title;
                private String url;
                private boolean hideAppBar;

                public static Item4BeanXX objectFromData(String str) {

                    return new Gson().fromJson(str, Item4BeanXX.class);
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public boolean isHideAppBar() {
                    return hideAppBar;
                }

                public void setHideAppBar(boolean hideAppBar) {
                    this.hideAppBar = hideAppBar;
                }
            }
        }
    }

    public static class SalesBoxBean {
        /**
         * icon : https://www.devio.org/io/flutter_app/img/sales_box_huodong.png
         * moreUrl : https://contents.ctrip.com/activitysetupapp/mkt/index/moreact?popup=close&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F&secondwakeup=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
         * bigCard1 : {"icon":"https://cdn.lishaoy.net/ctrip/yyfl.jpg","url":"https://m.ctrip.com/webapp/membercenter/medical?pushcode=sy_rm1020","hideAppBar":true}
         * bigCard2 : {"icon":"https://cdn.lishaoy.net/ctrip/bydlb.jpg","url":"https://contents.ctrip.com/activitysetupapp/mkt/index/2020qyhbmfl?popup=close&pushcode=nn2025","title":"活动"}
         * smallCard1 : {"icon":"https://cdn.lishaoy.net/ctrip/lxypth.png","url":"https://m.ctrip.com/webapp/mall/index","hideAppBar":true}
         * smallCard2 : {"icon":"https://cdn.lishaoy.net/ctrip/yqzx.jpg","url":"https://smarket.ctrip.com/webapp/promocode/add?source=5","hideAppBar":true}
         * smallCard3 : {"icon":"https://cdn.lishaoy.net/ctrip/yqbzzc.jpg","url":"https://contents.ctrip.com/activitysetupapp/mkt/index/end","title":"活动"}
         * smallCard4 : {"icon":"https://cdn.lishaoy.net/ctrip/jxtjmp.jpg","url":"https://m.ctrip.com/webapp/ticket/index","hideAppBar":true}
         */

        private String icon;
        private String moreUrl;
        private BigCard1Bean bigCard1;
        private BigCard2Bean bigCard2;
        private SmallCard1Bean smallCard1;
        private SmallCard2Bean smallCard2;
        private SmallCard3Bean smallCard3;
        private SmallCard4Bean smallCard4;

        public static SalesBoxBean objectFromData(String str) {

            return new Gson().fromJson(str, SalesBoxBean.class);
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getMoreUrl() {
            return moreUrl;
        }

        public void setMoreUrl(String moreUrl) {
            this.moreUrl = moreUrl;
        }

        public BigCard1Bean getBigCard1() {
            return bigCard1;
        }

        public void setBigCard1(BigCard1Bean bigCard1) {
            this.bigCard1 = bigCard1;
        }

        public BigCard2Bean getBigCard2() {
            return bigCard2;
        }

        public void setBigCard2(BigCard2Bean bigCard2) {
            this.bigCard2 = bigCard2;
        }

        public SmallCard1Bean getSmallCard1() {
            return smallCard1;
        }

        public void setSmallCard1(SmallCard1Bean smallCard1) {
            this.smallCard1 = smallCard1;
        }

        public SmallCard2Bean getSmallCard2() {
            return smallCard2;
        }

        public void setSmallCard2(SmallCard2Bean smallCard2) {
            this.smallCard2 = smallCard2;
        }

        public SmallCard3Bean getSmallCard3() {
            return smallCard3;
        }

        public void setSmallCard3(SmallCard3Bean smallCard3) {
            this.smallCard3 = smallCard3;
        }

        public SmallCard4Bean getSmallCard4() {
            return smallCard4;
        }

        public void setSmallCard4(SmallCard4Bean smallCard4) {
            this.smallCard4 = smallCard4;
        }

        public static class BigCard1Bean {
            /**
             * icon : https://cdn.lishaoy.net/ctrip/yyfl.jpg
             * url : https://m.ctrip.com/webapp/membercenter/medical?pushcode=sy_rm1020
             * hideAppBar : true
             */

            private String icon;
            private String url;
            private boolean hideAppBar;

            public static BigCard1Bean objectFromData(String str) {

                return new Gson().fromJson(str, BigCard1Bean.class);
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isHideAppBar() {
                return hideAppBar;
            }

            public void setHideAppBar(boolean hideAppBar) {
                this.hideAppBar = hideAppBar;
            }
        }

        public static class BigCard2Bean {
            /**
             * icon : https://cdn.lishaoy.net/ctrip/bydlb.jpg
             * url : https://contents.ctrip.com/activitysetupapp/mkt/index/2020qyhbmfl?popup=close&pushcode=nn2025
             * title : 活动
             */

            private String icon;
            private String url;
            private String title;

            public static BigCard2Bean objectFromData(String str) {

                return new Gson().fromJson(str, BigCard2Bean.class);
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class SmallCard1Bean {
            /**
             * icon : https://cdn.lishaoy.net/ctrip/lxypth.png
             * url : https://m.ctrip.com/webapp/mall/index
             * hideAppBar : true
             */

            private String icon;
            private String url;
            private boolean hideAppBar;

            public static SmallCard1Bean objectFromData(String str) {

                return new Gson().fromJson(str, SmallCard1Bean.class);
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isHideAppBar() {
                return hideAppBar;
            }

            public void setHideAppBar(boolean hideAppBar) {
                this.hideAppBar = hideAppBar;
            }
        }

        public static class SmallCard2Bean {
            /**
             * icon : https://cdn.lishaoy.net/ctrip/yqzx.jpg
             * url : https://smarket.ctrip.com/webapp/promocode/add?source=5
             * hideAppBar : true
             */

            private String icon;
            private String url;
            private boolean hideAppBar;

            public static SmallCard2Bean objectFromData(String str) {

                return new Gson().fromJson(str, SmallCard2Bean.class);
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isHideAppBar() {
                return hideAppBar;
            }

            public void setHideAppBar(boolean hideAppBar) {
                this.hideAppBar = hideAppBar;
            }
        }

        public static class SmallCard3Bean {
            /**
             * icon : https://cdn.lishaoy.net/ctrip/yqbzzc.jpg
             * url : https://contents.ctrip.com/activitysetupapp/mkt/index/end
             * title : 活动
             */

            private String icon;
            private String url;
            private String title;

            public static SmallCard3Bean objectFromData(String str) {

                return new Gson().fromJson(str, SmallCard3Bean.class);
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class SmallCard4Bean {
            /**
             * icon : https://cdn.lishaoy.net/ctrip/jxtjmp.jpg
             * url : https://m.ctrip.com/webapp/ticket/index
             * hideAppBar : true
             */

            private String icon;
            private String url;
            private boolean hideAppBar;

            public static SmallCard4Bean objectFromData(String str) {

                return new Gson().fromJson(str, SmallCard4Bean.class);
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isHideAppBar() {
                return hideAppBar;
            }

            public void setHideAppBar(boolean hideAppBar) {
                this.hideAppBar = hideAppBar;
            }
        }
    }

    public static class SearchPlaceHolderListBean {
        /**
         * text : 超值星期三
         */

        private String text;

        public static SearchPlaceHolderListBean objectFromData(String str) {

            return new Gson().fromJson(str, SearchPlaceHolderListBean.class);
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class BannerListBean {
        /**
         * icon : https://dimg04.c-ctrip.com/images/zg041h000001hoqla603F.jpg
         * sIcon : https://cdn.lishaoy.net/ctrip/banner1.jpg
         * url : https://m.ctrip.com/webapp/you/gspoi/sight/0/5356386.html?seo=0
         */

        private String icon;
        private String sIcon;
        private String url;

        public static BannerListBean objectFromData(String str) {

            return new Gson().fromJson(str, BannerListBean.class);
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getSIcon() {
            return sIcon;
        }

        public void setSIcon(String sIcon) {
            this.sIcon = sIcon;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class LocalNavListBean {
        /**
         * icon : https://cdn.lishaoy.net/ctrip/lbsguide.png
         * title : 攻略·景点
         * url : https://m.ctrip.com/webapp/you/place/2.html?ishideheader=true&secondwakeup=true&dpclickjump=true&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
         * statusBarColor : ffffff
         * hideAppBar : true
         */

        private String icon;
        private String title;
        private String url;
        private String statusBarColor;
        private boolean hideAppBar;

        public static LocalNavListBean objectFromData(String str) {

            return new Gson().fromJson(str, LocalNavListBean.class);
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getStatusBarColor() {
            return statusBarColor;
        }

        public void setStatusBarColor(String statusBarColor) {
            this.statusBarColor = statusBarColor;
        }

        public boolean isHideAppBar() {
            return hideAppBar;
        }

        public void setHideAppBar(boolean hideAppBar) {
            this.hideAppBar = hideAppBar;
        }
    }

    public static class SubNavListBean {
        /**
         * icon : https://cdn.lishaoy.net/ctrip/freetravel.png
         * title : 自由行
         * url : https://m.ctrip.com/tangram/MjczNQ==?ctm_ref=vactang_page_2735&navBarStyle=white&secondwakeup=true&dpclickjump=true&allianceid=66672&sid=508670&from=https%3A%2F%2Fm.ctrip.com%2Fhtml5%2F
         * hideAppBar : true
         */

        private String icon;
        private String title;
        private String url;
        private boolean hideAppBar;

        public static SubNavListBean objectFromData(String str) {

            return new Gson().fromJson(str, SubNavListBean.class);
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isHideAppBar() {
            return hideAppBar;
        }

        public void setHideAppBar(boolean hideAppBar) {
            this.hideAppBar = hideAppBar;
        }
    }
}
