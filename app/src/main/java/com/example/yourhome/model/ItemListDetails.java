package com.example.yourhome.model;

import com.example.yourhome.R;

import java.util.ArrayList;

public class ItemListDetails {

    public static ArrayList<ItemModel> getList(){

        ArrayList<ItemModel> itemList = new ArrayList<>();
        itemList.add(new ItemModel(R.drawable.king, "Shirt", "Pillow Covers, Sheets, Medicines"));
        itemList.add(new ItemModel(R.drawable.queen, "Pant", "Magazine Covers, Sheets, Medicines, dresses"));
        itemList.add(new ItemModel(R.drawable.princess, "Watch", "Dresses, paints, Medicines"));
        itemList.add(new ItemModel(R.drawable.prince, "Pen", "Game Boards, Sheets, Medicines"));

        return itemList;
    }
}
