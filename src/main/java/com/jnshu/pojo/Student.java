package com.jnshu.pojo;

public class Student {

    private Integer id, jointime, jnshuID, create_at, update_at;
    private long qq;
    private String name, student_type, technology, daily, wish, brother, knowfrom;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", jointime=" + jointime +
                ", jnshuID=" + jnshuID +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", qq=" + qq +
                ", name='" + name + '\'' +
                ", student_type='" + student_type + '\'' +
                ", technology='" + technology + '\'' +
                ", daily='" + daily + '\'' +
                ", wish='" + wish + '\'' +
                ", brother='" + brother + '\'' +
                ", knowfrom='" + knowfrom + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getJointime() {
        return jointime;
    }

    public Integer getJnshuID() {
        return jnshuID;
    }

    public Integer getCreate_at() {
        return create_at;
    }

    public Integer getUpdate_at() {
        return update_at;
    }

    public long getQq() {
        return qq;
    }

    public String getName() {
        return name;
    }

    public String getStudent_type() {
        return student_type;
    }

    public String getTechnology() {
        return technology;
    }

    public String getDaily() {
        return daily;
    }

    public String getWish() {
        return wish;
    }

    public String getBrother() {
        return brother;
    }

    public String getKnowfrom() {
        return knowfrom;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJointime(Integer jointime) {
        this.jointime = jointime;
    }

    public void setJnshuID(Integer jnshuID) {
        this.jnshuID = jnshuID;
    }

    public void setCreate_at(Integer create_at) {
        this.create_at = create_at;
    }

    public void setUpdate_at(Integer update_at) {
        this.update_at = update_at;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_type(String type) {
        this.student_type = type;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setDaily(String daily) {
        this.daily = daily;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public void setKnowfrom(String knowfrom) {
        this.knowfrom = knowfrom;
    }
}