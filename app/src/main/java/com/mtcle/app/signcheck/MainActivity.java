package com.mtcle.app.signcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_content;
    private ListAdapter listAdapter;
    private List<AppInfo> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_content = (ListView) findViewById(R.id.lv_content);
        listAdapter = new ListAdapter(this, mData);
        lv_content.setAdapter(listAdapter);
        mData = SignUtils.getPackages(this);
        listAdapter.clearAndAppendData(mData);
    }
}
