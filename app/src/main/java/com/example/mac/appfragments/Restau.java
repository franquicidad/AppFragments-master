package com.example.mac.appfragments;

/**
 * Created by mac on 23/07/17.
 */

public class Restau  {

    private int ImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private String resText;

    public Restau(int imageResourceId, String resText) {
        ImageResourceId = imageResourceId;
        this.resText = resText;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        ImageResourceId = imageResourceId;
    }

    public String getResText() {
        return resText;
    }

    public void setResText(String resText) {
        this.resText = resText;
    }

    public boolean hasImage(){
        return ImageResourceId!=NO_IMAGE_PROVIDED;

    }
}
