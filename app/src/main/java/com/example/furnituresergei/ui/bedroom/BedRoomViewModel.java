package com.example.furnituresergei.ui.bedroom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BedRoomViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BedRoomViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}