package com.softwareonze.deliveryparagominas.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

import com.softwareonze.deliveryparagominas.R;

public class ToddysActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toddys);

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("Tab Primeira");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab 1");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Tab Segunda");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab 2");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Tab Terceira");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab 3");
        tabHost.addTab(spec);

    }
}
