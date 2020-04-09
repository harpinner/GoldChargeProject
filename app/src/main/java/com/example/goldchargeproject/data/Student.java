package com.example.goldchargeproject.data;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "students")
public class Student implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "sid")
    private int id;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @ColumnInfo(name = "email")
    private String Email;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @ColumnInfo(name = "address")
    private String Address;

    @ColumnInfo(name = "age")
    private int age;

    @ColumnInfo(name = "grade")
    private int grade;

    public Student() {

    }
    public Student(String firstName) {
        this.setFirstName(firstName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @NonNull
    @Override
    public String toString() {
        return firstName + "  " + lastName;
    }
}

