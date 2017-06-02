package com.gvs.framedemo.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.Toast;

public abstract class BaseActivity extends FragmentActivity {


    Handler mHandler= new Handler(){
        @Override
        public void handleMessage(Message msg) {
           handlerMessage(msg);
        }
    };

    protected void handlerMessage(Message msg) {

    }
  protected   abstract void initView();
    protected void initControler(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
    public  void tip(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void onIModeChange(int action, Object... values) {
        mHandler.obtainMessage(action,values[0]).sendToTarget();
    }
}

