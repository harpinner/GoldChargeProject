package com.example.goldchargeproject.data;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;

/**
 * this is a data class representing a gold card
 */
@Entity(tableName = "goldcards")
public class GoldCard implements Serializable {
    /**
     * This is the id of the goldCard in the database
     */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "gid")
    private int id;
    /**
     * The Details of how this gold card was earned
     */
    @ColumnInfo(name = "description")
    private String Description;

    /**
     * The Student who Earned this Gold card
     */

    private int student;

    @ColumnInfo(name = "first_name")
    private String studentFirstName;
    @ColumnInfo(name = "last_name")
    private String studentLastName;


    private int teacher;
    /**
     * The Date of when the gold card was issued
     */
    @ColumnInfo(name = "issue_date")
    private Date issueDate;

    /**
     * <p>The getter for the id variable
     * </p>
     * @return the id variable
     */
    public int getId() {
        return id;
    }

    /**
     * <p>the setter for the id variable
     * </p>
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @NonNull
    @Override
    public String toString() {
        return studentFirstName + " " + studentLastName + ": " + issueDate;
    }

    /**
     * The Person Who Issued The Card
     */
    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
}
