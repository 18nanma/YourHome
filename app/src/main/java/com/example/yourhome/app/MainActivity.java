package com.example.yourhome.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;
import com.example.yourhome.R;
import com.example.yourhome.adapter.RoomAdapter;
import com.example.yourhome.model.ListDetails;
import com.example.yourhome.model.Model;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Model> models;
    private RoomAdapter roomAdapter;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        models = ListDetails.getList();

        roomAdapter = new RoomAdapter(MainActivity.this, models);
        listView.setAdapter(roomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ItemListActivity.class);
                intent.putExtra("roomId", i);
                startActivity(intent);
            }
        });
        fab = findViewById(R.id.floating_action_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }




}