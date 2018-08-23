package com.android.recyclerview.mvvm.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.recyclerview.mvvm.R;
import com.android.recyclerview.mvvm.model.UserContent;
import com.android.recyclerview.mvvm.viewmodel.UserViewModel;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {

    UserViewModel userViewModels;
    Context context;
    List<UserContent> userContentList;

    public CustomAdapter(Context context) {
        this.context = context;
        userViewModels = ViewModelProviders.of((MainActivity) context).get(UserViewModel.class);
        subscribeUserViewModel();
    }


    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater in = LayoutInflater.from(viewGroup.getContext());
        View view = in.inflate(R.layout.usercontent, viewGroup, false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder customHolder, int position) {
        if(userContentList!=null) {
            UserContent userContent = userContentList.get(position);
            customHolder.getImageView().setImageResource(userContent.getImageSrc());
            customHolder.getNameText().setText(userContent.getName());
            customHolder.getDescText().setText(userContent.getDesc());
            customHolder.getTimeText().setText(userContent.getTime());
        }


    }

    //view subscribe for viewmodel data
    private void subscribeUserViewModel() {
        userViewModels.getUserModels().observe((MainActivity) context, new Observer<List<UserContent>>() {
            @Override
            public void onChanged(@Nullable List<UserContent> userContent) {
                userContentList = userContent;
                notifyDataSetChanged();
            }
        });
        ;
    }

    @Override
    public int getItemCount() {
        return userViewModels.getCount();
    }
}

