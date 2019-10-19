package com.example.assignment2.Model;



import android.graphics.Color;

import java.util.ArrayList;

public class Student {
    protected String mFirstname;
    protected String mLastname;
    protected int mcwid;

    protected ArrayList<com.example.assignment2.Model.Course> mCourseid;

    public Student(String fname,String lname, int id){
        mFirstname = fname;
        mLastname = lname;
        mcwid = id;
    }

    public String getFirstname(){
        return mFirstname;
    }

    public String getLastname(){
        return mLastname;
    }

    public int getCwid(){
        return mcwid;
    }

    public void Setfirstname(String fname){
        mFirstname=fname;
    }

    public void Setlastname(String lname){
        mLastname=lname;
    }

    public void SetCwid(int cid){
        mcwid=cid;
    }
    public void setCourseid(ArrayList<Course>  scourse){
        mCourseid = scourse;
    }

    public ArrayList<Course> getCourseid(){
        return mCourseid;
    }



}
