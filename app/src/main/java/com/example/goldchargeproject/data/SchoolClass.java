package com.example.goldchargeproject.data;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

@Entity(tableName = "class")
public class SchoolClass {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "subject")
    private String subject;
    @ColumnInfo(name = "description")
    private String description;
    @Embedded
    @Relation(parentColumn = "staff_id",entityColumn = "id")
    private Staff teacher;

}
