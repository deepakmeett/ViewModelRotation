package com.example.viewmodelrotation;
import android.util.Log;

import androidx.lifecycle.ViewModel;
public class MainViewModel extends ViewModel {
    int score = 0;
    
    public static final String TAG = "tag";

    public MainViewModel() {
        Log.d( TAG, "MainViewModel: " +"ViewModel is created");    
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d( TAG, "onCleared: " + "ViewModel is destroyed" );
    }
}
