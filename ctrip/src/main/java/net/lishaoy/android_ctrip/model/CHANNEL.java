package net.lishaoy.android_ctrip.model;

public enum CHANNEL {

  HOME("首页", 0x01),

  DESTINATION("目的地", 0x02),

  TRAVEL("旅拍", 0x03),

  MY("我的", 0x04);

  //所有类型标识
  public static final int HOME_ID = 0x01;
  public static final int DESTINATION_ID = 0x02;
  public static final int TRAVEL_ID = 0x03;
  public static final int MY_ID = 0x04;

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
