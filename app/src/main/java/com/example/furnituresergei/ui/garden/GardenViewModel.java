package com.example.furnituresergei.ui.garden;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GardenViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public GardenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is garden furniture fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}