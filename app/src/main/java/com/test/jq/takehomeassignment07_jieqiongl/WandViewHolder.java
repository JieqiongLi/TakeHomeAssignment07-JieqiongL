package com.test.jq.takehomeassignment07_jieqiongl;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by IBM on 26/03/2018.
 */

//The ViewHolder is the java object for the CardView
public class WandViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView wandNameView;
    private TextView wandInfoView;
    private ImageView wandImageView;
    private Context context; //Q: If the context is the RecyclerViewActivity?

    public TextView getWandNameView() {
        return wandNameView;
    }

    public void setWandNameView(TextView wandNameView) {
        this.wandNameView = wandNameView;
    }

    public TextView getWandInfoView() {
        return wandInfoView;
    }

    public void setWandInfoView(TextView wandInfoView) {
        this.wandInfoView = wandInfoView;
    }

    public ImageView getWandImageView() {
        return wandImageView;
    }

    public void setWandImageView(ImageView wandImageView) {
        this.wandImageView = wandImageView;
    }

    public WandViewHolder(View itemView, final Context context) {
        super(itemView); //super() Calls the constructor of the parent class   Q: itemView is card_view?
        cardView = (CardView) itemView.findViewById(R.id.card_view); //Q: Why need itemView. ?
        wandNameView = (TextView) itemView.findViewById(R.id.wand_name);
        wandInfoView = (TextView) itemView.findViewById(R.id.wand_info);
        wandImageView = (ImageView) itemView.findViewById(R.id.wand_image);
        this.context = context;



        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, wandNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

