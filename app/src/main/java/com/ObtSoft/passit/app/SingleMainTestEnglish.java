package com.ObtSoft.passit.app;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SingleMainTestEnglish extends ActionBarActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{
    Button buttonE1;
    Button buttonE2;
    Button buttonE3;
    Button buttonE4;
    Button buttonE5;
    Button buttonE6;
    Button buttonE7;
    Button buttonE8;
    Button buttonE9;
    Button buttonE10;
    Button buttonE11;
    Button buttonE12;
    Button buttonE13;
    Button buttonE14;
    Button buttonE15;
    Button buttonE16;
    Button buttonE17;
    Button buttonE18;
    Button buttonE19;
    Button buttonE20;
    Button buttonE21;
    Button buttonE22;
    Button buttonE23;
    Button buttonE24;
    Button buttonE25;
    Button buttonE26;
    Button buttonE27;
    Button buttonE28;
    Button buttonE29;
    Button buttonE30;
    Button buttonE31;
    Button buttonE32;
    Button buttonE33;
    Button buttonE34;
    Button buttonE35;
    Button buttonE36;
    Button buttonE37;
    Button buttonE38;
    Button buttonE39;
    Button buttonE40;
    Button buttonE41;
    Button buttonE42;
    Button buttonE43;
    Button buttonE44;
    Button buttonE45;
    Button buttonE46;
    Button buttonE47;
    Button buttonE48;
    Button buttonE49;
    Button buttonE50;
    Button buttonE51;
    Button buttonE52;
    Button buttonE53;
    Button buttonE54;
    Button buttonE55;
    Button buttonE56;
    Button buttonE57;
    Button buttonE58;
    Button buttonE59;
    Button buttonE60;
    Button buttonE61;
    Button buttonE62;
    Button buttonE63;
    Button buttonE64;
    Button buttonE65;
    Button buttonE66;
    Button buttonE67;
    Button buttonE68;
    Button buttonE69;
    Button buttonE70;
    Button buttonE71;
    Button buttonE72;
    Button buttonE73;
    Button buttonE74;
    Button buttonE75;
    Button buttonE76;
    Button buttonE77;
    Button buttonE78;
    Button buttonE79;
    Button buttonE80;
    Button buttonE81;
    Button buttonE82;
    Button buttonE83;
    Button buttonE84;
    Button buttonE85;
    Button buttonE86;
    Button buttonE87;
    Button buttonE88;
    Button buttonE89;
    Button buttonE90;
    Button buttonE91;
    Button buttonE92;
    Button buttonE93;
    Button buttonE94;
    Button buttonE95;
    Button buttonE96;
    Button buttonE97;
    Button buttonE98;
    Button buttonE99;
    Button buttonE100;

    Button btnENext;
    Button btnEPrev;
    Button btnESubmit;
    Button btnEPassage;

    TextView txtENumbering;
    TextView txtESubject;
    TextView txtEYear;
    TextView txtECounter;
    TextView txtEQuestionText;

    ImageView imageEView;

    RadioGroup optionGroupE;
    RadioButton radio1E;
    RadioButton radio2E;
    RadioButton radio3E;
    RadioButton radio4E;

    String timeE;
    int noOfQuestionsSelectedE;
    int questionIdE = 0;

    Questions questionE;

    SeventhHelper seventhE;
    ArrayList<Integer> answersE;
    List<Questions> questionsE;
    List<Questions> finalQuestionsE;

    CountDownTimer timerE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_main_test_english);

        seventhE = new SeventhHelper(this);
        seventhE.createDatabase();

        buttonE1 = (Button) findViewById(R.id.buttonE1);
        buttonE2 = (Button) findViewById(R.id.buttonE2);
        buttonE3 = (Button) findViewById(R.id.buttonE3);
        buttonE4 = (Button) findViewById(R.id.buttonE4);
        buttonE5 = (Button) findViewById(R.id.buttonE5);
        buttonE6 = (Button) findViewById(R.id.buttonE6);
        buttonE7 = (Button) findViewById(R.id.buttonE7);
        buttonE8 = (Button) findViewById(R.id.buttonE8);
        buttonE9 = (Button) findViewById(R.id.buttonE9);
        buttonE10 = (Button) findViewById(R.id.buttonE10);
        buttonE11 = (Button) findViewById(R.id.buttonE11);
        buttonE12 = (Button) findViewById(R.id.buttonE12);
        buttonE13 = (Button) findViewById(R.id.buttonE13);
        buttonE14 = (Button) findViewById(R.id.buttonE14);
        buttonE15 = (Button) findViewById(R.id.buttonE15);
        buttonE16 = (Button) findViewById(R.id.buttonE16);
        buttonE17 = (Button) findViewById(R.id.buttonE17);
        buttonE18 = (Button) findViewById(R.id.buttonE18);
        buttonE19 = (Button) findViewById(R.id.buttonE19);
        buttonE20 = (Button) findViewById(R.id.buttonE20);
        buttonE21 = (Button) findViewById(R.id.buttonE21);
        buttonE22 = (Button) findViewById(R.id.buttonE22);
        buttonE23 = (Button) findViewById(R.id.buttonE23);
        buttonE24 = (Button) findViewById(R.id.buttonE24);
        buttonE25 = (Button) findViewById(R.id.buttonE25);
        buttonE26 = (Button) findViewById(R.id.buttonE26);
        buttonE27 = (Button) findViewById(R.id.buttonE27);
        buttonE28 = (Button) findViewById(R.id.buttonE28);
        buttonE29 = (Button) findViewById(R.id.buttonE29);
        buttonE30 = (Button) findViewById(R.id.buttonE30);
        buttonE31 = (Button) findViewById(R.id.buttonE31);
        buttonE32 = (Button) findViewById(R.id.buttonE32);
        buttonE33 = (Button) findViewById(R.id.buttonE33);
        buttonE34 = (Button) findViewById(R.id.buttonE34);
        buttonE35 = (Button) findViewById(R.id.buttonE35);
        buttonE36 = (Button) findViewById(R.id.buttonE36);
        buttonE37 = (Button) findViewById(R.id.buttonE37);
        buttonE38 = (Button) findViewById(R.id.buttonE38);
        buttonE39 = (Button) findViewById(R.id.buttonE39);
        buttonE40 = (Button) findViewById(R.id.buttonE40);
        buttonE41 = (Button) findViewById(R.id.buttonE41);
        buttonE42 = (Button) findViewById(R.id.buttonE42);
        buttonE43 = (Button) findViewById(R.id.buttonE43);
        buttonE44 = (Button) findViewById(R.id.buttonE44);
        buttonE45 = (Button) findViewById(R.id.buttonE45);
        buttonE46 = (Button) findViewById(R.id.buttonE46);
        buttonE47 = (Button) findViewById(R.id.buttonE47);
        buttonE48 = (Button) findViewById(R.id.buttonE48);
        buttonE49 = (Button) findViewById(R.id.buttonE49);
        buttonE50 = (Button) findViewById(R.id.buttonE50);
        buttonE51 = (Button) findViewById(R.id.buttonE51);
        buttonE52 = (Button) findViewById(R.id.buttonE52);
        buttonE53 = (Button) findViewById(R.id.buttonE53);
        buttonE54 = (Button) findViewById(R.id.buttonE54);
        buttonE55 = (Button) findViewById(R.id.buttonE55);
        buttonE56 = (Button) findViewById(R.id.buttonE56);
        buttonE57 = (Button) findViewById(R.id.buttonE57);
        buttonE58 = (Button) findViewById(R.id.buttonE58);
        buttonE59 = (Button) findViewById(R.id.buttonE59);
        buttonE60 = (Button) findViewById(R.id.buttonE60);
        buttonE61 = (Button) findViewById(R.id.buttonE61);
        buttonE62 = (Button) findViewById(R.id.buttonE62);
        buttonE63 = (Button) findViewById(R.id.buttonE63);
        buttonE64 = (Button) findViewById(R.id.buttonE64);
        buttonE65 = (Button) findViewById(R.id.buttonE65);
        buttonE66 = (Button) findViewById(R.id.buttonE66);
        buttonE67 = (Button) findViewById(R.id.buttonE67);
        buttonE68 = (Button) findViewById(R.id.buttonE68);
        buttonE69 = (Button) findViewById(R.id.buttonE69);
        buttonE70 = (Button) findViewById(R.id.buttonE70);
        buttonE71 = (Button) findViewById(R.id.buttonE71);
        buttonE72 = (Button) findViewById(R.id.buttonE72);
        buttonE73 = (Button) findViewById(R.id.buttonE73);
        buttonE74 = (Button) findViewById(R.id.buttonE74);
        buttonE75 = (Button) findViewById(R.id.buttonE75);
        buttonE76 = (Button) findViewById(R.id.buttonE76);
        buttonE77 = (Button) findViewById(R.id.buttonE77);
        buttonE78 = (Button) findViewById(R.id.buttonE78);
        buttonE79 = (Button) findViewById(R.id.buttonE79);
        buttonE80 = (Button) findViewById(R.id.buttonE80);
        buttonE81 = (Button) findViewById(R.id.buttonE81);
        buttonE82 = (Button) findViewById(R.id.buttonE82);
        buttonE83 = (Button) findViewById(R.id.buttonE83);
        buttonE84 = (Button) findViewById(R.id.buttonE84);
        buttonE85 = (Button) findViewById(R.id.buttonE85);
        buttonE86 = (Button) findViewById(R.id.buttonE8);
        buttonE87 = (Button) findViewById(R.id.buttonE87);
        buttonE88 = (Button) findViewById(R.id.buttonE88);
        buttonE89 = (Button) findViewById(R.id.buttonE89);
        buttonE90 = (Button) findViewById(R.id.buttonE90);
        buttonE91 = (Button) findViewById(R.id.buttonE91);
        buttonE92 = (Button) findViewById(R.id.buttonE92);
        buttonE93 = (Button) findViewById(R.id.buttonE93);
        buttonE94 = (Button) findViewById(R.id.buttonE94);
        buttonE95 = (Button) findViewById(R.id.buttonE95);
        buttonE96 = (Button) findViewById(R.id.buttonE96);
        buttonE97 = (Button) findViewById(R.id.buttonE97);
        buttonE98 = (Button) findViewById(R.id.buttonE98);
        buttonE99 = (Button) findViewById(R.id.buttonE99);
        buttonE100 = (Button) findViewById(R.id.buttonE100);

        btnENext = (Button) findViewById(R.id.btnENext);
        btnEPrev = (Button) findViewById(R.id.btnEPrevious);
        btnESubmit = (Button) findViewById(R.id.btnESubmit);
        btnEPassage = (Button) findViewById(R.id.btnEPassage);

        txtENumbering = (TextView) findViewById(R.id.txtENumbering);
        txtESubject = (TextView) findViewById(R.id.txtESubject);
        txtEYear = (TextView) findViewById(R.id.txtEYearsAndNumber);
        txtECounter = (TextView) findViewById(R.id.txtTimeECounter);
        txtEQuestionText = (TextView) findViewById(R.id.txtEQuestionText);

        imageEView = (ImageView) findViewById(R.id.imgEview);

        optionGroupE = (RadioGroup) findViewById(R.id.optionGroupE);
        radio1E = (RadioButton) findViewById(R.id.radio1E);
        radio2E = (RadioButton) findViewById(R.id.radio2E);
        radio3E = (RadioButton) findViewById(R.id.radio3E);
        radio4E = (RadioButton) findViewById(R.id.radio4E);

        buttonE1.setOnClickListener(this);
        buttonE2.setOnClickListener(this);
        buttonE3.setOnClickListener(this);
        buttonE4.setOnClickListener(this);
        buttonE5.setOnClickListener(this);
        buttonE6.setOnClickListener(this);
        buttonE7.setOnClickListener(this);
        buttonE8.setOnClickListener(this);
        buttonE9.setOnClickListener(this);
        buttonE10.setOnClickListener(this);
        buttonE11.setOnClickListener(this);
        buttonE12.setOnClickListener(this);
        buttonE13.setOnClickListener(this);
        buttonE14.setOnClickListener(this);
        buttonE15.setOnClickListener(this);
        buttonE16.setOnClickListener(this);
        buttonE17.setOnClickListener(this);
        buttonE18.setOnClickListener(this);
        buttonE19.setOnClickListener(this);
        buttonE20.setOnClickListener(this);
        buttonE21.setOnClickListener(this);
        buttonE22.setOnClickListener(this);
        buttonE23.setOnClickListener(this);
        buttonE24.setOnClickListener(this);
        buttonE25.setOnClickListener(this);
        buttonE26.setOnClickListener(this);
        buttonE27.setOnClickListener(this);
        buttonE28.setOnClickListener(this);
        buttonE29.setOnClickListener(this);
        buttonE30.setOnClickListener(this);
        buttonE31.setOnClickListener(this);
        buttonE32.setOnClickListener(this);
        buttonE33.setOnClickListener(this);
        buttonE34.setOnClickListener(this);
        buttonE35.setOnClickListener(this);
        buttonE36.setOnClickListener(this);
        buttonE37.setOnClickListener(this);
        buttonE38.setOnClickListener(this);
        buttonE39.setOnClickListener(this);
        buttonE40.setOnClickListener(this);
        buttonE41.setOnClickListener(this);
        buttonE42.setOnClickListener(this);
        buttonE43.setOnClickListener(this);
        buttonE44.setOnClickListener(this);
        buttonE45.setOnClickListener(this);
        buttonE46.setOnClickListener(this);
        buttonE47.setOnClickListener(this);
        buttonE48.setOnClickListener(this);
        buttonE49.setOnClickListener(this);
        buttonE50.setOnClickListener(this);
        buttonE51.setOnClickListener(this);
        buttonE52.setOnClickListener(this);
        buttonE53.setOnClickListener(this);
        buttonE54.setOnClickListener(this);
        buttonE55.setOnClickListener(this);
        buttonE56.setOnClickListener(this);
        buttonE57.setOnClickListener(this);
        buttonE58.setOnClickListener(this);
        buttonE59.setOnClickListener(this);
        buttonE60.setOnClickListener(this);
        buttonE61.setOnClickListener(this);
        buttonE62.setOnClickListener(this);
        buttonE63.setOnClickListener(this);
        buttonE64.setOnClickListener(this);
        buttonE65.setOnClickListener(this);
        buttonE66.setOnClickListener(this);
        buttonE67.setOnClickListener(this);
        buttonE68.setOnClickListener(this);
        buttonE69.setOnClickListener(this);
        buttonE70.setOnClickListener(this);
        buttonE71.setOnClickListener(this);
        buttonE72.setOnClickListener(this);
        buttonE73.setOnClickListener(this);
        buttonE74.setOnClickListener(this);
        buttonE75.setOnClickListener(this);
        buttonE76.setOnClickListener(this);
        buttonE77.setOnClickListener(this);
        buttonE78.setOnClickListener(this);
        buttonE79.setOnClickListener(this);
        buttonE80.setOnClickListener(this);
        buttonE81.setOnClickListener(this);
        buttonE82.setOnClickListener(this);
        buttonE83.setOnClickListener(this);
        buttonE84.setOnClickListener(this);
        buttonE85.setOnClickListener(this);
        buttonE86.setOnClickListener(this);
        buttonE87.setOnClickListener(this);
        buttonE88.setOnClickListener(this);
        buttonE89.setOnClickListener(this);
        buttonE90.setOnClickListener(this);
        buttonE91.setOnClickListener(this);
        buttonE92.setOnClickListener(this);
        buttonE93.setOnClickListener(this);
        buttonE94.setOnClickListener(this);
        buttonE95.setOnClickListener(this);
        buttonE96.setOnClickListener(this);
        buttonE97.setOnClickListener(this);
        buttonE98.setOnClickListener(this);
        buttonE99.setOnClickListener(this);
        buttonE100.setOnClickListener(this);

        btnENext.setOnClickListener(this);
        btnEPassage.setOnClickListener(this);
        btnEPrev.setOnClickListener(this);
        btnESubmit.setOnClickListener(this);

        optionGroupE.setOnCheckedChangeListener(this);

        String year = getIntent().getStringExtra("year");
        String noOfQuestions = getIntent().getStringExtra("noOfQuestions");
        String subject = getIntent().getStringExtra("subject");
        timeE = getIntent().getStringExtra("time");

        txtESubject.setText(subject);
        txtEYear.setText(year);

        questionsE = getQuestions(subject, year);

        noOfQuestionsSelectedE = questionsE.size();
        answersE = new ArrayList<Integer>();
        for (int i = 0; i < noOfQuestionsSelectedE; i++) {
            answersE.add(i, -1);
        }

        questionE = questionsE.get(questionIdE);

        if(noOfQuestionsSelectedE > 0) {
            showQuestionsAndOptions();
            checkAnswered();
            showCheckedOption();
        }


        start();

    }

    private void showQuestionsAndOptions() {
        txtENumbering.setText((questionIdE + 1) + " / " + noOfQuestionsSelectedE);
        txtEQuestionText.setText(questionE.getQuestionText());
        imageEView.setImageBitmap(questionE.getQuestionImage());
        radio1E.setText(questionE.getOption1());
        radio2E.setText(questionE.getOption2());
        radio3E.setText(questionE.getOption3());
        radio4E.setText(questionE.getOption4());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.single_main_test_english, menu);
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
            case R.id.btnENext:
                if ((questionIdE + 1) >= noOfQuestionsSelectedE) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answersE.get(i) + "");
                    }
                    optionGroupE.clearCheck();
                    questionIdE = questionIdE + 1;
                    questionE = questionsE.get(questionIdE);

                    showCheckedOption();
                    showQuestionsAndOptions();
                    checkAnswered();
                }
                break;
            case R.id.btnEPrevious:
                if(questionIdE <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", answersE.get(i) + "");
                    }
                    questionIdE = questionIdE - 1;
                    optionGroupE.clearCheck();
                    questionE = questionsE.get(questionIdE);

                    showCheckedOption();
                    showQuestionsAndOptions();
                    checkAnswered();
                }
                break;
            case R.id.btnESubmit:
                break;
            case R.id.buttonE1:
                questionIdE = 0;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE2:
                questionIdE = 1;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE3:
                questionIdE = 2;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE4:
                questionIdE = 3;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE5:
                questionIdE = 4;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE6:
                questionIdE = 5;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE7:
                questionIdE = 6;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE8:
                questionIdE = 7;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE9:
                questionIdE = 8;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE10:
                questionIdE = 9;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE11:
                questionIdE = 10;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE12:
                questionIdE = 11;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE13:
                questionIdE = 12;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE14:
                questionIdE = 13;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE15:
                questionIdE = 14;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE16:
                questionIdE = 15;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE17:
                questionIdE = 16;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE18:
                questionIdE = 17;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE19:
                questionIdE = 18;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE20:
                questionIdE = 19;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE21:
                questionIdE = 20;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE22:
                questionIdE = 21;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE23:
                questionIdE = 22;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE24:
                questionIdE = 23;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE25:
                questionIdE = 24;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE26:
                questionIdE = 25;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE27:
                questionIdE = 26;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE28:
                questionIdE = 27;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE29:
                questionIdE = 28;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE30:
                questionIdE = 29;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE31:
                questionIdE = 30;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE32:
                questionIdE = 31;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE33:
                questionIdE = 32;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE34:
                questionIdE = 33;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE35:
                questionIdE = 34;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE36:
                questionIdE = 35;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE37:
                questionIdE = 36;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE38:
                questionIdE = 37;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE39:
                questionIdE = 38;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE40:
                questionIdE = 39;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE41:
                questionIdE = 40;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE42:
                questionIdE = 41;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE43:
                questionIdE = 42;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE44:
                questionIdE = 43;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE45:
                questionIdE = 44;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE46:
                questionIdE = 45;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE47:
                questionIdE = 46;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE48:
                questionIdE = 47;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE49:
                questionIdE = 48;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE50:
                questionIdE = 49;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE51:
                questionIdE = 50;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE52:
                questionIdE = 51;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE53:
                questionIdE = 52;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE54:
                questionIdE = 53;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE55:
                questionIdE = 54;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE56:
                questionIdE = 55;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE57:
                questionIdE = 56;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE58:
                questionIdE = 57;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE59:
                questionIdE = 58;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE60:
                questionIdE = 59;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE61:
                questionIdE = 60;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE62:
                questionIdE = 61;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE63:
                questionIdE = 62;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE64:
                questionIdE = 63;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE65:
                questionIdE = 64;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE66:
                questionIdE = 65;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE67:
                questionIdE = 66;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE68:
                questionIdE = 67;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE69:
                questionIdE = 68;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE70:
                questionIdE = 69;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE71:
                questionIdE = 70;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE72:
                questionIdE = 71;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE73:
                questionIdE = 72;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE74:
                questionIdE = 73;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE75:
                questionIdE = 74;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE76:
                questionIdE = 75;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE77:
                questionIdE = 76;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE78:
                questionIdE = 77;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE79:
                questionIdE = 78;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE80:
                questionIdE = 79;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE81:
                questionIdE = 80;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE82:
                questionIdE = 81;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE83:
                questionIdE = 82;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE84:
                questionIdE = 83;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE85:
                questionIdE = 84;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE86:
                questionIdE = 85;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE87:
                questionIdE = 86;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE88:
                questionIdE = 87;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE89:
                questionIdE = 88;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE90:
                questionIdE = 89;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE91:
                questionIdE = 90;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE92:
                questionIdE = 91;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE93:
                questionIdE = 92;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE94:
                questionIdE = 93;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE95:
                questionIdE = 94;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE96:
                questionIdE = 95;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE97:
                questionIdE = 96;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE98:
                questionIdE = 97;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE99:
                questionIdE = 98;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.buttonE100:
                questionIdE = 99;
                questionE = questionsE.get(questionIdE);
                showCheckedOption();
                showQuestionsAndOptions();
                checkAnswered();
                break;
            case R.id.btnEPassage:
                showPassage();
                break;
        }
    }

    private void showPassage() {
        AlertDialog.Builder passageBuilder = new AlertDialog.Builder(SingleMainTestEnglish.this);
        passageBuilder.setTitle("Passage");

        LayoutInflater factory = LayoutInflater.from(SingleMainTestEnglish.this);
        final View view = factory.inflate(R.layout.passage, null);

        TextView txtPassage = (TextView) view.findViewById(R.id.txtPassage);
        txtPassage.setText(questionE.getQuestionPassage());

        passageBuilder.setView(view);
        passageBuilder.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        passageBuilder.show();
    }

    private void checkAnswered() {
        if (answersE.get(0) != -1) {
            buttonE1.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(1) != -1) {
            buttonE2.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(2) != -1) {
            buttonE3.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(3) != -1) {
            buttonE4.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(4) != -1) {
            buttonE5.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(5) != -1) {
            buttonE6.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(6) != -1) {
            buttonE7.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(7) != -1) {
            buttonE8.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(8) != -1) {
            buttonE9.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(9) != -1) {
            buttonE10.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(10) != -1) {
            buttonE11.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(11) != -1) {
            buttonE12.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(12) != -1) {
            buttonE13.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(13) != -1) {
            buttonE14.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(14) != -1) {
            buttonE15.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(15) != -1) {
            buttonE16.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(16) != -1) {
            buttonE17.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(17) != -1) {
            buttonE18.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(18) != -1) {
            buttonE19.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(19) != -1) {
            buttonE20.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(20) != -1) {
            buttonE21.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(21) != -1) {
            buttonE22.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(22) != -1) {
            buttonE23.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(23) != -1) {
            buttonE24.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(24) != -1) {
            buttonE25.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(25) != -1) {
            buttonE26.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(26) != -1) {
            buttonE27.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(27) != -1) {
            buttonE28.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(28) != -1) {
            buttonE29.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(29) != -1) {
            buttonE30.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(30) != -1) {
            buttonE31.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(31) != -1) {
            buttonE32.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(32) != -1) {
            buttonE33.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(33) != -1) {
            buttonE34.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(34) != -1) {
            buttonE35.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(35) != -1) {
            buttonE36.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(36) != -1) {
            buttonE37.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(37) != -1) {
            buttonE38.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(38) != -1) {
            buttonE39.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(39) != -1) {
            buttonE40.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(40) != -1) {
            buttonE41.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(41) != -1) {
            buttonE42.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(42) != -1) {
            buttonE43.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(43) != -1) {
            buttonE44.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(44) != -1) {
            buttonE45.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(45) != -1) {
            buttonE46.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(46) != -1) {
            buttonE47.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(47) != -1) {
            buttonE48.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(48) != -1) {
            buttonE49.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(49) != -1) {
            buttonE50.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(50) != -1) {
            buttonE51.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(51) != -1) {
            buttonE52.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(52) != -1) {
            buttonE53.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(53) != -1) {
            buttonE54.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(54) != -1) {
            buttonE55.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(55) != -1) {
            buttonE56.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(56) != -1) {
            buttonE57.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(57) != -1) {
            buttonE58.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(58) != -1) {
            buttonE59.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(59) != -1) {
            buttonE60.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(60) != -1) {
            buttonE61.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(61) != -1) {
            buttonE62.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(62) != -1) {
            buttonE63.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(63) != -1) {
            buttonE64.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(64) != -1) {
            buttonE65.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(65) != -1) {
            buttonE66.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(66) != -1) {
            buttonE67.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(67) != -1) {
            buttonE68.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(68) != -1) {
            buttonE69.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(69) != -1) {
            buttonE70.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(70) != -1) {
            buttonE71.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(71) != -1) {
            buttonE72.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(72) != -1) {
            buttonE73.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(73) != -1) {
            buttonE74.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(74) != -1) {
            buttonE75.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(75) != -1) {
            buttonE76.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(76) != -1) {
            buttonE77.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(77) != -1) {
            buttonE78.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(78) != -1) {
            buttonE79.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(79) != -1) {
            buttonE80.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(80) != -1) {
            buttonE81.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(81) != -1) {
            buttonE82.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(82) != -1) {
            buttonE83.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(83) != -1) {
            buttonE84.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(84) != -1) {
            buttonE85.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(85) != -1) {
            buttonE86.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(86) != -1) {
            buttonE87.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(87) != -1) {
            buttonE88.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(88) != -1) {
            buttonE89.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(89) != -1) {
            buttonE90.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(90) != -1) {
            buttonE91.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(91) != -1) {
            buttonE92.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(92) != -1) {
            buttonE93.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(93) != -1) {
            buttonE94.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(94) != -1) {
            buttonE95.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(95) != -1) {
            buttonE96.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(96) != -1) {
            buttonE97.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(97) != -1) {
            buttonE98.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(98) != -1) {
            buttonE99.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (answersE.get(99) != -1) {
            buttonE100.setBackgroundColor(R.drawable.button_curved_color);
        }
    }

    private void showCheckedOption() {
        if(answersE.get(questionIdE) == 0) {
            radio1E.setChecked(true);
        } else if(answersE.get(questionIdE) == 1) {
            radio2E.setChecked(true);
        } else if(answersE.get(questionIdE) == 2) {
            radio3E.setChecked(true);
        } else if(answersE.get(questionIdE) ==  3) {
            radio4E.setChecked(true);
        } else {
            optionGroupE.clearCheck();
        }
    }

    public void englishTestClick(View v) {
        int radioId = optionGroupE.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = optionGroupE.indexOfChild(rb);
        answersE.set(questionIdE, m);
        checkAnswered();
    }

    private void start() {
        timerE = new CountDownTimer(strToLong(timeE) * 60000, 1000){
            @Override
            public void onTick(long l) {
                String hms = String.format("%02d:%02d:%02d",
                        TimeUnit.MILLISECONDS.toHours(l),
                        TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(l)),
                        TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                txtECounter.setText(hms);
            }

            @Override
            public void onFinish() {
                txtECounter.setText("00:00:00");
            }
        };
        timerE.start();
    }

    private void cancel() {
        if(timerE != null) {
            timerE.cancel();
            timerE = null;
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
        seventhE.openDatabase();
        List<Questions> questions = new ArrayList<Questions>();

        String query = "select * from Questions where question_subject = '" + subject + "' and question_year = '" + year + "'";

        Cursor cursor = seventhE.getReadableDatabase().rawQuery(query, null);

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
