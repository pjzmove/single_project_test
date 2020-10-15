package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    private static volatile  ToastUtils mInstance = null;
    private static Context mContext = null;
    private ToastUtils(){}

    public static ToastUtils getInstance(Context context){
        if(mInstance == null){
            synchronized (ToastUtils.class){
                if (mInstance == null){
                    mInstance = new ToastUtils();
                    mContext = context;
                }
            }
        }
        return  mInstance;
    }

    public void showToast(String str){
        Toast.makeText(mContext, str, Toast.LENGTH_SHORT).show();
    }
}
