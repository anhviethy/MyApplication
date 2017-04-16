package com.example.vietanh.myapplication.model;

import java.io.Serializable;

/**
 * Created by Lenovo G480-16 on 4/15/2017.
 */

public class SinhVien implements Serializable {
    private static final long serialVersionUID = 1L;
    private  String ms;
    private  String ten;
    private  String ngaySinh;

    public SinhVien(String ms, String ten, String ngaySinh) {
        this.ms = ms;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String toString(){
        return this.ms + " - " + this.ten + " - " + this.ngaySinh;
    }
}
