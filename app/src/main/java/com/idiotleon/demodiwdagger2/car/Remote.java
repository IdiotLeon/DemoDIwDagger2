package com.idiotleon.demodiwdagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = Remote.class.getSimpleName();

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote has been connected");
    }
}
