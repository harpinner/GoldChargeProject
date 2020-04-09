package com.example.goldchargeproject.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {GoldCard.class, Student.class, Staff.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class GoldCardSCoolDataBase extends RoomDatabase {
    public abstract theGoldenDao theDao();
}
