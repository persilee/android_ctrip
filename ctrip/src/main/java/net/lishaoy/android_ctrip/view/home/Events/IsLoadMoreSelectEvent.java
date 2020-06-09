package net.lishaoy.android_ctrip.view.home.Events;

public class IsLoadMoreSelectEvent {
    boolean isLoad;

    public IsLoadMoreSelectEvent(boolean isLoad) {
        this.isLoad = isLoad;
    }

    public boolean isLoad() {
        return isLoad;
    }

    public void setLoad(boolean load) {
        isLoad = load;
    }
}
