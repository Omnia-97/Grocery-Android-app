package com.example.thegroceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ItemModel> itemList;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        itemList = new ArrayList<>();
        ItemModel item1 = new ItemModel(R.drawable.fruit, "Fruits","Fresh Fruits from the Garden");
        ItemModel item2 = new ItemModel(R.drawable.vegitables, "Vegetables","Delicious Vegetables ");
        ItemModel item3 = new ItemModel(R.drawable.bread,"Bakery","Bread, Wheat and Beans");
        ItemModel item4 = new ItemModel(R.drawable.beverage, "Beverage","Juice, Tea, Coffee and Soda");
        ItemModel item5 = new ItemModel(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt");
        ItemModel item6 = new ItemModel(R.drawable.popcorn,"Snacks","Pop Corn, Donut and Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayout);
        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}