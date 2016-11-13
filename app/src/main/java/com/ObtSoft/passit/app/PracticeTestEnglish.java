package com.ObtSoft.passit.app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.hardware.Sensor;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class PracticeTestEnglish extends ActionBarActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    RadioButton radioP1;
    RadioButton radioP2;
    RadioButton radioP3;
    RadioButton radioP4;
    RadioGroup optionGroupP;

    TextView txtPNumbering;
    TextView txtPSubject;
    TextView txtPYear;
    TextView txtPrTimeCounter;
    TextView txtPQuestionText;

    ImageView imageViewP;

    CountDownTimer timer;

    Button btnPrPassage;
    Button btnPCalculator;
    Button btnPSubmit;
    Button btnPNext;
    Button btnPPrevious;
    Button btnPAnswer;

    String time;
    int noOfQuestionsSelected;
    int questionId = 0;
    int score = 0;

    Questions question;

    SeventhHelper seventh;
    ArrayList<Integer> answers;
    List<Questions> questions;
    List<Questions> finalQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_test_english);

        seventh = new SeventhHelper(this);
        seventh.createDatabase();

        radioP1 = (RadioButton) findViewById(R.id.radioP1);
        radioP2 = (RadioButton) findViewById(R.id.radioP2);
        radioP3 = (RadioButton) findViewById(R.id.radioP3);
        radioP4 = (RadioButton) findViewById(R.id.radioP4);
        optionGroupP = (RadioGroup) findViewById(R.id.optionGroupP);

        txtPNumbering = (TextView) findViewById(R.id.txtPNumbering);
        txtPSubject = (TextView) findViewById(R.id.txtPSubject);
        txtPYear = (TextView) findViewById(R.id.txtPYearsAndNumber);
        txtPrTimeCounter = (TextView) findViewById(R.id.txtPTimeCounter);
        txtPQuestionText = (TextView) findViewById(R.id.txtPQuestionText);

        imageViewP = (ImageView) findViewById(R.id.imgPview);

        btnPrPassage = (Button) findViewById(R.id.btnPrPassage);
        btnPCalculator = (Button) findViewById(R.id.btnPCalculator);
        btnPSubmit = (Button) findViewById(R.id.btnPSubmit);
        btnPNext = (Button) findViewById(R.id.btnPNext);
        btnPPrevious = (Button) findViewById(R.id.btnPPrevious);
        btnPAnswer = (Button) findViewById(R.id.btnPAnswer);

        btnPSubmit.setOnClickListener(this);
        btnPCalculator.setOnClickListener(this);
        btnPrPassage.setOnClickListener(this);
        btnPNext.setOnClickListener(this);
        btnPPrevious.setOnClickListener(this);
        optionGroupP.setOnCheckedChangeListener(this);
        btnPAnswer.setOnClickListener(this);

        String year = getIntent().getStringExtra("year");
        String noOfQuestions = getIntent().getStringExtra("noOfQuestions");
        String subject = getIntent().getStringExtra("subject");
        time = getIntent().getStringExtra("time");

        //txtPNumbering.setText(1 + " / " + noOfQuestions);
        txtPSubject.setText(subject);
        txtPYear.setText(year);

        questions = getQuestions(subject, year);
        if (subject.equals("USE OF ENGLISH")) {
            finalQuestions = new ArrayList<Questions>();
        } else {
            Collections.shuffle(questions);
            finalQuestions = new ArrayList<Questions>();
        }

        for (int i = 0; i < strToInt(noOfQuestions); i++) {
            finalQuestions.add(questions.get(i));
        }
        noOfQuestionsSelected = finalQuestions.size();
        answers = new ArrayList<Integer>();
        for (int i = 0; i < noOfQuestionsSelected; i++) {
            answers.add(i, -1);
        }

        question = finalQuestions.get(questionId);

        if(noOfQuestionsSelected > 0) {
            showQuestionsAndOptions();
        }


        start();

        if (subject.equals("USE OF ENGLISH")) {
            btnPCalculator.setVisibility(View.INVISIBLE);
        } else {
            btnPrPassage.setVisibility(View.INVISIBLE);
        }

    }

    private void showQuestionsAndOptions() {
        txtPNumbering.setText((questionId + 1) + " / " + noOfQuestionsSelected);
        txtPQuestionText.setText(question.getQuestionText());
        imageViewP.setImageBitmap(question.getQuestionImage());
        radioP1.setText(question.getOption1());
        radioP2.setText(question.getOption2());
        radioP3.setText(question.getOption3());
        radioP4.setText(question.getOption4());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practice_test_others, menu);
        return true;
    }

    private void start() {
        timer = new CountDownTimer(strToLong(time) * 60000, 1000){
            @Override
            public void onTick(long l) {
                String hms = String.format("%02d:%02d:%02d",
                        TimeUnit.MILLISECONDS.toHours(l),
                        TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(l)),
                        TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                txtPrTimeCounter.setText(hms);
            }

            @Override
            public void onFinish() {
                txtPrTimeCounter.setText("00:00:00");
                final Intent intention = new Intent(PracticeTestEnglish.this, singleOtherResult.class);

                AlertDialog.Builder alerts = new AlertDialog.Builder(PracticeTestEnglish.this);
                alerts.setMessage("Your time is up!");
                for(int i = 0; i < answers.size(); i++) {
                    question = finalQuestions.get(i);
                    if(answers.get(i) == question.getAnswer()) {
                        score = score + 1;
                    }
                }
                int finalScore = score;
                int ansSize = answers.size();
                String subjectTitle = getIntent().getStringExtra("subject");

                intention.putExtra("noOfQuestions", (ansSize + ""));
                Log.e("Final Score", finalScore + "");
                Log.e("ansSize", ansSize+"");
                intention.putExtra("correctAnswers", (finalScore + ""));
                intention.putExtra("subject", subjectTitle);
                //
                // intention.putExtra("questions", (android.os.Parcelable) finalQuestions);
                intention.putParcelableArrayListExtra("questions", (ArrayList<? extends android.os.Parcelable>) finalQuestions);
                intention.putIntegerArrayListExtra("answer", answers);

                startActivity(intention);
            }
        };
        timer.start();
    }

    private void cancel() {
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    public static long strToLong(String str) {
        long longStr = Long.parseLong(str);
        return longStr;
    }

    public static long strToInt(String str) {
        int intStr = Integer.parseInt(str);
        return intStr;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPSubmit:
                timer.cancel();
                String stopTime = (String) txtPrTimeCounter.getText();
                Log.e("Stop time", stopTime);
                final Intent intention = new Intent(PracticeTestEnglish.this, singleOtherResult.class);

                AlertDialog.Builder alerts = new AlertDialog.Builder(PracticeTestEnglish.this);
                alerts.setMessage("Your time is up!");
                for(int i = 0; i < answers.size(); i++) {
                    question = finalQuestions.get(i);
                    if(answers.get(i) == question.getAnswer()) {
                        score = score + 1;
                    }
                }
                int finalScore = score;
                int ansSize = answers.size();
                String subjectTitle = getIntent().getStringExtra("subject");

                intention.putExtra("noOfQuestions", (ansSize + ""));
                Log.e("Final Score", finalScore+"");
                Log.e("ansSize", ansSize + "");
                intention.putExtra("correctAnswers", (finalScore + ""));
                intention.putExtra("subject", subjectTitle);
                //
                // intention.putExtra("questions", (android.os.Parcelable) finalQuestions);
                intention.putParcelableArrayListExtra("questions", (ArrayList<? extends android.os.Parcelable>) finalQuestions);
                intention.putIntegerArrayListExtra("answer", answers);

                startActivity(intention);
                break;
            case R.id.btnPNext:
                if ((questionId + 1) >= noOfQuestionsSelected) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answers.get(i) + "");
                    }
                    optionGroupP.clearCheck();
                    questionId = questionId + 1;
                    question = finalQuestions.get(questionId);

                    showCheckedOption();
                    showQuestionsAndOptions();
                }

                break;
            case R.id.btnPPrevious:
                if(questionId <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answers.get(i) + "");
                    }
                    questionId = questionId - 1;
                    optionGroupP.clearCheck();
                    question = questions.get(questionId);


                    showQuestionsAndOptions();
                    showCheckedOption();
                }
                break;

            case R.id.btnPrPassage:
                showPassage();
                break;
            case R.id.btnPCalculator:
                break;
            case R.id.btnPAnswer:
                showAnswer();
                break;
        }
    }

    private void showAnswer() {
        AlertDialog.Builder answerBuilder = new AlertDialog.Builder(PracticeTestEnglish.this);
        answerBuilder.setTitle("Passage");

        LayoutInflater factory = LayoutInflater.from(PracticeTestEnglish.this);
        final View view = factory.inflate(R.layout.answer, null);

        TextView txtExplanation = (TextView) view.findViewById(R.id.txtExplanation);
        txtExplanation.setText(question.getAnswerExplanation());
        TextView txtAnswer = (TextView) view.findViewById(R.id.txtAnswer);
        int ans = question.getAnswer();

        if(ans == 0) {
            txtAnswer.setText("A");
        } else if (ans == 1) {
            txtAnswer.setText("B");
        } else if (ans == 2) {
            txtAnswer.setText("C");
        } else if (ans == 3) {
            txtAnswer.setText("D");
        }

        answerBuilder.setView(view);
        answerBuilder.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        answerBuilder.show();
    }

    private void showPassage() {
        AlertDialog.Builder passageBuilder = new AlertDialog.Builder(PracticeTestEnglish.this);
        passageBuilder.setTitle("Passage");

        LayoutInflater factory = LayoutInflater.from(PracticeTestEnglish.this);
        final View view = factory.inflate(R.layout.passage, null);

        TextView txtPassage = (TextView) view.findViewById(R.id.txtPassage);
        txtPassage.setText(question.getQuestionPassage());

        passageBuilder.setView(view);
        passageBuilder.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        passageBuilder.show();
    }

    private void showCheckedOption() {
        if(answers.get(questionId) == 0) {
            radioP1.setChecked(true);
        } else if(answers.get(questionId) == 1) {
            radioP2.setChecked(true);
        } else if(answers.get(questionId) == 2) {
            radioP3.setChecked(true);
        } else if(answers.get(questionId) ==  3) {
            radioP4.setChecked(true);
        } else {
            optionGroupP.clearCheck();
        }
    }

    public void radioPClick(View v) {
        int radioId = optionGroupP.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = optionGroupP.indexOfChild(rb);
        answers.set(questionId, m);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }

    public List<Questions> getQuestions(String subject, String year) {
        seventh.openDatabase();
        List<Questions> questions = new ArrayList<Questions>();

        String query = "select * from Questions where question_subject = '" + subject + "' and question_year = '" + year + "'";

        Cursor cursor = seventh.getReadableDatabase().rawQuery(query, null);

        if(cursor.getCount() > 0) {
            cursor.moveToFirst();

            while(!cursor.isAfterLast()) {
                Questions quest = new Questions(cursor.getInt(0), cursor.getString(1),
                        cursor.getString(2), cursor.getString(3), cursor.getString(4),
                        cursor.getString(5), cursor.getString(6), cursor.getString(7),
                        cursor.getInt(8),  DbBitmapUtility.getImage(cursor.getBlob(9)), cursor.getString(10), cursor.getString(11));
                questions.add(quest);

                cursor.moveToNext();
            }
        }
        cursor.close();
        return questions;
    }
}
