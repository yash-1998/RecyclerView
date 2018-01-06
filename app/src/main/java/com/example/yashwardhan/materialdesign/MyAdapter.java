package com.example.yashwardhan.materialdesign;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.List;

/**
 * Created by yashwardhan on 6/1/18.
 */

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>{


    private LayoutInflater inflator;
    List <Information> data= Collections.emptyList();
    public MyAdapter(Context context,List <Information> data)
    {
        inflator= LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.custom_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Information current = data.get(position);
        holder.tv.setText(current.title);
        holder.im.setImageResource(current.iconId);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView im;
        TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            im=(ImageView)itemView.findViewById(R.id.listicon);
            tv=(TextView)itemView.findViewById(R.id.listtext);
        }
    }
}
