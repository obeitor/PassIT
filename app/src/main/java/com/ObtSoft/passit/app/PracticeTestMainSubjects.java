package com.ObtSoft.passit.app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
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


public class PracticeTestMainSubjects extends ActionBarActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    RadioButton radioP1O;
    RadioButton radioP2O;
    RadioButton radioP3O;
    RadioButton radioP4O;
    RadioGroup optionGroupPO;

    TextView txtPNumberingO;
    TextView txtPSubjectO;
    TextView txtPYearO;
    TextView txtPrTimeCounterO;
    TextView txtPQuestionTextO;

    ImageView imageViewPO;

    CountDownTimer timerO;

    Button btnPrPassageO;
    Button btnPCalculatorO;
    Button btnPSubmitO;
    Button btnPNextO;
    Button btnPPreviousO;
    Button btnPAnswerO;

    String timeO;
    int noOfQuestionsSelectedO;
    int questionIdO = 0;
    int score = 0;

    Questions questionO;

    SeventhHelper seventhO;
    ArrayList<Integer> answersO;
    List<Questions> questionsO;
    List<Questions> finalQuestionsO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_test_main_subjects);

        seventhO = new SeventhHelper(this);
        seventhO.createDatabase();

        radioP1O = (RadioButton) findViewById(R.id.radioP1);
        radioP2O = (RadioButton) findViewById(R.id.radioP2);
        radioP3O = (RadioButton) findViewById(R.id.radioP3);
        radioP4O = (RadioButton) findViewById(R.id.radioP4);
        optionGroupPO = (RadioGroup) findViewById(R.id.optionGroupP);

        txtPNumberingO = (TextView) findViewById(R.id.txtPNumbering);
        txtPSubjectO = (TextView) findViewById(R.id.txtPSubject);
        txtPYearO = (TextView) findViewById(R.id.txtPYearsAndNumber);
        txtPrTimeCounterO = (TextView) findViewById(R.id.txtPTimeCounter);
        txtPQuestionTextO = (TextView) findViewById(R.id.txtPQuestionText);

        imageViewPO = (ImageView) findViewById(R.id.imgPview);

        btnPrPassageO = (Button) findViewById(R.id.btnPrPassage);
        btnPCalculatorO = (Button) findViewById(R.id.btnPCalculator);
        btnPSubmitO = (Button) findViewById(R.id.btnPSubmit);
        btnPNextO = (Button) findViewById(R.id.btnPNext);
        btnPPreviousO = (Button) findViewById(R.id.btnPPrevious);
        btnPAnswerO = (Button) findViewById(R.id.btnPAnswer);

        btnPSubmitO.setOnClickListener(this);
        btnPCalculatorO.setOnClickListener(this);
        btnPrPassageO.setOnClickListener(this);
        btnPNextO.setOnClickListener(this);
        btnPPreviousO.setOnClickListener(this);
        optionGroupPO.setOnCheckedChangeListener(this);
        btnPAnswerO.setOnClickListener(this);

        String year = getIntent().getStringExtra("year");
        String noOfQuestions = getIntent().getStringExtra("noOfQuestions");
        String subject = getIntent().getStringExtra("subject");
        timeO = getIntent().getStringExtra("time");

        //txtPNumbering.setText(1 + " / " + noOfQuestions);
        txtPSubjectO.setText(subject);
        txtPYearO.setText(year);

        questionsO = getQuestions(subject, year);
        Collections.shuffle(questionsO);
        finalQuestionsO = new ArrayList<Questions>();

        for (int i = 0; i < strToInt(noOfQuestions); i++) {
            finalQuestionsO.add(questionsO.get(i));
        }
        noOfQuestionsSelectedO = finalQuestionsO.size();
        answersO = new ArrayList<Integer>();
        for (int i = 0; i < noOfQuestionsSelectedO; i++) {
            answersO.add(i, -1);
        }

        questionO = finalQuestionsO.get(questionIdO);

        if(noOfQuestionsSelectedO > 0) {
            showQuestionsAndOptions();
        }


        start();

        if (subject.equals("USE OF ENGLISH")) {
            btnPCalculatorO.setVisibility(View.INVISIBLE);
        }
    }

    private void showQuestionsAndOptions() {
        txtPNumberingO.setText((questionIdO + 1) + " / " + noOfQuestionsSelectedO);
        txtPQuestionTextO.setText(questionO.getQuestionText());
        imageViewPO.setImageBitmap(questionO.getQuestionImage());
        radioP1O.setText(questionO.getOption1());
        radioP2O.setText(questionO.getOption2());
        radioP3O.setText(questionO.getOption3());
        radioP4O.setText(questionO.getOption4());
    }

    private void start() {
        timerO = new CountDownTimer(strToLong(timeO) * 60000, 1000){
            @Override
            public void onTick(long l) {
                String hms = String.format("%02d:%02d:%02d",
                        TimeUnit.MILLISECONDS.toHours(l),
                        TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(l)),
                        TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                txtPrTimeCounterO.setText(hms);
            }

            @Override
            public void onFinish() {
                txtPrTimeCounterO.setText("00:00:00");


            }
        };
        timerO.start();
    }

    private void cancel() {
        if(timerO != null) {
            timerO.cancel();
            timerO = null;
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
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPSubmit:
                timerO.cancel();
                break;
            case R.id.btnPNext:
                if ((questionIdO + 1) >= noOfQuestionsSelectedO) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answersO.get(i) + "");
                    }
                    optionGroupPO.clearCheck();
                    questionIdO = questionIdO + 1;
                    questionO = finalQuestionsO.get(questionIdO);

                    showCheckedOption();
                    showQuestionsAndOptions();
                }

                break;
            case R.id.btnPPrevious:
                if(questionIdO <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answersO.get(i) + "");
                    }
                    questionIdO = questionIdO - 1;
                    optionGroupPO.clearCheck();
                    questionO = questionsO.get(questionIdO);

                    showCheckedOption();
                    showQuestionsAndOptions();
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
        AlertDialog.Builder answerBuilder = new AlertDialog.Builder(PracticeTestMainSubjects.this);
        answerBuilder.setTitle("Passage");

        LayoutInflater factory = LayoutInflater.from(PracticeTestMainSubjects.this);
        final View view = factory.inflate(R.layout.answer, null);

        TextView txtExplanation = (TextView) view.findViewById(R.id.txtExplanation);
        txtExplanation.setText(questionO.getAnswerExplanation());
        TextView txtAnswer = (TextView) view.findViewById(R.id.txtAnswer);
        int ans = questionO.getAnswer();

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
        AlertDialog.Builder passageBuilder = new AlertDialog.Builder(PracticeTestMainSubjects.this);
        passageBuilder.setTitle("Passage");

        LayoutInflater factory = LayoutInflater.from(PracticeTestMainSubjects.this);
        final View view = factory.inflate(R.layout.passage, null);

        TextView txtPassage = (TextView) view.findViewById(R.id.txtPassage);
        txtPassage.setText(questionO.getQuestionPassage());

        passageBuilder.setView(view);
        passageBuilder.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        passageBuilder.show();
    }

    private void showCheckedOption() {
        if(answersO.get(questionIdO) == 0) {
            radioP1O.setChecked(true);
        } else if(answersO.get(questionIdO) == 1) {
            radioP2O.setChecked(true);
        } else if(answersO.get(questionIdO) == 2) {
            radioP3O.setChecked(true);
        } else if(answersO.get(questionIdO) ==  3) {
            radioP4O.setChecked(true);
        } else {
            optionGroupPO.clearCheck();
        }
    }

    public void radioPClick(View v) {
        int radioId = optionGroupPO.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = optionGroupPO.indexOfChild(rb);

        answersO.set(questionIdO, m);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }

    public List<Questions> getQuestions(String subject, String year) {
        seventhO.openDatabase();
        List<Questions> questions = new ArrayList<Questions>();

        String query = "select * from Questions where question_subject = '" + subject + "' and question_year = '" + year + "'";

        Cursor cursor = seventhO.getReadableDatabase().rawQuery(query, null);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practice_test_main_subjects, menu);
        return true;
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
}
