package com.ObtSoft.passit.app;

/**
 * Created by Ibrahim Muhammed on 02/11/2016.
 */
public class MultiScore {
    int id;
    String firstSubject;
    String secondSubject;
    String thirdSubject;
    String fourthSubject;
    int firstSubjectScore;
    int secondSubjectScore;
    int thirdSubjectScore;
    int fourthSubjectScore;
    String dateTime;

    public MultiScore(int id, String firstSubject, String secondSubject, String thirdSubject, String fourthSubject, int firstSubjectScore, int secondSubjectScore, int thirdSubjectScore, int fourthSubjectScore, String dateTime) {
        this.id = id;
        this.firstSubject = firstSubject;
        this.secondSubject = secondSubject;
        this.thirdSubject = thirdSubject;
        this.fourthSubject = fourthSubject;
        this.firstSubjectScore = firstSubjectScore;
        this.secondSubjectScore = secondSubjectScore;
        this.thirdSubjectScore = thirdSubjectScore;
        this.fourthSubjectScore = fourthSubjectScore;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getFirstSubjectScore() {
        return firstSubjectScore;
    }

    public void setFirstSubjectScore(int firstSubjectScore) {
        this.firstSubjectScore = firstSubjectScore;
    }

    public int getSecondSubjectScore() {
        return secondSubjectScore;
    }

    public void setSecondSubjectScore(int secondSubjectScore) {
        this.secondSubjectScore = secondSubjectScore;
    }

    public int getThirdSubjectScore() {
        return thirdSubjectScore;
    }

    public void setThirdSubjectScore(int thirdSubjectScore) {
        this.thirdSubjectScore = thirdSubjectScore;
    }

    public int getFourthSubjectScore() {
        return fourthSubjectScore;
    }

    public void setFourthSubjectScore(int fourthSubjectScore) {
        this.fourthSubjectScore = fourthSubjectScore;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
