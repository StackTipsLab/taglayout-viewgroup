package com.javatechig.taglayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TagLayout tagLayout = (TagLayout) findViewById(R.id.tagLayout);
        LayoutInflater layoutInflater = getLayoutInflater();
        String tag;
        for (int i = 0; i <= 20; i++) {
            tag = "#tag" + i;
            View tagView = layoutInflater.inflate(R.layout.tag_layout, null, false);

            TextView tagTextView = (TextView) tagView.findViewById(R.id.tagTextView);
            tagTextView.setText(tag);
            tagLayout.addView(tagView);
        }
    }
}
