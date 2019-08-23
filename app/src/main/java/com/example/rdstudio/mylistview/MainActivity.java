package com.example.rdstudio.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // dummy data list view
    //private String[] dataName = {"Cut Nyak Dien", "Ki Hajar Dewantara", "Moh Yamin", "Patimura", "R A Kartini", "Sukarno"};

    // Call Adapter to mainView
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private HeroAdapter heroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * dummy main view
        ListView listView = findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, dataName);
        listView.setAdapter(adapter);*/

        heroAdapter = new HeroAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(heroAdapter);

    }
}
