package com.young.listitem.style1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import com.young.listitem.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/26  22:38
 */
public class ListItemStyle1Adapter extends BaseAdapter {

    private Context mContext;
    private List<String> mDatas;

    public ListItemStyle1Adapter(Context context, List<String> datas) {
        this.mContext = context;
        if( datas != null ){
            this.mDatas = datas;
        }else{
            this.mDatas = new ArrayList<String>();
        }
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if( view == null ){
            view = LayoutInflater.from(mContext).inflate(R.layout.view_list_item_style1, viewGroup, false);
        }
        ((ListItemStyle1View) view).resetView(mDatas.get(i));

        return view;
    }
}
