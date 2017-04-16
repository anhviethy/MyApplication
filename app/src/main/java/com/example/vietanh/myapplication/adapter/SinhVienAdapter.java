package com.example.vietanh.myapplication.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.vietanh.myapplication.R;
import com.example.vietanh.myapplication.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo G480-16 on 4/15/2017.
 */

public class SinhVienAdapter extends ArrayAdapter<SinhVien> {
    private Context context;
    private int resource;
    private ArrayList<SinhVien> arrSv;
    private TextView tv;
    public SinhVienAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<SinhVien> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrSv = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.layout_dssv,parent,false);
        tv = (TextView) convertView.findViewById(R.id.tv_sv);
        SinhVien sv = arrSv.get(position);
        String ttSv = sv.toString();
        tv.setText(ttSv);
        return convertView;
    }
}
