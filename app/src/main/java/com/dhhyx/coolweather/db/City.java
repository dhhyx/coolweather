package com.dhhyx.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {


    private int id;
    private String cityName;        //市的名字
    private int cityCity;           //市的代号
    private int provinceId;         //当前市所属省的id


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCity() {
        return cityCity;
    }

    public void setCityCity(int cityCity) {
        this.cityCity = cityCity;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
