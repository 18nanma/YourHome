package com.example.yourhome.model;

public class ItemModel {

    private int itemImage;
    private String itemTitle;
    private String aboutItem;

    public ItemModel(int itemImage, String itemTitle, String aboutItem) {
        this.itemImage = itemImage;
        this.itemTitle = itemTitle;
        this.aboutItem = aboutItem;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getAboutItem() {
        return aboutItem;
    }

    public void setAboutItem(String aboutItem) {
        this.aboutItem = aboutItem;
    }
}
