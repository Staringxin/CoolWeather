package com.example.ryan.coolweather.gson;

/**
 * Created by Ryan on 2018/5/8.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
