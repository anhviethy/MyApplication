package com.example.vietanh.myapplication.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Lenovo G480-16 on 4/16/2017.
 */

public class Mon implements Serializable {
    private String ten;
    private ArrayList<Lop> arrLop;

    public Mon(String ten, ArrayList<Lop> arrLop) {
        this.ten = ten;
        this.arrLop = arrLop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<Lop> getArrLop() {
        return arrLop;
    }

    public void setArrLop(ArrayList<Lop> arrLop) {
        this.arrLop = arrLop;
    }
}
