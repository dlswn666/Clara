package com.example.clara;


import android.os.Handler;
import android.os.Message;

public class ClaraIntroThread extends Thread{

    private Handler handler;

    public ClaraIntroThread(Handler handler){
        this.handler = handler;
    }

    @Override
    public void run() { // Activity 또는 class에서 thread 객체를 생성, start() 메소드를 호출했을 때 실행되는 메소드

        Message msg = new Message();

        try {
            Thread.sleep(3000);
            msg.what = 1;
            handler.sendEmptyMessage(msg.what);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
