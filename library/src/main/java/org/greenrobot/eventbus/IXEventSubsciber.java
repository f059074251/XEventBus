package org.greenrobot.eventbus;

/**
 * @author fujinhu
 * @date 2018/6/1
 * @desc
 */

public interface IXEventSubsciber {
    /**
     * @return 区分发送者到底选择哪个订阅者
     */
    Object getId();
}
