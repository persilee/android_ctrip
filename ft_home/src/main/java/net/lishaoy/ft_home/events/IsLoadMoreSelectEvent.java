package net.lishaoy.ft_home.events;

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
