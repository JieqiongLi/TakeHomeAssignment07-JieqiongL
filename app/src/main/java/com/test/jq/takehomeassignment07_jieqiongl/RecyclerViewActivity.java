package com.test.jq.takehomeassignment07_jieqiongl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<Wand> wands;
    WandsAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new WandsAdapter(wands, this);
        recyclerView.setAdapter(adapter);

    }

    private void initialData() {
        wands = new ArrayList<>();
        wands.add(new Wand("Dumbledore Wand", "15 inches", R.drawable.dumbledore));
        wands.add(new Wand("Harry Potter Wand", "14 inches", R.drawable.harry));
        wands.add(new Wand("Hermione Wand", "15 inches", R.drawable.hermione));
        wands.add(new Wand("Lord Voldemort Wand", "15 inches", R.drawable.lord_voldemort));
    }

    public void addRandomWand(View view){
        wands.add(getRandomWand());
        adapter.notifyDataSetChanged();
    }

    private Wand getRandomWand() {
        int num = (int) (Math.random() * 4);
        if (num == 0)
            return new Wand("Dumbledore Wand", "15 inches", R.drawable.dumbledore);
        else if (num == 1)
            return new Wand("Harry Potter Wand", "14 inches", R.drawable.harry);
        else if (num == 2)
            return new Wand("Hermione Wand", "15 inches", R.drawable.hermione);
        else
            return new Wand("Lord Voldemort Wand", "15 inches", R.drawable.lord_voldemort);
    }


}




