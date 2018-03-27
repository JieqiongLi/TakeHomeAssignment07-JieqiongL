package com.test.jq.takehomeassignment07_jieqiongl;

/**
 * Created by IBM on 25/03/2018.
 */

public class Wand {
    public String name;
    public String info;
    public int imageId;

    public Wand(String name, String info, int imageId){
        this.name =name;
        this.info =info;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
