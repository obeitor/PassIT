package com.ObtSoft.passit.app;

import android.database.Cursor;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
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


public class SingeMainTest extends ActionBarActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{
    Button buttonO1;
    Button buttonO2;
    Button buttonO3;
    Button buttonO4;
    Button buttonO5;
    Button buttonO6;
    Button buttonO7;
    Button buttonO8;
    Button buttonO9;
    Button buttonO10;
    Button buttonO11;
    Button buttonO12;
    Button buttonO13;
    Button buttonO14;
    Button buttonO15;
    Button buttonO16;
    Button buttonO17;
    Button buttonO18;
    Button buttonO19;
    Button buttonO20;
    Button buttonO21;
    Button buttonO22;
    Button buttonO23;
    Button buttonO24;
    Button buttonO25;
    Button buttonO26;
    Button buttonO27;
    Button buttonO28;
    Button buttonO29;
    Button buttonO30;
    Button buttonO31;
    Button buttonO32;
    Button buttonO33;
    Button buttonO34;
    Button buttonO35;
    Button buttonO36;
    Button buttonO37;
    Button buttonO38;
    Button buttonO39;
    Button buttonO40;
    Button buttonO41;
    Button buttonO42;
    Button buttonO43;
    Button buttonO44;
    Button buttonO45;
    Button buttonO46;
    Button buttonO47;
    Button buttonO48;
    Button buttonO49;
    Button buttonO50;

    Button btnONext;
    Button btnOPrev;
    Button btnOSubmit;
    Button btnOCalculator;

    TextView txtONumbering;
    TextView txtOSubject;
    TextView txtOYear;
    TextView txtOCounter;
    TextView txtOQuestionText;

    ImageView imageOView;

    RadioGroup optionGroupO;
    RadioButton radio1O;
    RadioButton radio2O;
    RadioButton radio3O;
    RadioButton radio4O;

    String timeO;
    int noOfQuestionsSelectedO;
    int questionIdO = 0;

    Questions questionO;

    SeventhHelper seventhO;
    ArrayList<Integer> answersO;
    List<Questions> questionsO;

    CountDownTimer timerO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singe_main_test);

        seventhO = new SeventhHelper(this);
        seventhO.createDatabase();

        buttonO1 = (Button) findViewById(R.id.buttonO1);
        buttonO2 = (Button) findViewById(R.id.buttonO2);
        buttonO3 = (Button) findViewById(R.id.buttonO3);
        buttonO4 = (Button) findViewById(R.id.buttonO4);
        buttonO5 = (Button) findViewById(R.id.buttonO5);
        buttonO6 = (Button) findViewById(R.id.buttonO6);
        buttonO7 = (Button) findViewById(R.id.buttonO7);
        buttonO8 = (Button) findViewById(R.id.buttonO8);
        buttonO9 = (Button) findViewById(R.id.buttonO9);
        buttonO10 = (Button) findViewById(R.id.buttonO10);
        buttonO11 = (Button) findViewById(R.id.buttonO11);
        buttonO12 = (Button) findViewById(R.id.buttonO12);
        buttonO13 = (Button) findViewById(R.id.buttonO13);
        buttonO14 = (Button) findViewById(R.id.buttonO14);
        buttonO15 = (Button) findViewById(R.id.buttonO15);
        buttonO16 = (Button) findViewById(R.id.buttonO16);
        buttonO17 = (Button) findViewById(R.id.buttonO17);
        buttonO18 = (Button) findViewById(R.id.buttonO18);
        buttonO19 = (Button) findViewById(R.id.buttonO19);
        buttonO20 = (Button) findViewById(R.id.buttonO20);
        buttonO21 = (Button) findViewById(R.id.buttonO21);
        buttonO22 = (Button) findViewById(R.id.buttonO22);
        buttonO23 = (Button) findViewById(R.id.buttonO23);
        buttonO24 = (Button) findViewById(R.id.buttonO24);
        buttonO25 = (Button) findViewById(R.id.buttonO25);
        buttonO26 = (Button) findViewById(R.id.buttonO26);
        buttonO27 = (Button) findViewById(R.id.buttonO27);
        buttonO28 = (Button) findViewById(R.id.buttonO28);
        buttonO29 = (Button) findViewById(R.id.buttonO29);
        buttonO30 = (Button) findViewById(R.id.buttonO30);
        buttonO31 = (Button) findViewById(R.id.buttonO31);
        buttonO32 = (Button) findViewById(R.id.buttonO32);
        buttonO33 = (Button) findViewById(R.id.buttonO33);
        buttonO34 = (Button) findViewById(R.id.buttonO34);
        buttonO35 = (Button) findViewById(R.id.buttonO35);
        buttonO36 = (Button) findViewById(R.id.buttonO36);
        buttonO37 = (Button) findViewById(R.id.buttonO37);
        buttonO38 = (Button) findViewById(R.id.buttonO38);
        buttonO39 = (Button) findViewById(R.id.buttonO39);
        buttonO40 = (Button) findViewById(R.id.buttonO40);
        buttonO41 = (Button) findViewById(R.id.buttonO41);
        buttonO42 = (Button) findViewById(R.id.buttonO42);
        buttonO43 = (Button) findViewById(R.id.buttonO43);
        buttonO44 = (Button) findViewById(R.id.buttonO44);
        buttonO45 = (Button) findViewById(R.id.buttonO45);
        buttonO46 = (Button) findViewById(R.id.buttonO46);
        buttonO47 = (Button) findViewById(R.id.buttonO47);
        buttonO48 = (Button) findViewById(R.id.buttonO48);
        buttonO49 = (Button) findViewById(R.id.buttonO49);
        buttonO50 = (Button) findViewById(R.id.buttonO50);

        btnONext = (Button) findViewById(R.id.btnONext);
        btnOPrev = (Button) findViewById(R.id.btnOPrevious);
        btnOSubmit = (Button) findViewById(R.id.btnOSubmit);
        btnOCalculator = (Button) findViewById(R.id.btnOCalculator);

        txtONumbering = (TextView) findViewById(R.id.txtONumbering);
        txtOSubject = (TextView) findViewById(R.id.txtOSubject);
        txtOYear = (TextView) findViewById(R.id.txtOYearsAndNumber);
        txtOCounter = (TextView) findViewById(R.id.txtTimeOCounter);
        txtOQuestionText = (TextView) findViewById(R.id.txtOQuestionText);

        imageOView = (ImageView) findViewById(R.id.imgOview);

        optionGroupO = (RadioGroup) findViewById(R.id.optionGroupO);
        radio1O = (RadioButton) findViewById(R.id.radio1O);
        radio2O = (RadioButton) findViewById(R.id.radio2O);
        radio3O = (RadioButton) findViewById(R.id.radio3O);
        radio4O = (RadioButton) findViewById(R.id.radio4O);

        buttonO1.setOnClickListener(this);
        buttonO2.setOnClickListener(this);
        buttonO3.setOnClickListener(this);
        buttonO4.setOnClickListener(this);
        buttonO5.setOnClickListener(this);
        buttonO6.setOnClickListener(this);
        buttonO7.setOnClickListener(this);
        buttonO8.setOnClickListener(this);
        buttonO9.setOnClickListener(this);
        buttonO10.setOnClickListener(this);
        buttonO11.setOnClickListener(this);
        buttonO12.setOnClickListener(this);
        buttonO13.setOnClickListener(this);
        buttonO14.setOnClickListener(this);
        buttonO15.setOnClickListener(this);
        buttonO16.setOnClickListener(this);
        buttonO17.setOnClickListener(this);
        buttonO18.setOnClickListener(this);
        buttonO19.setOnClickListener(this);
        buttonO20.setOnClickListener(this);
        buttonO21.setOnClickListener(this);
        buttonO22.setOnClickListener(this);
        buttonO23.setOnClickListener(this);
        buttonO24.setOnClickListener(this);
        buttonO25.setOnClickListener(this);
        buttonO26.setOnClickListener(this);
        buttonO27.setOnClickListener(this);
        buttonO28.setOnClickListener(this);
        buttonO29.setOnClickListener(this);
        buttonO30.setOnClickListener(this);
        buttonO31.setOnClickListener(this);
        buttonO32.setOnClickListener(this);
        buttonO33.setOnClickListener(this);
        buttonO34.setOnClickListener(this);
        buttonO35.setOnClickListener(this);
        buttonO36.setOnClickListener(this);
        buttonO37.setOnClickListener(this);
        buttonO38.setOnClickListener(this);
        buttonO39.setOnClickListener(this);
        buttonO40.setOnClickListener(this);
        buttonO41.setOnClickListener(this);
        buttonO42.setOnClickListener(this);
        buttonO43.setOnClickListener(this);
        buttonO44.setOnClickListener(this);
        buttonO45.setOnClickListener(this);
        buttonO46.setOnClickListener(this);
        buttonO47.setOnClickListener(this);
        buttonO48.setOnClickListener(this);
        buttonO49.setOnClickListener(this);
        buttonO50.setOnClickListener(this);

        btnONext.setOnClickListener(this);
        btnOCalculator.setOnClickListener(this);
        btnOPrev.setOnClickListener(this);
        btnOSubmit.setOnClickListener(this);

        optionGroupO.setOnCheckedChangeListener(this);

        String year = getIntent().getStringExtra("year");
        String noOfQuestions = getIntent().getStringExtra("noOfQuestions");
        String subject = getIntent().getStringExtra("subject");
        timeO = getIntent().getStringExtra("time");

        txtOSubject.setText(subject);
        txtOYear.setText(year);

        questionsO = getQuestions(subject, year);

        noOfQuestionsSelectedO = questionsO.size();
        answersO = new ArrayList<Integer>();
        for (int i = 0; i < noOfQuestionsSelectedO; i++) {
            answersO.add(i, -1);
        }

        questionO = questionsO.get(questionIdO);

        if(noOfQuestionsSelectedO > 0) {
            showQuestionsAndOptions();
            showCheckedOption();
            checkAnswered();
        }
        start();
    }

    private void showQuestionsAndOptions() {
        txtONumbering.setText((questionIdO + 1) + " / " + noOfQuestionsSelectedO);
        txtOQuestionText.setText(questionO.getQuestionText());
        imageOView.setImageBitmap(questionO.getQuestionImage());
        radio1O.setText(questionO.getOption1());
        radio2O.setText(questionO.getOption2());
        radio3O.setText(questionO.getOption3());
        radio4O.setText(questionO.getOption4());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.singe_main_test, menu);
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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnONext:
                if ((questionIdO + 1) >= noOfQuestionsSelectedO) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answersO.get(i) + "");
                    }
                    optionGroupO.clearCheck();
                    questionIdO = questionIdO + 1;
                    questionO = questionsO.get(questionIdO);

                    showCheckedOption();
                    showQuestionsAndOptions();
                    checkAnswered();
                }
                break;
            case R.id.btnOPrevious:
                if(questionIdO <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answersO.get(i) + "");
                    }
                    questionIdO = questionIdO - 1;
                    optionGroupO.clearCheck();
                    questionO = questionsO.get(questionIdO);

                    showCheckedOption();
                    showQuestionsAndOptions();
                    checkAnswered();
                }
                break;
            case R.id.btnOSubmit:
                break;
            case R.id.buttonO1:
                questionIdO = 0;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO2:
                questionIdO = 1;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO3:
                questionIdO = 2;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO4:
                questionIdO = 3;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO5:
                questionIdO = 4;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO6:
                questionIdO = 5;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO7:
                questionIdO = 6;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO8:
                questionIdO = 7;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO9:
                questionIdO = 8;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO10:
                questionIdO = 9;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO11:
                questionIdO = 10;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO12:
                questionIdO = 11;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO13:
                questionIdO = 12;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO14:
                questionIdO = 13;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO15:
                questionIdO = 14;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO16:
                questionIdO = 15;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO17:
                questionIdO = 16;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO18:
                questionIdO = 17;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO19:
                questionIdO = 18;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO20:
                questionIdO = 19;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO21:
                questionIdO = 20;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO22:
                questionIdO = 21;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO23:
                questionIdO = 22;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO24:
                questionIdO = 23;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO25:
                questionIdO = 24;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO26:
                questionIdO = 25;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO27:
                questionIdO = 26;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO28:
                questionIdO = 27;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO29:
                questionIdO = 28;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO30:
                questionIdO = 29;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO31:
                questionIdO = 30;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO32:
                questionIdO = 31;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO33:
                questionIdO = 32;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO34:
                questionIdO = 33;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO35:
                questionIdO = 34;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO36:
                questionIdO = 35;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO37:
                questionIdO = 36;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO38:
                questionIdO = 37;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO39:
                questionIdO = 38;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO40:
                questionIdO = 39;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO41:
                questionIdO = 40;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO42:
                questionIdO = 41;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO43:
                questionIdO = 42;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO44:
                questionIdO = 43;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO45:
                questionIdO = 44;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO46:
                questionIdO = 45;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO47:
                questionIdO = 46;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO48:
                questionIdO = 47;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO49:
                questionIdO = 48;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonO50:
                questionIdO = 49;
                questionO = questionsO.get(questionIdO);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
        }
    }

    private void checkAnswered() {
        if (answersO.get(0) != -1) {
            buttonO1.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(1) != -1) {
            buttonO2.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(2) != -1) {
            buttonO3.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(3) != -1) {
            buttonO4.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(4) != -1) {
            buttonO5.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(5) != -1) {
            buttonO6.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(6) != -1) {
            buttonO7.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(7) != -1) {
            buttonO8.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(8) != -1) {
            buttonO9.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(9) != -1) {
            buttonO10.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(10) != -1) {
            buttonO11.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(11) != -1) {
            buttonO12.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(12) != -1) {
            buttonO13.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(13) != -1) {
            buttonO14.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(14) != -1) {
            buttonO15.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(15) != -1) {
            buttonO16.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(16) != -1) {
            buttonO17.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(17) != -1) {
            buttonO18.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(18) != -1) {
            buttonO19.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(19) != -1) {
            buttonO20.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(20) != -1) {
            buttonO21.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(21) != -1) {
            buttonO22.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(22) != -1) {
            buttonO23.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(23) != -1) {
            buttonO24.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(24) != -1) {
            buttonO25.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(25) != -1) {
            buttonO26.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(26) != -1) {
            buttonO27.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(27) != -1) {
            buttonO28.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(28) != -1) {
            buttonO29.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(29) != -1) {
            buttonO30.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(30) != -1) {
            buttonO31.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(31) != -1) {
            buttonO32.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(32) != -1) {
            buttonO33.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(33) != -1) {
            buttonO34.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(34) != -1) {
            buttonO35.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(35) != -1) {
            buttonO36.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(36) != -1) {
            buttonO37.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(37) != -1) {
            buttonO38.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(38) != -1) {
            buttonO39.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(39) != -1) {
            buttonO40.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(40) != -1) {
            buttonO41.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(41) != -1) {
            buttonO42.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(42) != -1) {
            buttonO43.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(43) != -1) {
            buttonO44.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(44) != -1) {
            buttonO45.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(45) != -1) {
            buttonO46.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(46) != -1) {
            buttonO47.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(47) != -1) {
            buttonO48.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(48) != -1) {
            buttonO49.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersO.get(49) != -1) {
            buttonO50.setBackgroundColor(R.drawable.button_curved_color);
        }
    }

    private void showCheckedOption() {
        if(answersO.get(questionIdO) == 0) {
            radio1O.setChecked(true);
        } else if(answersO.get(questionIdO) == 1) {
            radio2O.setChecked(true);
        } else if(answersO.get(questionIdO) == 2) {
            radio3O.setChecked(true);
        } else if(answersO.get(questionIdO) ==  3) {
            radio4O.setChecked(true);
        } else {
            optionGroupO.clearCheck();
        }
    }

    public void singleTestClick(View v) {
        int radioId = optionGroupO.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = optionGroupO.indexOfChild(rb);
        answersO.set(questionIdO, m);

        checkAnswered();
    }

    private void start() {
        timerO = new CountDownTimer(strToLong(timeO) * 60000, 1000){
            @Override
            public void onTick(long l) {
                String hms = String.format("%02d:%02d:%02d",
                        TimeUnit.MILLISECONDS.toHours(l),
                        TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(l)),
                        TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                txtOCounter.setText(hms);
            }

            @Override
            public void onFinish() {
                txtOCounter.setText("00:00:00");
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
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }
}
