package com.young.listitem.style1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.young.listitem.R;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/6/26  23:34
 */
public class ListItemStyle1View extends LinearLayout {

    private Context mContext;

    private ImageView logoIv;
    private TextView contentTv, timeTv, commentTv;
    private ImageView favoriteIv;
    private LinearLayout commentLl;

    public ListItemStyle1View(Context context) {
        super(context);
        this.mContext = context;
        initComponent();
    }

    public ListItemStyle1View(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initComponent();
    }

    public ListItemStyle1View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initComponent();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initComponent();
    }

    private void initComponent() {
        logoIv = (ImageView) findViewById(R.id.iv_list_item_style1_logo);
        favoriteIv = (ImageView) findViewById(R.id.iv_list_item_style1_favorite);
        contentTv = (TextView) findViewById(R.id.tv_list_item_style1_content);
        timeTv = (TextView) findViewById(R.id.tv_list_item_style1_time);
        commentLl = (LinearLayout) findViewById(R.id.ll_list_item_style1_comment);
        commentTv = (TextView) findViewById(R.id.tv_list_item_style1_comment);
    }

    public void resetView(String data) {
        if( data.equals("1") ){
            contentTv.setText("Old City Hotel");
            commentTv.setText("22 reviews");
            favoriteIv.setImageResource(R.mipmap.ic_favorite_unset);
            timeTv.setText("Today");
            logoIv.setImageResource(R.mipmap.item01);
        }else if( data.equals("2") ){
            contentTv.setText("Hills Haven");
            commentTv.setText("75 reviews");
            favoriteIv.setImageResource(R.mipmap.ic_favorite_set);
            timeTv.setText("Yesterday");
            logoIv.setImageResource(R.mipmap.item02);
        }

    }
}
