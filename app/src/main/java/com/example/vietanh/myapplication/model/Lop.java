package com.example.vietanh.myapplication.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Lenovo G480-16 on 4/15/2017.
 */

public class Lop implements Serializable {
     private static final long serialVersionUID = 1L;
     private String tenLop;
     ArrayList<SinhVien> arrSV;

    public Lop(String tenLop, ArrayList<SinhVien> arrSV) {
        this.tenLop = tenLop;
        this.arrSV = arrSV;
    }

    public ArrayList<SinhVien> getListSinhVien()
    {
        return this.arrSV;
    }

    public Lop(String tenLop){
        this.tenLop = tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

}
