package com.moredian.entrance.eventbustest;

/**
 * description ：
 * author : scy
 * email : 1797484636@qq.com
 * date : 2019/9/26 14:38
 */
public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
