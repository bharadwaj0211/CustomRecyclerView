package com.example.customrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    String[] carName={"Mustang", "Camero", "Camry", "rangerover","Aventador", "R8", "Ghost", "Swift"};
    String[] carBrand={"Ford", "Chevrolet", "Toyota", "Landrover", "Lamborghini", "Audi", "Rolls Royce", "Maruti"};
    int[] imageId={R.drawable.mustang, R.drawable.camero, R.drawable.camry, R.drawable.rangerover, R.drawable.lambo, R.drawable.r8, R.drawable.ghost, R.drawable.swift};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(this, carName, carBrand, imageId);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
