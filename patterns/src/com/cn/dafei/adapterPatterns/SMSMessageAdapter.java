package com.cn.dafei.adapterPatterns;

public class SMSMessageAdapter implements IMessageAdapter {
    @Override
    public boolean support(IMessageAdapter adapter) {
        return adapter instanceof SMSMessageAdapter;
    }

    @Override
    public Object sendMessage(Object data) {
        System.out.println("发送短信消息");
        return new Object();
    }
}
