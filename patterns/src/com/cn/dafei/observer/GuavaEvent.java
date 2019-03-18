package com.cn.dafei.observer;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    private  void  receiveMsg(GpQuestion question){
        System.out.println("提问者:"+question.getCreater()+" 问题："+question.getContent());
    }
}
