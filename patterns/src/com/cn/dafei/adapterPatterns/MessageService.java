package com.cn.dafei.adapterPatterns;

public class MessageService {
    /*
     * @param adapter
     * @return
     */
    public static Object sendMessage(IMessageAdapter adapter){
        if(adapter.support(adapter)){
            adapter.sendMessage("发送消息数据");
        }
        return null;
    }

    public static void sendMessageCenter(Class<? extends IMessageAdapter> clazz){
        try{
            IMessageAdapter adapter= clazz.newInstance();
            if(adapter.support(adapter)){
                adapter.sendMessage("");
            }
        }catch (Exception e){

        }

    }

}
