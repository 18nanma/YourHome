package com.example.yourhome.model;

public class Model {

    private int roomImage;
    private String roomTitle;
    private String aboutRoom;

    public Model(int roomImage, String roomTitle, String aboutRoom) {
        this.roomImage = roomImage;
        this.roomTitle = roomTitle;
        this.aboutRoom = aboutRoom;
    }

    public int getRoomImage() {
        return roomImage;
    }

    public void setRoomImage(int roomImage) {
        this.roomImage = roomImage;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public String getAboutRoom() {
        return aboutRoom;
    }

    public void setAboutRoom(String aboutRoom) {
        this.aboutRoom = aboutRoom;
    }
}
