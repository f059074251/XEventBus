package com.tiger.xeventbus.test;

import org.greenrobot.eventbus.XEventObject;

/**
 * @author fujinhu
 * @date 2018/5/30
 * @desc
 */

public class Test extends XEventObject {
    public Test(Object subscriber) {
        super(subscriber);
    }
}
