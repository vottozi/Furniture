package com.example.furnituresergei.ui.youthfurniture;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class YouthFurnitureViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public YouthFurnitureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is youth furniture fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}