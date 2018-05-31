package org.greenrobot.eventbus;

/**
 * @author fujinhu
 * @date 2018/5/30
 * @desc
 */

public class XEventBus extends EventBus {
    public XEventBus() {
        super();
    }

    public static EventBus getDefault() {
        if (defaultInstance instanceof XEventBus) {
            return defaultInstance;
        }
        final XEventBus xEventBus = new XEventBus();
        EventBus.getDefault();
        return (defaultInstance = xEventBus);
    }

    @Override
    void invokeSubscriber(Subscription subscription, Object event) {
        if (event instanceof XEventObject) {
            Object subscriber = ((XEventObject) event).subscriber;
            if (subscription.subscriber != null && subscription == subscriber) {
                super.invokeSubscriber(subscription, event);
            }
        } else {
            super.invokeSubscriber(subscription, event);
        }
    }
}
