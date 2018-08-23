package com.android.recyclerview.mvvm.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.android.recyclerview.mvvm.R;
import com.android.recyclerview.mvvm.model.UserContent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UserViewModel extends ViewModel{

    private List<UserContent> repositories;
    MutableLiveData<List<UserContent>> userModelsLiveData;


    public UserViewModel(){
        userModelsLiveData = new MutableLiveData<>();

        UserContent content = new UserContent.Builder()
                .setName("Amit")
                .setDesc("Ola Employee")
                .setTime(String.valueOf(new SimpleDateFormat("HH:mm:ss").format(new Date())))
                .setImageSrc(R.mipmap.ic_launcher_round)
                .build();
        repositories  = new LinkedList<>();
        repositories.add(content);

        postUserInfo();

    }




    public void postUserInfo() {
        userModelsLiveData.postValue(repositories);
    }

    public LiveData<List<UserContent>> getUserModels(){
        return userModelsLiveData;
    }

    public int getCount(){
        return repositories.size();
    }
}
