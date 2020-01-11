package com.example.my_card_view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView_activity extends MainActivity {
    private List<BikeStation> bikeStationList;

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycler_layout);

        rv = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }


    private void initializeData(){
        bikeStationList = new ArrayList<>();
        bikeStationList.add(new BikeStation("North", "Quad","1", R.drawable.ic_launcher_background));
        bikeStationList.add(new BikeStation("East", "Apartments", "2", R.drawable.ic_launcher_background));
        bikeStationList.add(new BikeStation("South", "Quad","3",R.drawable.ic_launcher_background));
        bikeStationList.add(new BikeStation("West", "Apartments","4",R.drawable.ic_launcher_background));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(bikeStationList);
        rv.setAdapter(adapter);
    }

}
