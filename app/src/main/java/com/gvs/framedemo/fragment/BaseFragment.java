package com.gvs.framedemo.fragment;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;

import com.gvs.framedemo.listener.IModeChangeListener;


public abstract class BaseFragment extends Fragment implements IModeChangeListener {

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            handlerMessage(msg);
        }
    };

    protected  void handlerMessage(Message msg){

    }


    protected void initControler() {

    }

    protected abstract void initView();


    @Override
    public void onIModeChange(int action, Object... values) {
        mHandler.obtainMessage(action, values[0]).sendToTarget();
    }
}
