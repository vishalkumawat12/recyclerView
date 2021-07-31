package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<rvModel> modelList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        modelList.add(new rvModel("hiiiii",R.drawable.logo));
        modelList.add(new rvModel("hiiiii",R.drawable.logo));
        modelList.add(new rvModel("hiiiii",R.drawable.logo));
        rvAdapter adapter=new rvAdapter(modelList);
        recyclerView.setAdapter(adapter);

    }
}