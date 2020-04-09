package com.example.goldchargeproject.data;

import android.content.Context;

import androidx.room.Room;

public class GoldCardDataLayer {

    private static Context theApp;
    private static GoldCardSCoolDataBase goldCardDataBase;

    public static void setContext(Context cont)
    {
        theApp = cont;
    }

    public static GoldCardSCoolDataBase getGoldCardDataBase(){

        if (goldCardDataBase == null)
        {
           goldCardDataBase = Room.databaseBuilder(theApp,GoldCardSCoolDataBase.class,"thisDB.db").allowMainThreadQueries().build();
        }

        return goldCardDataBase;
    }
}
