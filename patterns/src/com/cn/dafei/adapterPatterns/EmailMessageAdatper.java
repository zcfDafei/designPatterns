package com.cn.dafei.adapterPatterns;

import java.util.Map;

public class EmailMessageAdatper implements IMessageAdapter{


    @Override
    public boolean support(IMessageAdapter adapter) {
        return adapter instanceof EmailMessageAdatper;
    }

    @Override
    public Object sendMessage(Object data) {
        System.out.println("发送email消息");
        return new Object();
    }
}
