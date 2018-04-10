package com.example.android.praguetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MonumentsFragment())
                .commit();
    }
}