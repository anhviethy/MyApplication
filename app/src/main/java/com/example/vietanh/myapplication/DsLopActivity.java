package com.example.vietanh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.vietanh.myapplication.model.Lop;
import com.example.vietanh.myapplication.model.SinhVien;

import java.util.ArrayList;

public class DsLopActivity extends AppCompatActivity {
    private ListView lv_lop;
    ArrayAdapter adapter;
    Lop lopSelected = null;
    ArrayList<Lop> arrLop;
    ArrayList<String> tenLop;
    ArrayList<SinhVien> arrSv1,arrSv2,arrSv3,arrSv4,arrSv5,arrSv6,arrSv7,arrSv8,arrSv9,arrSv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds_lop);
        lv_lop = (ListView) findViewById(R.id.lv_lop);
        arrLop = new ArrayList<>();
        tenLop = new ArrayList<>();
        addLop();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tenLop);
        lv_lop.setAdapter(adapter);
        registerForContextMenu(lv_lop);
        lv_lop.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                lopSelected = arrLop.get(i);
                return false;
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.dssv, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case R.id.add:
                break;
            case R.id.ds:
            {
                doDanhSach();
                break;
            }
        }
        return super.onContextItemSelected(item);
    }

    public void doDanhSach() {
        Intent i = new Intent(DsLopActivity.this,DssvActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOP",lopSelected);
        i.putExtra("SV",bundle);
        startActivity(i);
    }



    public void addLop(){
        addSv();
        Lop dt01 = new Lop("dt01",arrSv1);
        Lop dt02 = new Lop("dt02",arrSv2);
        Lop dt03 = new Lop("dt03",arrSv3);
        Lop dt04 = new Lop("dt04",arrSv4);
        Lop dt05 = new Lop("dt05",arrSv5);
        Lop dt06 = new Lop("dt06",arrSv6);
        Lop dt07 = new Lop("dt07",arrSv7);
        Lop dt08 = new Lop("dt08",arrSv8);
        Lop dt09 = new Lop("dt09",arrSv9);
        Lop dt10 = new Lop("dt10",arrSv10);
        arrLop.add(dt01);
        arrLop.add(dt02);
        arrLop.add(dt03);
        arrLop.add(dt04);
        arrLop.add(dt05);
        arrLop.add(dt06);
        arrLop.add(dt07);
        arrLop.add(dt08);
        arrLop.add(dt09);
        arrLop.add(dt10);
        //ten lop
        tenLop.add(dt01.getTenLop());
        tenLop.add(dt02.getTenLop());
        tenLop.add(dt03.getTenLop());
        tenLop.add(dt04.getTenLop());
        tenLop.add(dt05.getTenLop());
        tenLop.add(dt06.getTenLop());
        tenLop.add(dt07.getTenLop());
        tenLop.add(dt08.getTenLop());
        tenLop.add(dt09.getTenLop());
        tenLop.add(dt10.getTenLop());
    }

    public void addSv(){
        arrSv1 = new ArrayList<>();
        arrSv2 = new ArrayList<>();
        arrSv3 = new ArrayList<>();
        arrSv4 = new ArrayList<>();
        arrSv5 = new ArrayList<>();
        arrSv6 = new ArrayList<>();
        arrSv7 = new ArrayList<>();
        arrSv8 = new ArrayList<>();
        arrSv9 = new ArrayList<>();
        arrSv10 = new ArrayList<>();
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
