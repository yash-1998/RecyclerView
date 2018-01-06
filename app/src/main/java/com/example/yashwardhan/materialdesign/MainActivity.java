package com.example.yashwardhan.materialdesign;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerviewlist);
        adapte=new MyAdapter(this,getData());
        recyclerView.setAdapter(adapte);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public static List<Information> getData()
    {
        List<Information> data=new ArrayList<>();
        int[] icons={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
        String [] titles = {"Zoro","Luffy","Ace","Gohan","Goku","Goku","Goku"};
        for(int i=0;i<titles.length && i<icons.length;i++)
        {
            Information current = new Information();
            current.iconId=icons[i];
            current.title=titles[i];
            data.add(current);
        }
        return  data;
    }
}
