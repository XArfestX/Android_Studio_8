package ru.mirea.burmakin.livedata;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.Date;

class TimeLiveData {
    private static String TAG;
    private static MutableLiveData<Long> data = new MutableLiveData<Long>();
    //sets latest time to LiveData
    static LiveData<Long> getTime(){
        data.setValue(new Date().getTime());
        Log.d(TAG, "get time");
        return data;
    }
    static void setTime(){
        data.setValue(new Date().getTime());
        Log.d(TAG, "set time");
    }
}

