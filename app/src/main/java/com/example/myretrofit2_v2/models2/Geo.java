
package com.example.myretrofit2_v2.models2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Geo {
    // 스네이크 케이스 phone_number
    // 카멜 케이스 phoneName

    @SerializedName("lat")
    @Expose
    private String lat;

    @SerializedName("lng")
    @Expose
    private String lng;


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

}
