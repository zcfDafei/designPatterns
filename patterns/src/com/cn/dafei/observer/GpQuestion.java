package com.cn.dafei.observer;

public class GpQuestion {
    private String creater;
    private String content;

    public  GpQuestion(String creater,String content){
        this.creater=creater;
        this.content=content;
    }
    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
