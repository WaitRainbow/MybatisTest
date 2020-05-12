package com.cc.domain;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String gender;
    private String name;
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
