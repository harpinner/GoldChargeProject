package com.example.goldchargeproject.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "parents")
public class Parent {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "first_name")
    private String firstName;
    @ColumnInfo(name = "last_name")
    private String lastName;
    @ColumnInfo(name = "email")
    private String Email;
    @ColumnInfo(name = "address")
    private String Address;

}
