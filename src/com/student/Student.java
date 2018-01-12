package com.student;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
    private String sno;
    private String sname;
    private String ssex;
    private int sage;
    private Date sbirthday;
    private String clazz;

    public Student(String sno, String sname, String ssex, Date sbirthday, String clazz) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sbirthday = sbirthday;
        this.clazz = clazz;
    }

    public Student() {

    }
    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }



    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
