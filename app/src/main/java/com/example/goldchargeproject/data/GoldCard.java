package com.example.goldchargeproject.data;

import java.util.Date;

public class GoldCard {
    private int id;
    private String Description;
    private Student student;
    private Date isueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getIsueDate() {
        return isueDate;
    }

    public void setIsueDate(Date isueDate) {
        this.isueDate = isueDate;
    }
}
