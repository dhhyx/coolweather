package com.dhhyx.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String cointyName;      //县的名字
    private String weatherId;       //县所对应的天气id
    private int cityId;             //当前所属市的id值


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCointyName() {
        return cointyName;
    }

    public void setCointyName(String cointyName) {
        this.cointyName = cointyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
