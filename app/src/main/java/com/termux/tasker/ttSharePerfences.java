package com.termux.tasker;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import java.util.Map;
import java.util.Set;

public class ttSharePerfences {
    public static SharedPreferences getPer(Context context){
        return context.getSharedPreferences("termuxtasker",Context.MODE_PRIVATE);
    }
    public static void setGlobalDir(Context context, String dir){
        getPer(context).edit().putString("GlobalDir",dir).apply();
    }
    public static String getGlobalDIr(Context context){
        return getPer(context).getString("GlobalDir","/data/data/com.termux/files/home/.termux/tasker/");
    }
}
