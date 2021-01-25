package com.umairjibran.mobiledevelopmentlabfinalexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UserHomeScreen extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_screen);
        listView = findViewById(R.id.listView);
        String[] listItems = {"Mouse","Keyboard","Monitor","Casing","Laptop","RAM","HDD","SSD","GPU","CPU","Speakers","Headphones"};
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(arrayAdapter);
    }
}