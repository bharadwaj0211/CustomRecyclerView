package com.example.customrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyHolder> {
    Context context;
    String[] name;
    String[] brand;
    int[] imgId;

    public MyAdapter(Context context,String[] name,String[] brand,int[] imgId) {
        this.context = context;
        this.name=name;
        this.brand=brand;
        this.imgId=imgId;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View myview= layoutInflater.inflate(R.layout.my_row, parent,false);
        return new MyHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {

        holder.Cname.setText(name[position]);
        holder.Cbrand.setText(brand[position]);
        holder.CimageView.setImageResource(imgId[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView Cname,Cbrand;
        ImageView CimageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            Cname=itemView.findViewById(R.id.car);
            Cbrand=itemView.findViewById(R.id.brand);
            CimageView=itemView.findViewById(R.id.image);

        }
    }

}
