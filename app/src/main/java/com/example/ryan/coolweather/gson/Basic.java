package com.example.ryan.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ryan on 2018/5/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}