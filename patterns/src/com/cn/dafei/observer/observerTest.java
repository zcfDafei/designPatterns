package com.cn.dafei.observer;

import com.google.common.eventbus.EventBus;

public class observerTest {
    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post(new GpQuestion("stu1","老师，guava还有其他用法吗？"));
    }
}
