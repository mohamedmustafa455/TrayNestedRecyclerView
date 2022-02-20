package com.example.traynestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_group;
    LinearLayoutManager linearLayoutgroup;
    ArrayList<String>  arraylistGroup;
    GroupAdap adapterGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_group=findViewById(R.id.rv_group);


        //initialize multiple group
        arraylistGroup=new ArrayList<>();
        arraylistGroup.add(" الدعامه والحركه في الكائنات الحيه");
        arraylistGroup.add("التنسيق الهرموني في الكائنات الحيه");
        arraylistGroup.add("التكاثر في الكائنات الحيه");
        arraylistGroup.add("المناعه في الكائنات الحيه");
        arraylistGroup.add("الحمض النووي والمعلومات الجينيه");
        arraylistGroup.add("الأحماض النوويه وتخليق البروتين ");

        //initialize group adabter
        adapterGroup =new GroupAdap(MainActivity.this,arraylistGroup );
        //initialize layout adapter
        linearLayoutgroup=new LinearLayoutManager(this);
        //set layout manager
        rv_group.setLayoutManager(linearLayoutgroup);
        //set adapter
        rv_group.setAdapter(adapterGroup);


    }
}