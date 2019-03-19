package com.cn.dafei.adapterPatterns;

public class Test {
    public static void main(String[] args) {
        SMSMessageAdapter smsAdapter=new SMSMessageAdapter();
        EmailMessageAdatper adapter=new EmailMessageAdatper();
        MessageService.sendMessage(smsAdapter);
        MessageService.sendMessage(adapter);

        MessageService.sendMessageCenter(SMSMessageAdapter.class);
    }
}
