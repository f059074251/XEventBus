package com.tiger.xeventbus.test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tiger.xeventbus.R;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.XEventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XEventBus.getDefault().register(this);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                XEventBus.getDefault().post(new Test(MainActivity.this));
            }
        }, 10000);
    }

    /**
     * 接收极光推送来的通知，并刷新通知数量接口
     *
     * @param refreshEvent
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void NoticeRefresh(Test refreshEvent) {
         System.out.println("#test");
    }
}
