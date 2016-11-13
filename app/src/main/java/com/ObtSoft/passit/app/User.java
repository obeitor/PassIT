package com.ObtSoft.passit.app;

/**
 * Created by Ibrahim Muhammed on 25/09/2016.
 */
public class User {
    int id;
    String regNo;
    String firstName;
    String firstSubject;
    String secondSubject;
    String thirdSubject;
    String fourthSubject;
    int firstScore;
    int secondScore;
    int thirdScore;
    int fourthScore;

    public User(int id, String regNo,
                String firstName, String firstSubject,
                String secondSubject, String thirdSubject,
                String fourthSubject, int firstScore,
                int secondScore, int thirdScore, int fourthScore) {
        this.id = id;
        this.regNo = regNo;
        this.firstName = firstName;
        this.firstSubject = firstSubject;
        this.secondSubject = secondSubject;
        this.thirdSubject = thirdSubject;
        this.fourthSubject = fourthSubject;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
        this.fourthScore = fourthScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstSubject() {
        return firstSubject;
    }

    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject;
    }

    public String getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(String thirdSubject) {
        this.thirdSubject = thirdSubject;
    }

    public String getFourthSubject() {
        return fourthSubject;
    }

    public void setFourthSubject(String fourthSubject) {
        this.fourthSubject = fourthSubject;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public int getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(int thirdScore) {
        this.thirdScore = thirdScore;
    }

    public int getFourthScore() {
        return fourthScore;
    }

    public void setFourthScore(int fourthScore) {
        this.fourthScore = fourthScore;
    }
}
