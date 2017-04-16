package com.example.vietanh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.vietanh.myapplication.model.Lop;
import com.example.vietanh.myapplication.model.Mon;
import com.example.vietanh.myapplication.model.SinhVien;

import java.util.ArrayList;

public class DsMonActivity extends AppCompatActivity {
    ListView lv_mon;
    ArrayAdapter adapter;
    ArrayList<Mon> arrMon;
    ArrayList<String> tenMon;
    Mon monSelected = null;
    ArrayList<Lop> arrLop1,arrLop2,arrLop3;
    ArrayList<SinhVien> arrSv1,arrSv2,arrSv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds_mon);
        lv_mon = (ListView) findViewById(R.id.lv_mon);
        tenMon = new ArrayList<>();
        arrMon = new ArrayList<>();
        addMon();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tenMon);
        lv_mon.setAdapter(adapter);
        lv_mon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                monSelected = arrMon.get(i);
                return false;
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.dsl, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case R.id.ds:
            {
                doDanhSachLop();
                break;
            }
        }
        return super.onContextItemSelected(item);
    }

    public void doDanhSachLop() {

    }

    public void addMon(){
        arrLop1 = new ArrayList<>();
        arrLop2 = new ArrayList<>();
        arrLop3 = new ArrayList<>();
        Mon mon1 = new Mon("Android",arrLop1);
        Mon mon2 = new Mon("Mang May Tinh",arrLop2);
        Mon mon3 = new Mon("VLSI",arrLop3);
        tenMon.add(mon1.getTen());
        tenMon.add(mon2.getTen());
        tenMon.add(mon3.getTen());
    }

    public void addLop(){
        addSv();
        Lop dt01 = new Lop("dt01",arrSv1);
        Lop dt02 = new Lop("dt02",arrSv2);
        Lop dt03 = new Lop("dt03",arrSv3);
    }

    public void addSv(){
        arrSv1 = new ArrayList<>();
        arrSv2 = new ArrayList<>();
        arrSv3 = new ArrayList<>();

        // Lop dt01
        arrSv1.add(new SinhVien("1","Viet Anh","07/05/1995"));
        arrSv1.add(new SinhVien("2","Dung","07/05/1995"));
        arrSv1.add(new SinhVien("3","Hai","07/05/1995"));
        arrSv1.add(new SinhVien("4","Phu","07/05/1995"));
        arrSv1.add(new SinhVien("5","Truong","07/05/1995"));
        arrSv1.add(new SinhVien("6","Duc","07/05/1995"));
        // Lop dt02
        arrSv2.add(new SinhVien("1","Viet Anh","07/05/1995"));
        arrSv2.add(new SinhVien("2","Dung","07/05/1995"));
        arrSv2.add(new SinhVien("3","Hai","07/05/1995"));
        arrSv2.add(new SinhVien("4","Phu","07/05/1995"));
        arrSv2.add(new SinhVien("5","Truong","07/05/1995"));
        arrSv2.add(new SinhVien("6","Duc","07/05/1995"));

    }
}
