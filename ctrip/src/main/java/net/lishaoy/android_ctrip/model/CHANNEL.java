package net.lishaoy.android_ctrip.model;

public enum CHANNEL {

    HOME("首页", 0x01),

    DESTINATION("目的地", 0x02),

    TRAVEL("旅拍", 0x03),

    MY("我的", 0x04),

    SELECT("精选", 0x05),

    NEAR("附近", 0x06),

    SCENIC("景点", 0x07),

    FOOD("美食", 0x08),

    SELECT_SUB("当地玩法", 0x09),

    NEAR_SUB("探索周边", 0x10),

    SCENIC_SUB("尽情游览", 0x11),

    FOOD_SUB("地道风味", 0x12);

    //所有类型标识
    public static final int HOME_ID = 0x01;
    public static final int DESTINATION_ID = 0x02;
    public static final int TRAVEL_ID = 0x03;
    public static final int MY_ID = 0x04;
    public static final int SELECT_ID = 0x05;
    public static final int NEAR_ID = 0x06;
    public static final int SCENIC_ID = 0x07;
    public static final int FOOD_ID = 0x08;
    public static final int SELECT_SUB_ID = 0x09;
    public static final int NEAR_SUB_ID = 0x10;
    public static final int SCENIC_SUB_ID = 0x11;
    public static final int FOOD_SUB_ID = 0x12;

    private final String key;
    private final int value;

    CHANNEL(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
}
