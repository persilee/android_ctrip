package net.lishaoy.android_ctrip.events;

public class GotoSpeakTravelPageEvent {
    String pageType;

    public GotoSpeakTravelPageEvent(String pageType) {
        this.pageType = pageType;
    }

    public String getPageType() {
        return pageType;
    }
}
