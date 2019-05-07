package com.example.bookshelf;

/**
 * Created by ZKF on 2019/5/7.
 */

public class Item {

    private int iconId;
    private String iconName;

    public Item(){
    }

    public Item(int iconId,String iconName){
        this.iconId=iconId;
        this.iconName=iconName;
    }

    public int getIconId(){
        return iconId;
    }

    public String getIconName(){
        return iconName;
    }

    public void setIconId(int iconId){
        this.iconId=iconId;
    }

    public void setIconName(String iconName){
        this.iconName=iconName;
    }
}
