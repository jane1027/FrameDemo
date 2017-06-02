package com.gvs.framedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @author jane
 * @time 2016/10/27  13:31
 * @desc ${TODD}
 */
public class MyBaseAdapter<T> extends BaseAdapter {
    public Context mContext;
    public final LayoutInflater mInflater;

    public MyBaseAdapter(Context c){
        mContext=c;
        mInflater = LayoutInflater.from(mContext);
    }
    public List<T> mDatas;
    @Override
    public int getCount() {
        return mDatas==null?0:mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
    public void setDatas(List<T> datas) {
        mDatas = datas;
    }

}
