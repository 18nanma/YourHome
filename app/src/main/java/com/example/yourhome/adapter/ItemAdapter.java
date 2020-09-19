package com.example.yourhome.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yourhome.R;
import com.example.yourhome.model.ItemModel;
import com.example.yourhome.model.Model;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ItemModel> item_models;

    public ItemAdapter(Context context, ArrayList<ItemModel> item_models) {
        this.context = context;
        this.item_models = item_models;
    }

    @Override
    public int getCount() {
        return item_models.size();
    }

    @Override
    public Object getItem(int i) {
        return item_models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = View.inflate(context, R.layout.items_list_items, null);
        }

        ImageView images = view.findViewById(R.id.item_image_view);
        TextView title = view.findViewById(R.id.item_name);
        TextView des = view.findViewById(R.id.item_des);

        ItemModel item_model = item_models.get(i);
        images.setImageResource(item_model.getItemImage());
        title.setText(item_model.getItemTitle());
        des.setText(item_model.getAboutItem());

        return view;
    }
}
