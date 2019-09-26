package com.moredian.entrance.eventbustest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void send(View view) {
        EventBus.getDefault().post(new MessageEvent("你好呀！我叫SecondActivity"));
        finish();
    }

    public void sendSpecial(View view) {
        EventBus.getDefault().postSticky(new MessageEvent("你好呀！我想你扔了一个黏黏的消息"));
        finish();
    }
}
