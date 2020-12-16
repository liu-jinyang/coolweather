package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

// LitePal实体类需要继承DataSupport
public class Province extends DataSupport {

    private int id;

    private String provinceName; // 省名字

    private int provinceCode; // 省编号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
