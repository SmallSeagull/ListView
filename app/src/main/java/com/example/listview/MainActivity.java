package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    String data[] = {"Apple","Banana","Orange","Banana","Orange","Banana","Orange",
//            "Banana","Orange","Banana","Orange","Banana","Orange","Banana","Orange",
//            "Banana","Orange","Banana","Orange","Banana","Orange","Banana","Orange"};



    private ListView listView;
    private List<Fruit> fruitList = new ArrayList<>();  //声明一个存放水果的集合
    private FruitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化水果数据
        initFruits();
        Log.i("zhang","走到这里了");
        adapter = new FruitAdapter(MainActivity.this, R.layout.item, fruitList);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 10; i++) {
            Fruit apple = new Fruit("1",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana1 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana2 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana3 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana4 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana5 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana6 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana7 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
            Fruit banana8 = new Fruit("12",R.drawable.title_logo);
            fruitList.add(apple);
        }
    }


}
