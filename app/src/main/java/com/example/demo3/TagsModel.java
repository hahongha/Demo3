package com.example.demo3;

import android.graphics.Color;

public class TagsModel {
    private String tagContent;
    private int logoContent;

    private Color colorContent;

    public TagsModel(String content, int logo){
        this.tagContent= content;
        this.logoContent= logo;
    }


    public int getLogoContent() {
        return logoContent;
    }

    public void setLogoContent(int logoContent) {
        this.logoContent = logoContent;
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent;
    }

    public Color getColorContent() {
        return colorContent;
    }

    public void setColorContent(Color colorContent) {
        this.colorContent = colorContent;
    }
}
