package com.example.goldchargeproject.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface theGoldenDao {

    @Insert
    public void addStudent(Student student);
    @Update
    public void updateStudent(Student student);

    @Delete
    public  void deleteStudent(Student student);

    @Query("SELECT * FROM students WHERE sid = :id")
    public Student getStudent(int id);

    @Query("SELECT * FROM students")
    public List<Student> allStudents();

    @Insert
    public void addGoldCard(GoldCard goldcard);
    @Update
    public void updateGoldCard(GoldCard goldcard);

    @Query("SELECT * FROM goldcards WHERE teacher = :teachID")
    public List<GoldCard> teacherGoldCards(int teachID);

    @Insert
    public void addStaff(Staff staff);
    @Update
    public void updateStaff(Staff staff);

    @Query("SELECT * FROM staff WHERE username = :username AND password = :password")
    public Staff login(String username, String password);
}
