package com.example.furnituresergei.ui.hallway;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HallwayViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HallwayViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}