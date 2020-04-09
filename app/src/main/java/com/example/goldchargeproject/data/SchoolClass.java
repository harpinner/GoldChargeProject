package com.example.goldchargeproject.data;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.HashSet;
import java.util.Set;

@Entity(tableName = "school_class")
public class SchoolClass {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "subject")
    private String subject;

    @ColumnInfo(name = "description")
    private String description;

    @Embedded
    private Staff teacher;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Staff getTeacher() {
        return teacher;
    }

    public void setTeacher(Staff teacher) {
        this.teacher = teacher;
    }



    @NonNull
    @Override
    public String toString() {
        return subject;
    }
}
