package com.example.furnituresergei.ui.kitchen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KitchenViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KitchenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kitchen fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}