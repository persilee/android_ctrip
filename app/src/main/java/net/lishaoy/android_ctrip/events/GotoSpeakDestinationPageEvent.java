package net.lishaoy.android_ctrip.events;

public class GotoSpeakDestinationPageEvent {
    String pageType;

    public GotoSpeakDestinationPageEvent(String pageType) {
        this.pageType = pageType;
    }

    public String getPageType() {
        return pageType;
    }
}
