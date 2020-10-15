package com.young.listitem.style1;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.young.listitem.R;

import java.util.ArrayList;
import java.util.List;

public class ListItemStyle1Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_style1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initComponent();
    }

    private void initComponent() {

        List<String> mDatas =  new ArrayList<String>();
        mDatas.add("1");
        mDatas.add("2");
        listView = (ListView) findViewById(R.id.lv_list_item_style1);
        listView.setAdapter(new ListItemStyle1Adapter(this, mDatas));
    }

}
