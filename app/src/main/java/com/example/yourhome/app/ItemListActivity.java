package com.example.yourhome.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.yourhome.R;
import com.example.yourhome.adapter.ItemAdapter;
import com.example.yourhome.adapter.RoomAdapter;
import com.example.yourhome.model.ItemListDetails;
import com.example.yourhome.model.ItemModel;
import com.example.yourhome.model.ListDetails;
import com.example.yourhome.model.Model;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ItemListActivity extends AppCompatActivity {

    private ListView itemlistView;
    private ArrayList<ItemModel> item_models;
    private ItemAdapter itemAdapter;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        itemlistView = findViewById(R.id.item_list_view);
        item_models = ItemListDetails.getList();

        itemAdapter = new ItemAdapter(ItemListActivity.this, item_models);
        itemlistView.setAdapter(itemAdapter);

        fab = findViewById(R.id.floating_action_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}