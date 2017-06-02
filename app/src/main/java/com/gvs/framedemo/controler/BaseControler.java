package com.gvs.framedemo.controler;

import android.content.Context;

import com.gvs.framedemo.listener.IModeChangeListener;


/**
 * @author jane
 * @time 2016/10/25  12:00
 * @desc ${TODD}
 */
public abstract class BaseControler {
    protected Context mContext;
    public BaseControler(Context c) {
        mContext=c;
    }
    protected IModeChangeListener mListener;

    public   void setImodeChangeListener(IModeChangeListener listener){
        mListener=listener;
    }

public  abstract  void  handlemessage(int action,Object...values);


    public void sendAsyncMessage(final int action , final Object...values){
        new Thread(){
            @Override
            public void run() {
                handlemessage(action,values);
            }
        }.start();
    }


}
