package com.android.recyclerview.mvvm.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.recyclerview.mvvm.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView userlist;
    CustomAdapter customAdapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userlist = findViewById(R.id.userList);
        layoutManager = new LinearLayoutManager(this);
        userlist.setLayoutManager(layoutManager);
        customAdapter = new CustomAdapter(this);
        userlist.setAdapter(customAdapter);
    }
}
