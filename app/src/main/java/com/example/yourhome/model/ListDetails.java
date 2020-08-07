package com.example.yourhome.model;

import com.example.yourhome.R;

import java.util.ArrayList;

public class ListDetails {

    public static ArrayList<Model> getList(){

        ArrayList<Model> roomList = new ArrayList<>();
        roomList.add(new Model(R.drawable.king, "King Room", "Pillow Covers, Sheets, Medicines"));
        roomList.add(new Model(R.drawable.queen, "Queen Room", "Magazine Covers, Sheets, Medicines, dresses"));
        roomList.add(new Model(R.drawable.princess, "Princess Room", "Dresses, paints, Medicines"));
        roomList.add(new Model(R.drawable.prince, "Prince Room", "Game Boards, Sheets, Medicines"));

        return roomList;
    }

}
