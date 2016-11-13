package com.ObtSoft.passit.app;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ibrahim Muhammed on 25/09/2016.
 */
public class Questions implements Parcelable{
    int questionId;
    String questionText;
    String questionPassage;
    String subject;
    String option1;
    String option2;
    String option3;
    String option4;
    Bitmap questionImage;
    int answer;
    String answerExplanation;
    String year;

    public Questions(int questionId, String questionText, String questionPassage,
                     String subject, String option1, String option2, String option3,
                     String option4, int answer, Bitmap questionImage, String answerExplanation, String year) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.questionPassage = questionPassage;
        this.subject = subject;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionImage = questionImage;
        this.answer = answer;
        this.answerExplanation = answerExplanation;
        this.year = year;
    }

    public Bitmap getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(Bitmap questionImage) {
        this.questionImage = questionImage;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionPassage() {
        return questionPassage;
    }

    public void setQuestionPassage(String questionPassage) {
        this.questionPassage = questionPassage;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getAnswerExplanation() {
        return answerExplanation;
    }

    public void setAnswerExplanation(String answerExplanation) {
        this.answerExplanation = answerExplanation;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(questionId);
        parcel.writeString(questionText);
        parcel.writeString(questionPassage);
        parcel.writeString(subject);
        parcel.writeString(option1);
        parcel.writeString(option2);
        parcel.writeString(option3);
        parcel.writeString(option4);
        parcel.writeInt(answer);
        parcel.writeString(answerExplanation);
        parcel.writeString(year);
    }

    public Questions(Parcel in) {
        this.questionId = in.readInt();
        this.questionText = in.readString();
        this.questionPassage = in.readString();
        this.subject = in.readString();
        this.option1 = in.readString();
        this.option2 = in.readString();
        this.option3 = in.readString();
        this.option4 = in.readString();
        this.answer = in.readInt();
        this.answerExplanation = in.readString();
        this.year = in.readString();
    }

    public static final Creator<Questions> CREATOR = new Creator<Questions>() {
        @Override
        public Questions createFromParcel(Parcel parcel) {
            return new Questions(parcel);
        }

        @Override
        public Questions[] newArray(int i) {
            return new Questions[i];
        }
    };
}