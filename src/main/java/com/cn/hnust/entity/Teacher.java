package com.cn.hnust.entity;

public class Teacher {
    private Integer teacherid;

    private String teachername;

    private String teacherclass;

    private String classid;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeacherclass() {
        return teacherclass;
    }

    public void setTeacherclass(String teacherclass) {
        this.teacherclass = teacherclass == null ? null : teacherclass.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }
}