package com.andyantonement.simulator.domain;

import com.google.gson.annotations.SerializedName;

public class Place {
    @SerializedName("name")
    private String name;
    @SerializedName("image")
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
