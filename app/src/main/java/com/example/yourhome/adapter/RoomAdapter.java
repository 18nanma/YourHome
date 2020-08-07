package com.example.yourhome.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yourhome.R;
import com.example.yourhome.model.Model;

import java.util.ArrayList;

public class RoomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Model> models;

    public RoomAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = View.inflate(context, R.layout.list_items, null);
        }

        ImageView images = view.findViewById(R.id.room_image_view);
        TextView title = view.findViewById(R.id.room_name);
        TextView des = view.findViewById(R.id.room_des);

        Model model = models.get(i);
        images.setImageResource(model.getRoomImage());
        title.setText(model.getRoomTitle());
        des.setText(model.getAboutRoom());

        return view;
    }
}
