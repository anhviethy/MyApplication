package com.example.vietanh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vietanh.myapplication.adapter.SinhVienAdapter;
import com.example.vietanh.myapplication.model.Lop;
import com.example.vietanh.myapplication.model.SinhVien;

import java.util.ArrayList;

public class DssvActivity extends AppCompatActivity {
    ListView lv_sv;
    SinhVienAdapter adapter;
    ArrayList<SinhVien> arrSV = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dssv);
        getDssvFromLopActivity();
        lv_sv.setAdapter(adapter);
    }

    public void getDssvFromLopActivity(){
        lv_sv = (ListView) findViewById(R.id.lv_sv);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("SV");
        Lop l = (Lop) bundle.getSerializable("LOP");
        arrSV = l.getListSinhVien();
        adapter = new SinhVienAdapter(this,R.layout.layout_dssv,arrSV);
    }
}
