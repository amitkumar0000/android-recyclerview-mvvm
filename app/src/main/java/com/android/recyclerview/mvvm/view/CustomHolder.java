package com.android.recyclerview.mvvm.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.android.recyclerview.mvvm.R;

import org.w3c.dom.Text;

public class CustomHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameText;
    TextView descText;
    TextView timeText;

    public CustomHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.userImage);
        nameText = itemView.findViewById(R.id.userName);
        descText = itemView.findViewById(R.id.userDesc);
        timeText = itemView.findViewById(R.id.time);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getNameText() {
        return nameText;
    }

    public TextView getDescText() {
        return descText;
    }

    public TextView getTimeText() {
        return timeText;
    }
}
