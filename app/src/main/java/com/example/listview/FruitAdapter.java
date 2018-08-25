package com.example.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private final int resourceid;
    private Fruit fruit;
    private ImageView fruitImage;
    private TextView fruitname;
    private View view;      //获取显示item条目的布局

    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        resourceid = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        //获取当前项的所定位的水果类Fruit的实例
        fruit = getItem(position);

        if(convertView==null){
            //如果convertView为空的话就去加载布局
            view = LayoutInflater.from(getContext()).inflate(resourceid, parent, false);
        }else{
            //如果不为空的话的就对convertView进行大量的重用
            view = convertView;
        }

        fruitImage = view.findViewById(R.id.fruit_image);
        fruitname = view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitname.setText(fruit.getName());
        return view;

    }
}
