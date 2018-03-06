package com.example.jdemu.pruebat2jorgemurga;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ScrollView;
import android.widget.Toast;

public class MyMain extends AppCompatActivity {
    SwipeRefreshLayout swipeRefreshLayout;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);

        swipeRefreshLayout= (SwipeRefreshLayout)findViewById(R.id.swipe) ;
        scrollView=(ScrollView)findViewById(R.id.scroll);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getApplicationContext(), "Se ha refrescado", Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menumai, menu);
        return true;
    }
}
