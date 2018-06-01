package org.greenrobot.eventbus;

/**
 * @author fujinhu
 * @date 2018/5/30
 * @desc
 */

public class XEventObject {
    public Object subscriber;

    public XEventObject(Object subscriber) {
        this.subscriber = subscriber;
    }

    public XEventObject(IXEventSubsciber subscriber) {
        this.subscriber = subscriber;
    }

}
