package com.test.jq.takehomeassignment07_jieqiongl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by IBM on 26/03/2018.
 */

public class WandsAdapter extends RecyclerView.Adapter<WandViewHolder> {
    private List<Wand> wands;
    private Context context;

    public WandsAdapter(List<Wand> wands, Context context) {
        this.wands = wands;
        this.context = context;
    }

    //To return a viewHolder   Q: Explain this in detail?
    @Override
    public WandViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new WandViewHolder(view, context);
    }

    //To display the viewHolder
    @Override
    public void onBindViewHolder(WandViewHolder holder, int position) {
        Wand wand = wands.get(position);
        holder.getWandNameView().setText(wand.getName());
        holder.getWandInfoView().setText(wand.getInfo());
        holder.getWandImageView().setImageResource(wand.getImageId());
    }

    @Override
    public int getItemCount() {
        return wands.size();
    }

}

