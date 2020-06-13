package net.lishaoy.ft_home.model;

import com.google.gson.Gson;

import java.util.List;

public class TabSelectRequest {

    /**
     * pageid : 10320662472
     * searchtype : 1
     * districtid : 26
     * needfact : false
     * sort : 1
     * pidx : 2
     * isintion : true
     * psize : 20
     * imagesize : C_230_260
     * reltype : 0
     * assistfilter : {"userChooseSite":"26"}
     * spara :
     * filters : []
     * excepts : []
     * abtests : []
     * extendAssociation : [{"key":"srhtraceid","value":"b6841f25-67bf-3789-4c50-159138ff5300"}]
     * contentType : json
     * head : {"cid":"09031043410934928682","ctok":"","cver":"1.0","lang":"01","sid":"8888","syscode":"09","auth":"","extension":[{"name":"protocal","value":"https"}]}
     * ver : 7.14.2
     */

    private long pageid;
    private int searchtype;
    private int districtid;
    private boolean needfact;
    private int sort;
    private int pidx;
    private boolean isintion;
    private int psize;
    private String imagesize;
    private int reltype;
    private AssistfilterBean assistfilter;
    private String spara;
    private String contentType;
    private HeadBean head;
    private String ver;
    private List<?> filters;
    private List<?> excepts;
    private List<?> abtests;
    private List<ExtendAssociationBean> extendAssociation;

    public static TabSelectRequest objectFromData(String str) {

        return new Gson().fromJson(str, TabSelectRequest.class);
    }

    public long getPageid() {
        return pageid;
    }

    public void setPageid(long pageid) {
        this.pageid = pageid;
    }

    public int getSearchtype() {
        return searchtype;
    }

    public void setSearchtype(int searchtype) {
        this.searchtype = searchtype;
    }

    public int getDistrictid() {
        return districtid;
    }

    public void setDistrictid(int districtid) {
        this.districtid = districtid;
    }

    public boolean isNeedfact() {
        return needfact;
    }

    public void setNeedfact(boolean needfact) {
        this.needfact = needfact;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getPidx() {
        return pidx;
    }

    public void setPidx(int pidx) {
        this.pidx = pidx;
    }

    public boolean isIsintion() {
        return isintion;
    }

    public void setIsintion(boolean isintion) {
        this.isintion = isintion;
    }

    public int getPsize() {
        return psize;
    }

    public void setPsize(int psize) {
        this.psize = psize;
    }

    public String getImagesize() {
        return imagesize;
    }

    public void setImagesize(String imagesize) {
        this.imagesize = imagesize;
    }

    public int getReltype() {
        return reltype;
    }

    public void setReltype(int reltype) {
        this.reltype = reltype;
    }

    public AssistfilterBean getAssistfilter() {
        return assistfilter;
    }

    public void setAssistfilter(AssistfilterBean assistfilter) {
        this.assistfilter = assistfilter;
    }

    public String getSpara() {
        return spara;
    }

    public void setSpara(String spara) {
        this.spara = spara;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public HeadBean getHead() {
        return head;
    }

    public void setHead(HeadBean head) {
        this.head = head;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public List<?> getFilters() {
        return filters;
    }

    public void setFilters(List<?> filters) {
        this.filters = filters;
    }

    public List<?> getExcepts() {
        return excepts;
    }

    public void setExcepts(List<?> excepts) {
        this.excepts = excepts;
    }

    public List<?> getAbtests() {
        return abtests;
    }

    public void setAbtests(List<?> abtests) {
        this.abtests = abtests;
    }

    public List<ExtendAssociationBean> getExtendAssociation() {
        return extendAssociation;
    }

    public void setExtendAssociation(List<ExtendAssociationBean> extendAssociation) {
        this.extendAssociation = extendAssociation;
    }

    public static class AssistfilterBean {
        /**
         * userChooseSite : 26
         */

        private String userChooseSite;

        public static AssistfilterBean objectFromData(String str) {

            return new Gson().fromJson(str, AssistfilterBean.class);
        }

        public String getUserChooseSite() {
            return userChooseSite;
        }

        public void setUserChooseSite(String userChooseSite) {
            this.userChooseSite = userChooseSite;
        }
    }

    public static class HeadBean {
        /**
         * cid : 09031043410934928682
         * ctok :
         * cver : 1.0
         * lang : 01
         * sid : 8888
         * syscode : 09
         * auth :
         * extension : [{"name":"protocal","value":"https"}]
         */

        private String cid;
        private String ctok;
        private String cver;
        private String lang;
        private String sid;
        private String syscode;
        private String auth;
        private List<ExtensionBean> extension;

        public static HeadBean objectFromData(String str) {

            return new Gson().fromJson(str, HeadBean.class);
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getCtok() {
            return ctok;
        }

        public void setCtok(String ctok) {
            this.ctok = ctok;
        }

        public String getCver() {
            return cver;
        }

        public void setCver(String cver) {
            this.cver = cver;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getSyscode() {
            return syscode;
        }

        public void setSyscode(String syscode) {
            this.syscode = syscode;
        }

        public String getAuth() {
            return auth;
        }

        public void setAuth(String auth) {
            this.auth = auth;
        }

        public List<ExtensionBean> getExtension() {
            return extension;
        }

        public void setExtension(List<ExtensionBean> extension) {
            this.extension = extension;
        }

        public static class ExtensionBean {
            /**
             * name : protocal
             * value : https
             */

            private String name;
            private String value;

            public static ExtensionBean objectFromData(String str) {

                return new Gson().fromJson(str, ExtensionBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    public static class ExtendAssociationBean {
        /**
         * key : srhtraceid
         * value : b6841f25-67bf-3789-4c50-159138ff5300
         */

        private String key;
        private String value;

        public static ExtendAssociationBean objectFromData(String str) {

            return new Gson().fromJson(str, ExtendAssociationBean.class);
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
