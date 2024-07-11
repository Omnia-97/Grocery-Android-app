package com.example.thegroceryapp;

public class ItemModel {
    int itemImage;
    String itemTitle, itemDes ;

    public ItemModel(int itemImage, String itemTitle, String itemDes) {
        this.itemImage = itemImage;
        this.itemTitle = itemTitle;
        this.itemDes = itemDes;
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

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }
}
