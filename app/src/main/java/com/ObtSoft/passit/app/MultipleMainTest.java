package com.ObtSoft.passit.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleMainTest extends Activity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    CountDownTimer timer;
    ImageView firstmage;
    ImageView secondImage;
    ImageView thirdImage;
    ImageView fourthImage;

    Button btnSubmit;
    //First Page Button
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;
    Button button28;
    Button button29;
    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    Button button39;
    Button button40;
    Button button41;
    Button button42;
    Button button43;
    Button button44;
    Button button45;
    Button button46;
    Button button47;
    Button button48;
    Button button49;
    Button button50;
    Button button51;
    Button button52;
    Button button53;
    Button button54;
    Button button55;
    Button button56;
    Button button57;
    Button button58;
    Button button59;
    Button button60;
    Button button250;
    Button button251;
    Button button252;
    Button button253;
    Button button254;
    Button button255;
    Button button256;
    Button button257;
    Button button258;
    Button button259;
    Button button260;
    Button button261;
    Button button262;
    Button button263;
    Button button264;
    Button button265;
    Button button266;
    Button button267;
    Button button268;
    Button button269;
    Button button270;
    Button button271;
    Button button272;
    Button button273;
    Button button274;
    Button button275;
    Button button276;
    Button button277;
    Button button278;
    Button button279;
    Button button280;
    Button button281;
    Button button282;
    Button button283;
    Button button284;
    Button button285;
    Button button286;
    Button button287;
    Button button288;
    Button button289;

    //Second Page Button
    Button button66;
    Button button67;
    Button button68;
    Button button69;
    Button button70;
    Button button71;
    Button button72;
    Button button73;
    Button button74;
    Button button75;
    Button button76;
    Button button77;
    Button button78;
    Button button79;
    Button button80;
    Button button81;
    Button button82;
    Button button83;
    Button button84;
    Button button85;
    Button button86;
    Button button87;
    Button button88;
    Button button89;
    Button button90;
    Button button91;
    Button button92;
    Button button93;
    Button button94;
    Button button95;
    Button button96;
    Button button97;
    Button button98;
    Button button99;
    Button button100;
    Button button101;
    Button button102;
    Button button103;
    Button button104;
    Button button105;
    Button button106;
    Button button107;
    Button button108;
    Button button109;
    Button button110;
    Button button111;
    Button button112;
    Button button113;
    Button button114;
    Button button115;

    //Third Page Button
    Button button127;
    Button button128;
    Button button129;
    Button button130;
    Button button131;
    Button button132;
    Button button133;
    Button button134;
    Button button135;
    Button button136;
    Button button137;
    Button button138;
    Button button139;
    Button button140;
    Button button141;
    Button button142;
    Button button143;
    Button button144;
    Button button145;
    Button button146;
    Button button147;
    Button button148;
    Button button149;
    Button button150;
    Button button151;
    Button button152;
    Button button153;
    Button button154;
    Button button155;
    Button button156;
    Button button157;
    Button button158;
    Button button159;
    Button button160;
    Button button161;
    Button button162;
    Button button163;
    Button button164;
    Button button165;
    Button button166;
    Button button167;
    Button button168;
    Button button169;
    Button button170;
    Button button171;
    Button button172;
    Button button173;
    Button button174;
    Button button175;
    Button button176;

    //Fourth Page Button
    Button button190;
    Button button191;
    Button button192;
    Button button193;
    Button button194;
    Button button195;
    Button button196;
    Button button197;
    Button button198;
    Button button199;
    Button button200;
    Button button201;
    Button button202;
    Button button203;
    Button button204;
    Button button205;
    Button button206;
    Button button207;
    Button button208;
    Button button209;
    Button button210;
    Button button211;
    Button button212;
    Button button213;
    Button button214;
    Button button215;
    Button button216;
    Button button217;
    Button button218;
    Button button219;
    Button button220;
    Button button221;
    Button button222;
    Button button223;
    Button button224;
    Button button225;
    Button button226;
    Button button227;
    Button button228;
    Button button229;
    Button button230;
    Button button231;
    Button button232;
    Button button233;
    Button button234;
    Button button235;
    Button button236;
    Button button237;
    Button button238;
    Button button239;


    Button btnFirstNext;
    Button btnFirstPrevious;
    Button btnSecondNext;
    Button btnSecondPrevious;
    Button btnThirdNext;
    Button btnThirdPrevious;
    Button btnFourthNext;
    Button btnFourthPrevious;


    Button showCalculator;
    Button btnShowPassage;

    RadioButton firstSubjectOption1;
    RadioButton firstSubjectOption2;
    RadioButton firstSubjectOption3;
    RadioButton firstSubjectOption4;
    RadioButton secondSubjectOption1;
    RadioButton secondSubjectOption2;
    RadioButton secondSubjectOption3;
    RadioButton secondSubjectOption4;
    RadioButton thirdSubjectOption1;
    RadioButton thirdSubjectOption2;
    RadioButton thirdSubjectOption3;
    RadioButton thirdSubjectOption4;
    RadioButton fourthSubjectOption1;
    RadioButton fourthSubjectOption2;
    RadioButton fourthSubjectOption3;
    RadioButton fourthSubjectOption4;

    RadioGroup firstSubjectRadioGroup;
    RadioGroup secondSubjectRadioGroup;
    RadioGroup thirdSubjectRadioGroup;
    RadioGroup fourthSubjectRadioGroup;


    TabHost tabHost;
    TextView txtTimeCounter;
    TextView firstSubjectText;
    TextView secondSubjectText;
    TextView thirdSubjectText;
    TextView fourthSubjectText;
    TextView txtFirstId;
    TextView txtSecondId;
    TextView txtThirdId;
    TextView txtFourthId;

    SeventhHelper useDatabase;

    String regNo;
    List<User> subjects;
    User user;

    Questions fiQuestions;
    Questions sQuestions;
    Questions tQuestions;
    Questions foQuestions;

    int firstScore = 0;
    int secondScore = 0;
    int thirdScore = 0;
    int fourthScore = 0;

    int firstQuestionId = 0;
    int secondQuestionId = 0;
    int thirdQuestionId = 0;
    int fourthQuestionId = 0;

    int fId = 0;

    int firstNoOfQuestions;
    int secondNoOfQuestions;
    int thirdNoOfQuestions;
    int fourthNoOfQuestions;

    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    ArrayList<Integer> firstSubjectAnswers;
    ArrayList<Integer> secondSubjectAnswers;
    ArrayList<Integer> thirdSubjectAnswers;
    ArrayList<Integer> fourthSubjectAnswers;

    String time;

    String firstSubject;
    String secondSubject;
    String thirdSubject;
    String fourthSubject;

    String username;
    String regNumber;

    List<Questions> firstSubjectQuestions;
    List<Questions> secondSubjectQuestions;
    List<Questions> thirdSubjectQuestions;
    List<Questions> fourthSubjectQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_main_test);

        useDatabase = new SeventhHelper(this);
        useDatabase.createDatabase();

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);
        button31 = (Button) findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);
        button33 = (Button) findViewById(R.id.button33);
        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
        button37 = (Button) findViewById(R.id.button37);
        button38 = (Button) findViewById(R.id.button38);
        button39 = (Button) findViewById(R.id.button39);
        button40 = (Button) findViewById(R.id.button40);
        button41 = (Button) findViewById(R.id.button41);
        button42 = (Button) findViewById(R.id.button42);
        button43 = (Button) findViewById(R.id.button43);
        button44 = (Button) findViewById(R.id.button44);
        button45 = (Button) findViewById(R.id.button45);
        button46 = (Button) findViewById(R.id.button46);
        button47 = (Button) findViewById(R.id.button47);
        button48 = (Button) findViewById(R.id.button48);
        button49 = (Button) findViewById(R.id.button49);
        button50 = (Button) findViewById(R.id.button50);
        button51 = (Button) findViewById(R.id.button51);
        button52 = (Button) findViewById(R.id.button52);
        button53 = (Button) findViewById(R.id.button53);
        button54 = (Button) findViewById(R.id.button54);
        button55 = (Button) findViewById(R.id.button55);
        button56 = (Button) findViewById(R.id.button56);
        button57 = (Button) findViewById(R.id.button57);
        button58 = (Button) findViewById(R.id.button58);
        button59 = (Button) findViewById(R.id.button59);
        button60 = (Button) findViewById(R.id.button60);
        button250 = (Button) findViewById(R.id.button250);
        button251 = (Button) findViewById(R.id.button251);
        button252 = (Button) findViewById(R.id.button252);
        button253 = (Button) findViewById(R.id.button253);
        button254 = (Button) findViewById(R.id.button254);
        button255 = (Button) findViewById(R.id.button255);
        button256 = (Button) findViewById(R.id.button256);
        button257 = (Button) findViewById(R.id.button257);
        button258 = (Button) findViewById(R.id.button258);
        button259 = (Button) findViewById(R.id.button259);
        button260 = (Button) findViewById(R.id.button260);
        button261 = (Button) findViewById(R.id.button261);
        button262 = (Button) findViewById(R.id.button262);
        button263 = (Button) findViewById(R.id.button263);
        button264 = (Button) findViewById(R.id.button264);
        button265 = (Button) findViewById(R.id.button265);
        button266 = (Button) findViewById(R.id.button266);
        button267 = (Button) findViewById(R.id.button267);
        button268 = (Button) findViewById(R.id.button268);
        button269 = (Button) findViewById(R.id.button269);
        button270 = (Button) findViewById(R.id.button270);
        button271 = (Button) findViewById(R.id.button271);
        button272 = (Button) findViewById(R.id.button272);
        button273 = (Button) findViewById(R.id.button273);
        button274 = (Button) findViewById(R.id.button274);
        button275 = (Button) findViewById(R.id.button275);
        button276 = (Button) findViewById(R.id.button276);
        button277 = (Button) findViewById(R.id.button277);
        button278 = (Button) findViewById(R.id.button278);
        button279 = (Button) findViewById(R.id.button279);
        button280 = (Button) findViewById(R.id.button280);
        button281 = (Button) findViewById(R.id.button281);
        button282 = (Button) findViewById(R.id.button282);
        button283 = (Button) findViewById(R.id.button283);
        button284 = (Button) findViewById(R.id.button284);
        button285 = (Button) findViewById(R.id.button285);
        button286 = (Button) findViewById(R.id.button286);
        button287 = (Button) findViewById(R.id.button287);
        button288 = (Button) findViewById(R.id.button288);
        button289 = (Button) findViewById(R.id.button289);

        //Second Page
        button66 = (Button) findViewById(R.id.button66);
        button67 = (Button) findViewById(R.id.button67);
        button68 = (Button) findViewById(R.id.button68);
        button69 = (Button) findViewById(R.id.button69);
        button70 = (Button) findViewById(R.id.button70);
        button71 = (Button) findViewById(R.id.button71);
        button72 = (Button) findViewById(R.id.button72);
        button73 = (Button) findViewById(R.id.button73);
        button74 = (Button) findViewById(R.id.button74);
        button75 = (Button) findViewById(R.id.button75);
        button76 = (Button) findViewById(R.id.button76);
        button77 = (Button) findViewById(R.id.button77);
        button78 = (Button) findViewById(R.id.button78);
        button79 = (Button) findViewById(R.id.button79);
        button80 = (Button) findViewById(R.id.button80);
        button81 = (Button) findViewById(R.id.button81);
        button82 = (Button) findViewById(R.id.button82);
        button83 = (Button) findViewById(R.id.button83);
        button84 = (Button) findViewById(R.id.button84);
        button85 = (Button) findViewById(R.id.button85);
        button86 = (Button) findViewById(R.id.button86);
        button87 = (Button) findViewById(R.id.button87);
        button88 = (Button) findViewById(R.id.button88);
        button89 = (Button) findViewById(R.id.button89);
        button90 = (Button) findViewById(R.id.button90);
        button91 = (Button) findViewById(R.id.button91);
        button92 = (Button) findViewById(R.id.button92);
        button93 = (Button) findViewById(R.id.button93);
        button94 = (Button) findViewById(R.id.button94);
        button95 = (Button) findViewById(R.id.button95);
        button96 = (Button) findViewById(R.id.button96);
        button97 = (Button) findViewById(R.id.button97);
        button98 = (Button) findViewById(R.id.button98);
        button99 = (Button) findViewById(R.id.button99);
        button100 = (Button) findViewById(R.id.button100);
        button101 = (Button) findViewById(R.id.button101);
        button102 = (Button) findViewById(R.id.button102);
        button103 = (Button) findViewById(R.id.button103);
        button104 = (Button) findViewById(R.id.button104);
        button105 = (Button) findViewById(R.id.button105);
        button106 = (Button) findViewById(R.id.button106);
        button107 = (Button) findViewById(R.id.button107);
        button108 = (Button) findViewById(R.id.button108);
        button109 = (Button) findViewById(R.id.button109);
        button110 = (Button) findViewById(R.id.button110);
        button111 = (Button) findViewById(R.id.button111);
        button112 = (Button) findViewById(R.id.button112);
        button113 = (Button) findViewById(R.id.button113);
        button114 = (Button) findViewById(R.id.button114);
        button115 = (Button) findViewById(R.id.button115);

        //Third Page
        button127 = (Button) findViewById(R.id.button127);
        button128 = (Button) findViewById(R.id.button128);
        button129 = (Button) findViewById(R.id.button129);
        button130 = (Button) findViewById(R.id.button130);
        button131 = (Button) findViewById(R.id.button131);
        button132 = (Button) findViewById(R.id.button132);
        button133 = (Button) findViewById(R.id.button133);
        button134 = (Button) findViewById(R.id.button134);
        button135 = (Button) findViewById(R.id.button135);
        button136 = (Button) findViewById(R.id.button136);
        button137 = (Button) findViewById(R.id.button137);
        button138 = (Button) findViewById(R.id.button138);
        button139 = (Button) findViewById(R.id.button139);
        button140 = (Button) findViewById(R.id.button140);
        button141 = (Button) findViewById(R.id.button141);
        button142 = (Button) findViewById(R.id.button142);
        button143 = (Button) findViewById(R.id.button143);
        button144 = (Button) findViewById(R.id.button144);
        button145 = (Button) findViewById(R.id.button145);
        button146 = (Button) findViewById(R.id.button146);
        button147 = (Button) findViewById(R.id.button147);
        button148 = (Button) findViewById(R.id.button148);
        button149 = (Button) findViewById(R.id.button149);
        button150 = (Button) findViewById(R.id.button150);
        button151 = (Button) findViewById(R.id.button151);
        button152 = (Button) findViewById(R.id.button152);
        button153 = (Button) findViewById(R.id.button153);
        button154 = (Button) findViewById(R.id.button154);
        button155 = (Button) findViewById(R.id.button155);
        button156 = (Button) findViewById(R.id.button156);
        button157 = (Button) findViewById(R.id.button157);
        button158 = (Button) findViewById(R.id.button158);
        button159 = (Button) findViewById(R.id.button159);
        button160 = (Button) findViewById(R.id.button160);
        button161 = (Button) findViewById(R.id.button161);
        button162 = (Button) findViewById(R.id.button162);
        button163 = (Button) findViewById(R.id.button163);
        button164 = (Button) findViewById(R.id.button164);
        button165 = (Button) findViewById(R.id.button165);
        button166 = (Button) findViewById(R.id.button166);
        button167 = (Button) findViewById(R.id.button167);
        button168 = (Button) findViewById(R.id.button168);
        button169 = (Button) findViewById(R.id.button169);
        button170 = (Button) findViewById(R.id.button170);
        button171 = (Button) findViewById(R.id.button171);
        button172 = (Button) findViewById(R.id.button172);
        button173 = (Button) findViewById(R.id.button173);
        button174 = (Button) findViewById(R.id.button174);
        button175 = (Button) findViewById(R.id.button175);
        button176 = (Button) findViewById(R.id.button176);

        //Fourth Page
        button190 = (Button) findViewById(R.id.button190);
        button191 = (Button) findViewById(R.id.button191);
        button192 = (Button) findViewById(R.id.button192);
        button193 = (Button) findViewById(R.id.button193);
        button194 = (Button) findViewById(R.id.button194);
        button195 = (Button) findViewById(R.id.button195);
        button196 = (Button) findViewById(R.id.button196);
        button197 = (Button) findViewById(R.id.button197);
        button198 = (Button) findViewById(R.id.button198);
        button199 = (Button) findViewById(R.id.button199);
        button200 = (Button) findViewById(R.id.button200);
        button201 = (Button) findViewById(R.id.button201);
        button202 = (Button) findViewById(R.id.button202);
        button203 = (Button) findViewById(R.id.button203);
        button204 = (Button) findViewById(R.id.button204);
        button205 = (Button) findViewById(R.id.button205);
        button206 = (Button) findViewById(R.id.button206);
        button207 = (Button) findViewById(R.id.button207);
        button208 = (Button) findViewById(R.id.button208);
        button209 = (Button) findViewById(R.id.button209);
        button210 = (Button) findViewById(R.id.button210);
        button211 = (Button) findViewById(R.id.button211);
        button212 = (Button) findViewById(R.id.button212);
        button213 = (Button) findViewById(R.id.button213);
        button214 = (Button) findViewById(R.id.button214);
        button215 = (Button) findViewById(R.id.button215);
        button216 = (Button) findViewById(R.id.button216);
        button217 = (Button) findViewById(R.id.button217);
        button218 = (Button) findViewById(R.id.button218);
        button219 = (Button) findViewById(R.id.button219);
        button220 = (Button) findViewById(R.id.button220);
        button221 = (Button) findViewById(R.id.button221);
        button222 = (Button) findViewById(R.id.button222);
        button223 = (Button) findViewById(R.id.button223);
        button224 = (Button) findViewById(R.id.button224);
        button225 = (Button) findViewById(R.id.button225);
        button226 = (Button) findViewById(R.id.button226);
        button227 = (Button) findViewById(R.id.button227);
        button228 = (Button) findViewById(R.id.button228);
        button229 = (Button) findViewById(R.id.button229);
        button230 = (Button) findViewById(R.id.button230);
        button231 = (Button) findViewById(R.id.button231);
        button232 = (Button) findViewById(R.id.button232);
        button233 = (Button) findViewById(R.id.button233);
        button234 = (Button) findViewById(R.id.button234);
        button235 = (Button) findViewById(R.id.button235);
        button236 = (Button) findViewById(R.id.button236);
        button237 = (Button) findViewById(R.id.button237);
        button238 = (Button) findViewById(R.id.button238);
        button239 = (Button) findViewById(R.id.button239);

        firstSubjectText = (TextView) findViewById(R.id.firstSubjectText);
        secondSubjectText = (TextView) findViewById(R.id.secondSubjectText);
        thirdSubjectText = (TextView) findViewById(R.id.thirdSubjectText);
        fourthSubjectText = (TextView) findViewById(R.id.fourthSubjectText);
        txtFirstId = (TextView) findViewById(R.id.txtFirstId);
        txtSecondId = (TextView) findViewById(R.id.txtSecondId);
        txtThirdId = (TextView) findViewById(R.id.txtThirdId);
        txtFourthId = (TextView) findViewById(R.id.txtFourthId);
        txtTimeCounter = (TextView) findViewById(R.id.txtTimeCounter);

        firstSubjectRadioGroup = (RadioGroup) findViewById(R.id.firstSubjectRadioGroup);
        firstSubjectOption1 = (RadioButton) findViewById(R.id.firstSubjectOption1);
        firstSubjectOption2 = (RadioButton) findViewById(R.id.firstSubjectOption2);
        firstSubjectOption3 = (RadioButton) findViewById(R.id.firstSubjectOption3);
        firstSubjectOption4 = (RadioButton) findViewById(R.id.firstSubjectOption4);

        secondSubjectRadioGroup = (RadioGroup) findViewById(R.id.secondSubjectRadioGroup);
        secondSubjectOption1 = (RadioButton) findViewById(R.id.secondSubjectOption1);
        secondSubjectOption2 = (RadioButton) findViewById(R.id.secondSubjectOption2);
        secondSubjectOption3 = (RadioButton) findViewById(R.id.secondSubjectOption3);
        secondSubjectOption4 = (RadioButton) findViewById(R.id.secondSubjectOption4);

        thirdSubjectRadioGroup = (RadioGroup) findViewById(R.id.thirdSubjectRadioGroup);
        thirdSubjectOption1 = (RadioButton) findViewById(R.id.thirdSubjectOption1);
        thirdSubjectOption2 = (RadioButton) findViewById(R.id.thirdSubjectOption2);
        thirdSubjectOption3 = (RadioButton) findViewById(R.id.thirdSubjectOption3);
        thirdSubjectOption4 = (RadioButton) findViewById(R.id.thirdSubjectOption4);

        fourthSubjectRadioGroup = (RadioGroup) findViewById(R.id.fourthSubjectRadioGroup);
        fourthSubjectOption1 = (RadioButton) findViewById(R.id.fourthSubjectOption1);
        fourthSubjectOption2 = (RadioButton) findViewById(R.id.fourthSubjectOption2);
        fourthSubjectOption3 = (RadioButton) findViewById(R.id.fourthSubjectOption3);
        fourthSubjectOption4 = (RadioButton) findViewById(R.id.fourthSubjectOption4);

        btnFirstNext = (Button) findViewById(R.id.btnFirstNext);
        btnFirstPrevious = (Button) findViewById(R.id.btnFirstPrevious);
        btnSecondNext = (Button) findViewById(R.id.btnSecondNext);
        btnSecondPrevious = (Button) findViewById(R.id.btnSecondPrevious);
        btnThirdNext = (Button) findViewById(R.id.btnThirdNext);
        btnThirdPrevious = (Button) findViewById(R.id.btnThirdPrevious);
        btnFourthNext = (Button) findViewById(R.id.btnFourthNext);
        btnFourthPrevious = (Button) findViewById(R.id.btnFourthPrevious);

        showCalculator = (Button) findViewById(R.id.btnShowCalculator);
        btnShowPassage = (Button) findViewById(R.id.btnShowPassage);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        firstmage = (ImageView) findViewById(R.id.imageViewPics);
        secondImage = (ImageView) findViewById(R.id.imageViewSecond);
        thirdImage = (ImageView) findViewById(R.id.imageViewThird);
        fourthImage = (ImageView) findViewById(R.id.imageViewFourth);

        btnSubmit.setOnClickListener(this);
        showCalculator.setOnClickListener(this);
        btnShowPassage.setOnClickListener(this);

        firstSubject = getIntent().getStringExtra("first");
        secondSubject = getIntent().getStringExtra("second");
        thirdSubject = getIntent().getStringExtra("third");
        fourthSubject = getIntent().getStringExtra("fourth");

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Subject");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Subject");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Third Subject");
        TabHost.TabSpec tab4 = tabHost.newTabSpec("Fourth Subject");

        tab1.setIndicator(firstSubject);
        tab1.setContent(R.id.firstTab);

        tab2.setIndicator(secondSubject);
        tab2.setContent(R.id.secondTab);

        tab3.setIndicator(thirdSubject);
        tab3.setContent(R.id.thirdTab);

        tab4.setIndicator(fourthSubject);
        tab4.setContent(R.id.fourthTab);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);

        firstSubjectQuestions = getQuestions(firstSubject);
        firstNoOfQuestions = firstSubjectQuestions.size();
        secondSubjectQuestions = getQuestions(secondSubject);
        secondNoOfQuestions = secondSubjectQuestions.size();
        thirdSubjectQuestions = getQuestions(thirdSubject);
        thirdNoOfQuestions = thirdSubjectQuestions.size();
        fourthSubjectQuestions = getQuestions(fourthSubject);
        fourthNoOfQuestions = fourthSubjectQuestions.size();

        firstSubjectAnswers = new ArrayList<Integer>();
        secondSubjectAnswers = new ArrayList<Integer>();
        thirdSubjectAnswers = new ArrayList<Integer>();
        fourthSubjectAnswers = new ArrayList<Integer>();

        for (int i = 0; i < firstSubjectQuestions.size(); i++) {
            firstSubjectAnswers.add(i, -1);
        }
        for (int i = 0; i < secondSubjectQuestions.size(); i++) {
            secondSubjectAnswers.add(i, -1);
        }
        for (int i = 0; i < thirdSubjectQuestions.size(); i++) {
            thirdSubjectAnswers.add(i, -1);
        }
        for (int i = 0; i < fourthSubjectQuestions.size(); i++) {
            fourthSubjectAnswers.add(i, -1);
        }

        fiQuestions = firstSubjectQuestions.get(firstQuestionId);
        sQuestions = secondSubjectQuestions.get(secondQuestionId);
        tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
        foQuestions = fourthSubjectQuestions.get(fourthQuestionId);

        time = getIntent().getStringExtra("time");
        start();

        if (firstNoOfQuestions > 0) {
            showFirstCheckedOption();
            showFirstSubjectQuestions();
            checkFirstAnswered();
        }

        if (secondNoOfQuestions > 0) {
            showSecondSubjectQuestions();
            showSecondCheckedOption();
            checkSecondAnswered();

        }

        if (thirdNoOfQuestions > 0) {
            showThirdSubjectQuestions();
            showThirdCheckedOption();
            checkThirdAnswered();

        }

        if (fourthNoOfQuestions > 0) {
            showFourthSubjectQuestions();
            showFourthCheckedOption();
            checkFourthAnswered();

        }

        checkFirstAnswered();

        firstSubjectRadioGroup.setOnCheckedChangeListener(this);
        secondSubjectRadioGroup.setOnCheckedChangeListener(this);
        thirdSubjectRadioGroup.setOnCheckedChangeListener(this);
        fourthSubjectRadioGroup.setOnCheckedChangeListener(this);

        btnFirstNext.setOnClickListener(this);
        btnFirstPrevious.setOnClickListener(this);
        btnSecondNext.setOnClickListener(this);
        btnSecondPrevious.setOnClickListener(this);
        btnThirdNext.setOnClickListener(this);
        btnThirdPrevious.setOnClickListener(this);
        btnFourthNext.setOnClickListener(this);
        btnFourthPrevious.setOnClickListener(this);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button37.setOnClickListener(this);
        button38.setOnClickListener(this);
        button39.setOnClickListener(this);
        button40.setOnClickListener(this);
        button41.setOnClickListener(this);
        button42.setOnClickListener(this);
        button43.setOnClickListener(this);
        button44.setOnClickListener(this);
        button45.setOnClickListener(this);
        button46.setOnClickListener(this);
        button47.setOnClickListener(this);
        button48.setOnClickListener(this);
        button49.setOnClickListener(this);
        button50.setOnClickListener(this);
        button51.setOnClickListener(this);
        button52.setOnClickListener(this);
        button53.setOnClickListener(this);
        button54.setOnClickListener(this);
        button55.setOnClickListener(this);
        button56.setOnClickListener(this);
        button57.setOnClickListener(this);
        button58.setOnClickListener(this);
        button59.setOnClickListener(this);
        button60.setOnClickListener(this);
        button250.setOnClickListener(this);
        button251.setOnClickListener(this);
        button252.setOnClickListener(this);
        button253.setOnClickListener(this);
        button254.setOnClickListener(this);
        button255.setOnClickListener(this);
        button256.setOnClickListener(this);
        button257.setOnClickListener(this);
        button258.setOnClickListener(this);
        button259.setOnClickListener(this);
        button260.setOnClickListener(this);
        button261.setOnClickListener(this);
        button262.setOnClickListener(this);
        button263.setOnClickListener(this);
        button264.setOnClickListener(this);
        button265.setOnClickListener(this);
        button266.setOnClickListener(this);
        button267.setOnClickListener(this);
        button268.setOnClickListener(this);
        button269.setOnClickListener(this);
        button270.setOnClickListener(this);
        button271.setOnClickListener(this);
        button272.setOnClickListener(this);
        button273.setOnClickListener(this);
        button274.setOnClickListener(this);
        button275.setOnClickListener(this);
        button276.setOnClickListener(this);
        button277.setOnClickListener(this);
        button278.setOnClickListener(this);
        button279.setOnClickListener(this);
        button280.setOnClickListener(this);
        button281.setOnClickListener(this);
        button282.setOnClickListener(this);
        button283.setOnClickListener(this);
        button284.setOnClickListener(this);
        button285.setOnClickListener(this);
        button286.setOnClickListener(this);
        button287.setOnClickListener(this);
        button288.setOnClickListener(this);
        button289.setOnClickListener(this);

        button66.setOnClickListener(this);
        button67.setOnClickListener(this);
        button68.setOnClickListener(this);
        button69.setOnClickListener(this);
        button70.setOnClickListener(this);
        button71.setOnClickListener(this);
        button72.setOnClickListener(this);
        button73.setOnClickListener(this);
        button74.setOnClickListener(this);
        button75.setOnClickListener(this);
        button76.setOnClickListener(this);
        button77.setOnClickListener(this);
        button78.setOnClickListener(this);
        button79.setOnClickListener(this);
        button80.setOnClickListener(this);
        button81.setOnClickListener(this);
        button82.setOnClickListener(this);
        button83.setOnClickListener(this);
        button84.setOnClickListener(this);
        button85.setOnClickListener(this);
        button86.setOnClickListener(this);
        button87.setOnClickListener(this);
        button88.setOnClickListener(this);
        button89.setOnClickListener(this);
        button90.setOnClickListener(this);
        button91.setOnClickListener(this);
        button92.setOnClickListener(this);
        button93.setOnClickListener(this);
        button94.setOnClickListener(this);
        button95.setOnClickListener(this);
        button96.setOnClickListener(this);
        button97.setOnClickListener(this);
        button98.setOnClickListener(this);
        button99.setOnClickListener(this);
        button100.setOnClickListener(this);
        button101.setOnClickListener(this);
        button102.setOnClickListener(this);
        button103.setOnClickListener(this);
        button104.setOnClickListener(this);
        button105.setOnClickListener(this);
        button106.setOnClickListener(this);
        button107.setOnClickListener(this);
        button108.setOnClickListener(this);
        button109.setOnClickListener(this);
        button110.setOnClickListener(this);
        button111.setOnClickListener(this);
        button112.setOnClickListener(this);
        button113.setOnClickListener(this);
        button114.setOnClickListener(this);
        button115.setOnClickListener(this);

        button127.setOnClickListener(this);
        button128.setOnClickListener(this);
        button129.setOnClickListener(this);
        button130.setOnClickListener(this);
        button131.setOnClickListener(this);
        button132.setOnClickListener(this);
        button133.setOnClickListener(this);
        button134.setOnClickListener(this);
        button135.setOnClickListener(this);
        button136.setOnClickListener(this);
        button137.setOnClickListener(this);
        button138.setOnClickListener(this);
        button139.setOnClickListener(this);
        button140.setOnClickListener(this);
        button141.setOnClickListener(this);
        button142.setOnClickListener(this);
        button143.setOnClickListener(this);
        button144.setOnClickListener(this);
        button145.setOnClickListener(this);
        button146.setOnClickListener(this);
        button147.setOnClickListener(this);
        button148.setOnClickListener(this);
        button149.setOnClickListener(this);
        button150.setOnClickListener(this);
        button151.setOnClickListener(this);
        button152.setOnClickListener(this);
        button153.setOnClickListener(this);
        button154.setOnClickListener(this);
        button155.setOnClickListener(this);
        button156.setOnClickListener(this);
        button157.setOnClickListener(this);
        button158.setOnClickListener(this);
        button159.setOnClickListener(this);
        button160.setOnClickListener(this);
        button161.setOnClickListener(this);
        button162.setOnClickListener(this);
        button163.setOnClickListener(this);
        button164.setOnClickListener(this);
        button165.setOnClickListener(this);
        button166.setOnClickListener(this);
        button167.setOnClickListener(this);
        button168.setOnClickListener(this);
        button169.setOnClickListener(this);
        button170.setOnClickListener(this);
        button171.setOnClickListener(this);
        button172.setOnClickListener(this);
        button173.setOnClickListener(this);
        button174.setOnClickListener(this);
        button175.setOnClickListener(this);
        button176.setOnClickListener(this);

        button190.setOnClickListener(this);
        button191.setOnClickListener(this);
        button192.setOnClickListener(this);
        button193.setOnClickListener(this);
        button194.setOnClickListener(this);
        button195.setOnClickListener(this);
        button196.setOnClickListener(this);
        button197.setOnClickListener(this);
        button198.setOnClickListener(this);
        button199.setOnClickListener(this);
        button200.setOnClickListener(this);
        button201.setOnClickListener(this);
        button202.setOnClickListener(this);
        button203.setOnClickListener(this);
        button204.setOnClickListener(this);
        button205.setOnClickListener(this);
        button206.setOnClickListener(this);
        button207.setOnClickListener(this);
        button208.setOnClickListener(this);
        button209.setOnClickListener(this);
        button210.setOnClickListener(this);
        button211.setOnClickListener(this);
        button212.setOnClickListener(this);
        button213.setOnClickListener(this);
        button214.setOnClickListener(this);
        button215.setOnClickListener(this);
        button216.setOnClickListener(this);
        button217.setOnClickListener(this);
        button218.setOnClickListener(this);
        button219.setOnClickListener(this);
        button220.setOnClickListener(this);
        button221.setOnClickListener(this);
        button222.setOnClickListener(this);
        button223.setOnClickListener(this);
        button224.setOnClickListener(this);
        button225.setOnClickListener(this);
        button226.setOnClickListener(this);
        button227.setOnClickListener(this);
        button228.setOnClickListener(this);
        button229.setOnClickListener(this);
        button230.setOnClickListener(this);
        button231.setOnClickListener(this);
        button232.setOnClickListener(this);
        button233.setOnClickListener(this);
        button234.setOnClickListener(this);
        button235.setOnClickListener(this);
        button236.setOnClickListener(this);
        button237.setOnClickListener(this);
        button238.setOnClickListener(this);
        button239.setOnClickListener(this);

    }

    public void showFirstSubjectQuestions() {
        txtFirstId.setText(firstQuestionId + 1 + "");
        firstSubjectText.setText(fiQuestions.getQuestionText());
        firstSubjectOption1.setText(fiQuestions.getOption1());
        firstSubjectOption2.setText(fiQuestions.getOption2());
        firstSubjectOption3.setText(fiQuestions.getOption3());
        firstSubjectOption4.setText(fiQuestions.getOption4());
    }

    public void showSecondSubjectQuestions() {
        txtSecondId.setText(secondQuestionId + 1 + "");
        secondSubjectText.setText(sQuestions.getQuestionText());
        secondSubjectOption1.setText(sQuestions.getOption1());
        secondSubjectOption2.setText(sQuestions.getOption2());
        secondSubjectOption3.setText(sQuestions.getOption3());
        secondSubjectOption4.setText(sQuestions.getOption4());
        secondImage.setImageBitmap(sQuestions.getQuestionImage());
    }

    public void showThirdSubjectQuestions() {
        txtThirdId.setText(thirdQuestionId + 1 + "");
        thirdSubjectText.setText(tQuestions.getQuestionText());
        thirdSubjectOption1.setText(tQuestions.getOption1());
        thirdSubjectOption2.setText(tQuestions.getOption2());
        thirdSubjectOption3.setText(tQuestions.getOption3());
        thirdSubjectOption4.setText(tQuestions.getOption4());
        thirdImage.setImageBitmap(tQuestions.getQuestionImage());
    }

    public void showFourthSubjectQuestions() {
        txtFourthId.setText(fourthQuestionId + 1 + "");
        fourthSubjectText.setText(foQuestions.getQuestionText());
        fourthSubjectOption1.setText(foQuestions.getOption1());
        fourthSubjectOption2.setText(foQuestions.getOption2());
        fourthSubjectOption3.setText(foQuestions.getOption3());
        fourthSubjectOption4.setText(foQuestions.getOption4());
        fourthImage.setImageBitmap(foQuestions.getQuestionImage());
    }

    public List<Questions> getQuestions(String subject) {
        useDatabase.openDatabase();
        List<Questions> questions = new ArrayList<Questions>();

        String query = "select * from Questions where question_subject = '" + subject + "'";

        Cursor cursor = useDatabase.getReadableDatabase().rawQuery(query, null);

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

    public static long strToLong(String str) {
        long longStr = Long.parseLong(str);
        return longStr;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFirstNext:
                if ((firstQuestionId + 1) >= firstNoOfQuestions) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", firstSubjectAnswers.get(i) + "");
                    }
                    firstSubjectRadioGroup.clearCheck();
                    firstQuestionId = firstQuestionId + 1;
                    fiQuestions = firstSubjectQuestions.get(firstQuestionId);


                    showFirstCheckedOption();
                    showFirstSubjectQuestions();
                    checkFirstAnswered();
                }
                break;

            case R.id.btnFirstPrevious:
                if(firstQuestionId <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", firstSubjectAnswers.get(i) + "");
                    }
                    firstQuestionId = firstQuestionId - 1;
                    firstSubjectRadioGroup.clearCheck();
                    fiQuestions = firstSubjectQuestions.get(firstQuestionId);

                    /**
                    if(fiQuestions.getQuestionPassage().equals("")) {
                        btnShowPassage.setVisibility(View.INVISIBLE);
                    } else {
                        btnShowPassage.setVisibility(View.VISIBLE);
                    }*/

                    showFirstCheckedOption();
                    showFirstSubjectQuestions();
                    checkFirstAnswered();
                }
                break;
            case R.id.btnSecondNext:
                if ((secondQuestionId + 1) >= secondNoOfQuestions) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", firstSubjectAnswers.get(i) + "");
                    }
                    secondSubjectRadioGroup.clearCheck();
                    secondQuestionId = secondQuestionId + 1;
                    sQuestions = secondSubjectQuestions.get(secondQuestionId);

                    showSecondCheckedOption();
                    showSecondSubjectQuestions();
                    checkSecondAnswered();
                }
                break;
            case R.id.btnSecondPrevious:
                if(secondQuestionId <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", secondSubjectAnswers.get(i) + "");
                    }
                    secondQuestionId = secondQuestionId - 1;
                    secondSubjectRadioGroup.clearCheck();
                    sQuestions = secondSubjectQuestions.get(secondQuestionId);

                    showSecondCheckedOption();
                    showSecondSubjectQuestions();
                    checkSecondAnswered();
                }
                break;
            case R.id.btnThirdNext:
                if ((thirdQuestionId + 1) >= thirdNoOfQuestions) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", thirdSubjectAnswers.get(i) + "");
                    }
                    thirdSubjectRadioGroup.clearCheck();
                    thirdQuestionId = thirdQuestionId + 1;
                    tQuestions = thirdSubjectQuestions.get(thirdQuestionId);

                    showThirdCheckedOption();
                    showThirdSubjectQuestions();
                    checkThirdAnswered();
                }
                break;
            case R.id.btnThirdPrevious:
                if(thirdQuestionId <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", thirdSubjectAnswers.get(i) + "");
                    }
                    thirdQuestionId = thirdQuestionId - 1;
                    thirdSubjectRadioGroup.clearCheck();
                    tQuestions = thirdSubjectQuestions.get(thirdQuestionId);

                    showThirdCheckedOption();
                    showThirdSubjectQuestions();
                    checkThirdAnswered();
                }
                break;
            case R.id.btnFourthNext:
                if ((fourthQuestionId + 1) >= fourthNoOfQuestions) {
                    Toast.makeText(getApplicationContext(), "You have reached the end", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", fourthSubjectAnswers.get(i) + "");
                    }
                    fourthSubjectRadioGroup.clearCheck();
                    fourthQuestionId = fourthQuestionId + 1;
                    foQuestions = fourthSubjectQuestions.get(fourthQuestionId);

                    showFourthCheckedOption();
                    showFourthSubjectQuestions();
                    checkFourthAnswered();
                }
                break;
            case R.id.btnFourthPrevious:
                if(fourthQuestionId <= 0) {
                    Toast.makeText(getApplicationContext(), "No previous questions", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < 3; i++){
                        Log.e("Values of answers", fourthSubjectAnswers.get(i) + "");
                    }
                    fourthQuestionId = fourthQuestionId - 1;
                    fourthSubjectRadioGroup.clearCheck();
                    foQuestions = fourthSubjectQuestions.get(fourthQuestionId);

                    showFourthCheckedOption();
                    showFourthSubjectQuestions();
                    checkFourthAnswered();
                }
                break;
            case R.id.button1:
                firstQuestionId = 0;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button2:
                firstQuestionId = 1;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button3:
                firstQuestionId = 2;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button4:
                firstQuestionId = 3;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button5:
                firstQuestionId = 4;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button6:
                firstQuestionId = 5;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button7:
                firstQuestionId = 6;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button8:
                firstQuestionId = 7;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button9:
                firstQuestionId = 8;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button10:
                firstQuestionId = 9;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button11:
                firstQuestionId = 10;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button12:
                firstQuestionId = 11;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button13:
                firstQuestionId = 12;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button14:
                firstQuestionId = 13;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button15:
                firstQuestionId = 14;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button16:
                firstQuestionId = 15;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button17:
                firstQuestionId = 16;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button19:
                firstQuestionId = 18;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button20:
                firstQuestionId = 19;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button21:
                firstQuestionId = 20;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button22:
                firstQuestionId = 21;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button23:
                firstQuestionId = 22;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button24:
                firstQuestionId = 23;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button25:
                firstQuestionId = 24;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button26:
                firstQuestionId = 25;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button27:
                firstQuestionId = 26;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button28:
                firstQuestionId = 27;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button29:
                firstQuestionId = 28;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button30:
                firstQuestionId = 29;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button31:
                firstQuestionId = 30;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button32:
                firstQuestionId = 31;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button33:
                firstQuestionId = 32;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button34:
                firstQuestionId = 33;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button35:
                firstQuestionId = 34;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button36:
                firstQuestionId = 35;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button37:
                firstQuestionId = 36;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button38:
                firstQuestionId = 37;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button39:
                firstQuestionId = 38;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button40:
                firstQuestionId = 39;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button41:
                firstQuestionId = 40;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button42:
                firstQuestionId = 41;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button43:
                firstQuestionId = 42;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button44:
                firstQuestionId = 43;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button45:
                firstQuestionId = 44;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button46:
                firstQuestionId = 45;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button47:
                firstQuestionId = 46;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button48:
                firstQuestionId = 47;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button49:
                firstQuestionId = 48;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button50:
                firstQuestionId = 49;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button51:
                firstQuestionId = 50;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button52:
                firstQuestionId = 51;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button53:
                firstQuestionId = 52;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button54:
                firstQuestionId = 53;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button55:
                firstQuestionId = 54;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button56:
                firstQuestionId = 55;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button57:
                firstQuestionId = 56;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button58:
                firstQuestionId = 57;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button59:
                firstQuestionId = 58;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button60:
                firstQuestionId = 59;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button250:
                firstQuestionId = 60;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button251:
                firstQuestionId = 61;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button252:
                firstQuestionId = 62;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button253:
                firstQuestionId = 63;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button254:
                firstQuestionId = 64;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button255:
                firstQuestionId = 65;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button256:
                firstQuestionId = 66;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button257:
                firstQuestionId = 67;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button258:
                firstQuestionId = 68;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button259:
                firstQuestionId = 69;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button260:
                firstQuestionId = 70;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button261:
                firstQuestionId = 71;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button262:
                firstQuestionId = 72;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button263:
                firstQuestionId = 73;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button264:
                firstQuestionId = 74;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button265:
                firstQuestionId = 75;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button266:
                firstQuestionId = 76;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button267:
                firstQuestionId = 77;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button268:
                firstQuestionId = 78;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button269:
                firstQuestionId = 79;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button270:
                firstQuestionId = 80;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button271:
                firstQuestionId = 81;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button272:
                firstQuestionId = 82;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button273:
                firstQuestionId = 83;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button274:
                firstQuestionId = 84;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button275:
                firstQuestionId = 85;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button276:
                firstQuestionId = 86;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button277:
                firstQuestionId = 87;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button278:
                firstQuestionId = 88;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button279:
                firstQuestionId = 89;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button280:
                firstQuestionId = 90;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button281:
                firstQuestionId = 91;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button282:
                firstQuestionId = 92;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button283:
                firstQuestionId = 93;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button284:
                firstQuestionId = 94;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button285:
                firstQuestionId = 95;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button286:
                firstQuestionId = 96;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button287:
                firstQuestionId = 97;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button288:
                firstQuestionId = 98;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;
            case R.id.button289:
                firstQuestionId = 99;
                fiQuestions = firstSubjectQuestions.get(firstQuestionId);
                showFirstCheckedOption();
                showFirstSubjectQuestions();
                checkFirstAnswered();

                break;

            case R.id.button66:
                secondQuestionId = 0;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button67:
                secondQuestionId = 1;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button68:
                secondQuestionId = 2;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button69:
                secondQuestionId = 3;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button70:
                secondQuestionId = 4;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button71:
                secondQuestionId = 5;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button72:
                secondQuestionId = 6;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button73:
                secondQuestionId = 7;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button74:
                secondQuestionId = 8;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button75:
                secondQuestionId = 9;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button76:
                secondQuestionId = 10;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button77:
                secondQuestionId = 11;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button78:
                secondQuestionId = 12;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button79:
                secondQuestionId = 13;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button80:
                secondQuestionId = 14;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button81:
                secondQuestionId = 15;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button82:
                secondQuestionId = 16;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button83:
                secondQuestionId = 17;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button84:
                secondQuestionId = 18;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button85:
                secondQuestionId = 19;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button86:
                secondQuestionId = 20;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button87:
                secondQuestionId = 21;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button88:
                secondQuestionId = 22;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button89:
                secondQuestionId = 23;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button90:
                secondQuestionId = 24;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button91:
                secondQuestionId = 25;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button92:
                secondQuestionId = 26;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button93:
                secondQuestionId = 27;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button94:
                secondQuestionId = 28;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button95:
                secondQuestionId = 29;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button96:
                secondQuestionId = 30;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button97:
                secondQuestionId = 31;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button98:
                secondQuestionId = 32;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button99:
                secondQuestionId = 33;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button100:
                secondQuestionId = 34;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button101:
                secondQuestionId = 35;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button102:
                secondQuestionId = 36;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button103:
                secondQuestionId = 37;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button104:
                secondQuestionId = 38;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button105:
                secondQuestionId = 39;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button106:
                secondQuestionId = 40;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button107:
                secondQuestionId = 41;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button108:
                secondQuestionId = 42;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button109:
                secondQuestionId = 43;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button110:
                secondQuestionId = 44;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button111:
                secondQuestionId = 45;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button112:
                secondQuestionId = 46;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button113:
                secondQuestionId = 47;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button114:
                secondQuestionId = 48;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;
            case R.id.button115:
                secondQuestionId = 49;
                sQuestions = secondSubjectQuestions.get(secondQuestionId);
                showSecondCheckedOption();
                showSecondSubjectQuestions();
                checkSecondAnswered();

                break;

            case R.id.button127:
                thirdQuestionId = 0;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button128:
                thirdQuestionId = 1;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button129:
                thirdQuestionId = 2;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button130:
                thirdQuestionId = 3;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button131:
                thirdQuestionId = 4;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button132:
                thirdQuestionId = 5;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button133:
                thirdQuestionId = 6;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button134:
                thirdQuestionId = 7;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button135:
                thirdQuestionId = 8;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button136:
                thirdQuestionId = 9;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button137:
                thirdQuestionId = 10;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button138:
                thirdQuestionId = 11;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button139:
                thirdQuestionId = 12;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button140:
                thirdQuestionId = 13;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button141:
                thirdQuestionId = 14;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button142:
                thirdQuestionId = 15;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button143:
                thirdQuestionId = 16;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button144:
                thirdQuestionId = 17;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button145:
                thirdQuestionId = 18;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button146:
                thirdQuestionId = 19;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button147:
                thirdQuestionId = 20;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button148:
                thirdQuestionId = 21;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button149:
                thirdQuestionId = 22;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button150:
                thirdQuestionId = 23;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button151:
                thirdQuestionId = 24;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button152:
                thirdQuestionId = 25;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button153:
                thirdQuestionId = 26;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button154:
                thirdQuestionId = 27;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button155:
                thirdQuestionId = 28;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button156:
                thirdQuestionId = 29;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button157:
                thirdQuestionId = 30;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button158:
                thirdQuestionId = 31;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button159:
                thirdQuestionId = 32;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button160:
                thirdQuestionId = 33;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button161:
                thirdQuestionId = 34;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button162:
                thirdQuestionId = 35;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button163:
                thirdQuestionId = 36;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button164:
                thirdQuestionId = 37;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button165:
                thirdQuestionId = 38;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button166:
                thirdQuestionId = 39;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button167:
                thirdQuestionId = 40;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button168:
                thirdQuestionId = 41;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button169:
                thirdQuestionId = 42;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button170:
                thirdQuestionId = 43;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button171:
                thirdQuestionId = 44;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button172:
                thirdQuestionId = 45;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button173:
                thirdQuestionId = 46;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button174:
                thirdQuestionId = 47;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button175:
                thirdQuestionId = 48;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;
            case R.id.button176:
                thirdQuestionId = 49;
                tQuestions = thirdSubjectQuestions.get(thirdQuestionId);
                showThirdCheckedOption();
                showThirdSubjectQuestions();
                checkThirdAnswered();

                break;

            case R.id.button190:
                fourthQuestionId = 0;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button191:
                fourthQuestionId = 1;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button192:
                fourthQuestionId = 2;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button193:
                fourthQuestionId = 3;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button194:
                fourthQuestionId = 4;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button195:
                fourthQuestionId = 5;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button196:
                fourthQuestionId = 6;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button197:
                fourthQuestionId = 7;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button198:
                fourthQuestionId = 8;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button199:
                fourthQuestionId = 9;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button200:
                fourthQuestionId = 10;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button201:
                fourthQuestionId = 11;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button202:
                fourthQuestionId = 12;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button203:
                fourthQuestionId = 13;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button204:
                fourthQuestionId = 14;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button205:
                fourthQuestionId = 15;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button206:
                fourthQuestionId = 16;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button207:
                fourthQuestionId = 17;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button208:
                fourthQuestionId = 18;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button209:
                fourthQuestionId = 19;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button210:
                fourthQuestionId = 20;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button211:
                fourthQuestionId = 21;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button212:
                fourthQuestionId = 22;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button213:
                fourthQuestionId = 23;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button214:
                fourthQuestionId = 24;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button215:
                fourthQuestionId = 25;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button216:
                fourthQuestionId = 26;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button217:
                fourthQuestionId = 27;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button218:
                fourthQuestionId = 28;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button219:
                fourthQuestionId = 29;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button220:
                fourthQuestionId = 30;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button221:
                fourthQuestionId = 31;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button222:
                fourthQuestionId = 32;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button223:
                fourthQuestionId = 33;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button224:
                fourthQuestionId = 34;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button225:
                fourthQuestionId = 35;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button226:
                fourthQuestionId = 36;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button227:
                fourthQuestionId = 37;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button228:
                fourthQuestionId = 38;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button229:
                fourthQuestionId = 39;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button230:
                fourthQuestionId = 40;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button231:
                fourthQuestionId = 41;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button232:
                fourthQuestionId = 42;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button233:
                fourthQuestionId = 43;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button234:
                fourthQuestionId = 44;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button235:
                fourthQuestionId = 45;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button236:
                fourthQuestionId = 46;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button237:
                fourthQuestionId = 47;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button238:
                fourthQuestionId = 48;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.button239:
                fourthQuestionId = 49;
                foQuestions = fourthSubjectQuestions.get(fourthQuestionId);
                showFourthCheckedOption();
                showFourthSubjectQuestions();
                checkFourthAnswered();

                break;
            case R.id.btnSubmit:
                final Intent submit = new Intent(MultipleMainTest.this, MultpleResult.class);

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MultipleMainTest.this);
                alertBuilder.setMessage("Are you sure you want to Submit?");
                alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i = 0; i < firstSubjectAnswers.size(); i++) {
                            fiQuestions = firstSubjectQuestions.get(i);
                            if(firstSubjectAnswers.get(i) == fiQuestions.getAnswer()) {
                                firstScore = firstScore + 1;
                            }
                        }
                        for(int i = 0; i < secondSubjectAnswers.size(); i++) {
                            sQuestions = secondSubjectQuestions.get(i);
                            if(secondSubjectAnswers.get(i) == sQuestions.getAnswer()) {
                                secondScore = secondScore + 1;
                            }
                        }
                        for(int i = 0; i < thirdSubjectAnswers.size(); i++) {
                            tQuestions = thirdSubjectQuestions.get(i);
                            if(thirdSubjectAnswers.get(i) == tQuestions.getAnswer()) {
                                thirdScore = thirdScore + 1;
                            }
                        }
                        for(int i = 0; i < fourthSubjectAnswers.size(); i++) {
                            foQuestions = fourthSubjectQuestions.get(i);
                            if(fourthSubjectAnswers.get(i) == foQuestions.getAnswer()) {
                                fourthScore = fourthScore + 1;
                            }
                        }

                        Log.e("Title", firstSubject);

                        submit.putExtra("firstSubject", firstSubject);
                        submit.putExtra("secondSubject", secondSubject);
                        submit.putExtra("thirdSubject", thirdSubject);
                        submit.putExtra("fourthSubject", fourthSubject);
                        submit.putExtra("firstScore", (firstScore + ""));
                        submit.putExtra("secondScore", (secondScore + ""));
                        submit.putExtra("thirdScore", (thirdScore + ""));
                        submit.putExtra("fourthScore", (fourthScore + ""));
                        //submit.putExtra("name", username);
                        //submit.putExtra("regNo", regNo);
                        startActivity(submit);
                        finish();
                    }
                });
                alertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                alertBuilder.setTitle("Submit");
                alertBuilder.show();


                break;
            case R.id.btnShowPassage:
                showPassage();
                break;
            case R.id.btnShowCalculator:
                showCalculatorView();
                break;
        }
    }

    private void showPassage() {
        AlertDialog.Builder passageBuilder = new AlertDialog.Builder(MultipleMainTest.this);
        passageBuilder.setTitle("Passage");

        LayoutInflater factory = LayoutInflater.from(MultipleMainTest.this);
        final View view = factory.inflate(R.layout.passage, null);

        TextView txtPassage = (TextView) view.findViewById(R.id.txtPassage);
        txtPassage.setText(fiQuestions.getQuestionPassage());

        passageBuilder.setView(view);
        passageBuilder.setNeutralButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        passageBuilder.show();
    }

    public void showCalculatorView() {/**
        AlertDialog.Builder calculator = new AlertDialog.Builder(MultipleMainTest.this);
        LayoutInflater inflateCalculator = getLayoutInflater();
        View alertLayout = inflateCalculator.inflate(R.layout.calculator2, null);
        calculator.setView(alertLayout);
        final AlertDialog dialog = calculator.create();
        dialog.setCancelable(true);

        final EditText editCalc2 = (EditText) alertLayout.findViewById(R.id.editCalc2);
        final Button buttonOne2 = (Button) alertLayout.findViewById(R.id.buttonOne2);
        final Button buttonTwo2 = (Button) alertLayout.findViewById(R.id.buttonTwo2);
        final Button buttonThree2 = (Button) alertLayout.findViewById(R.id.buttonThree2);
        final Button buttonFour2 = (Button) alertLayout.findViewById(R.id.buttonFour2);
        final Button buttonFive2 = (Button) alertLayout.findViewById(R.id.buttonFive2);
        final Button buttonSix2 = (Button) alertLayout.findViewById(R.id.buttonSix2);
        final Button buttonSeven2 = (Button) alertLayout.findViewById(R.id.buttonSeven2);
        final Button buttonEight2 = (Button) alertLayout.findViewById(R.id.buttonEight2);
        final Button buttonNine2 = (Button) alertLayout.findViewById(R.id.buttonNine2);
        final Button buttonZero2 = (Button) alertLayout.findViewById(R.id.buttonZero2);
        final Button buttonDot2 = (Button) alertLayout.findViewById(R.id.buttonDot2);
        final Button buttonClear2 = (Button) alertLayout.findViewById(R.id.buttonClear2);
        final Button buttonPlus2 = (Button) alertLayout.findViewById(R.id.buttonPlus2);
        final Button buttonMinus2 = (Button) alertLayout.findViewById(R.id.buttonMinus2);
        final Button buttonDivide2 = (Button) alertLayout.findViewById(R.id.buttonDivide2);
        final Button buttonMultiply2 = (Button) alertLayout.findViewById(R.id.buttonMultiply2);
        final Button buttonEqual2 = (Button) alertLayout.findViewById(R.id.btnEqual2);

        editCalc2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        buttonOne2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "1");
            }
        });
        buttonTwo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "2");
            }
        });
        buttonThree2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "3");
            }
        });
        buttonFour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "4");
            }
        });
        buttonFive2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "5");
            }
        });
        buttonSix2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "6");
            }
        });
        buttonSeven2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "7");
            }
        });
        buttonEight2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "8");
            }
        });
        buttonNine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "9");
            }
        });
        buttonZero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + "0");
            }
        });
        buttonPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editCalc2 == null) {
                    editCalc2.setText("");
                } else {
                    mValueOne = Float.parseFloat(editCalc2.getText() + "");
                    mAddition = true;
                    editCalc2.setText(null);
                }
            }
        });
        buttonMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editCalc2.getText() + "");
                mSubtract = true;
                editCalc2.setText(null);
            }
        });
        buttonMultiply2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editCalc2.getText() + "");
                mMultiplication = true;
                editCalc2.setText(null);
            }
        });

        buttonDivide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editCalc2.getText() + "");
                mDivision = true;
                editCalc2.setText(null);
            }
        });
        buttonEqual2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editCalc2.getText() + "");

                if (mAddition == true) {

                    editCalc2.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    editCalc2.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    editCalc2.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    editCalc2.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });
        buttonClear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText("");
            }
        });

        buttonDot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc2.setText(editCalc2.getText() + ".");
            }
        });

        dialog.show();*/
    }

    private void checkFirstAnswered() {
        if (firstSubjectAnswers.get(0) != -1) {
            button1.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(1) != -1) {
            button2.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(2) != -1) {
            button3.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(3) != -1) {
            button4.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(4) != -1) {
            button5.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(5) != -1) {
            button6.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(6) != -1) {
            button7.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(7) != -1) {
            button8.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(8) != -1) {
            button9.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(9) != -1) {
            button10.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(10) != -1) {
            button11.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(11) != -1) {
            button12.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(12) != -1) {
            button13.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(13) != -1) {
            button14.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(14) != -1) {
            button15.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(15) != -1) {
            button16.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(16) != -1) {
            button17.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(17) != -1) {
            button18.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(18) != -1) {
            button19.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(19) != -1) {
            button20.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(20) != -1) {
            button21.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(21) != -1) {
            button22.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(22) != -1) {
            button23.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(23) != -1) {
            button24.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(24) != -1) {
            button25.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(25) != -1) {
            button26.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(26) != -1) {
            button27.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(27) != -1) {
            button28.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(28) != -1) {
            button29.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(29) != -1) {
            button30.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(30) != -1) {
            button31.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(31) != -1) {
            button32.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(32) != -1) {
            button33.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(33) != -1) {
            button34.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(34) != -1) {
            button35.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(35) != -1) {
            button36.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(36) != -1) {
            button37.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(37) != -1) {
            button38.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(38) != -1) {
            button39.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(39) != -1) {
            button40.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(40) != -1) {
            button41.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(41) != -1) {
            button42.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(42) != -1) {
            button43.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(43) != -1) {
            button44.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(44) != -1) {
            button45.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(45) != -1) {
            button46.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(46) != -1) {
            button47.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(47) != -1) {
            button48.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(48) != -1) {
            button49.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(49) != -1) {
            button50.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(50) != -1) {
            button51.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(51) != -1) {
            button52.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(52) != -1) {
            button53.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(53) != -1) {
            button54.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(54) != -1) {
            button55.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(55) != -1) {
            button56.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(56) != -1) {
            button57.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(57) != -1) {
            button58.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(58) != -1) {
            button59.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(59) != -1) {
            button60.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(60) != -1) {
            button250.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(61) != -1) {
            button251.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(62) != -1) {
            button252.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(63) != -1) {
            button253.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(64) != -1) {
            button254.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(65) != -1) {
            button255.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(66) != -1) {
            button256.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(67) != -1) {
            button257.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(68) != -1) {
            button258.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(69) != -1) {
            button259.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(70) != -1) {
            button260.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(71) != -1) {
            button261.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(72) != -1) {
            button262.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(73) != -1) {
            button263.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(74) != -1) {
            button264.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(75) != -1) {
            button265.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(76) != -1) {
            button266.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(77) != -1) {
            button267.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(78) != -1) {
            button268.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(79) != -1) {
            button269.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(80) != -1) {
            button270.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(81) != -1) {
            button271.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(82) != -1) {
            button272.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(83) != -1) {
            button273.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(84) != -1) {
            button274.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(85) != -1) {
            button275.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(86) != -1) {
            button276.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(87) != -1) {
            button277.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(88) != -1) {
            button278.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(89) != -1) {
            button279.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(90) != -1) {
            button280.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(91) != -1) {
            button281.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(92) != -1) {
            button282.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(93) != -1) {
            button283.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(94) != -1) {
            button284.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(95) != -1) {
            button285.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(96) != -1) {
            button286.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(97) != -1) {
            button287.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(98) != -1) {
            button288.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (firstSubjectAnswers.get(99) != -1) {
            button289.setBackgroundColor(R.drawable.button_curved_color);
        }
    }

    private void checkSecondAnswered() {
        if (secondSubjectAnswers.get(0) != -1) {
            button66.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(1) != -1) {
            button67.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(2) != -1) {
            button68.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(3) != -1) {
            button69.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(4) != -1) {
            button70.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(5) != -1) {
            button71.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(6) != -1) {
            button72.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(7) != -1) {
            button73.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(8) != -1) {
            button74.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(9) != -1) {
            button75.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(10) != -1) {
            button76.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(11) != -1) {
            button77.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(12) != -1) {
            button78.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(13) != -1) {
            button79.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(14) != -1) {
            button80.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(15) != -1) {
            button81.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(16) != -1) {
            button82.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(17) != -1) {
            button83.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(18) != -1) {
            button84.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(19) != -1) {
            button85.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(20) != -1) {
            button86.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(21) != -1) {
            button87.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(22) != -1) {
            button88.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(23) != -1) {
            button89.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(24) != -1) {
            button90.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(25) != -1) {
            button91.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(26) != -1) {
            button92.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(27) != -1) {
            button93.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(28) != -1) {
            button94.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(29) != -1) {
            button95.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(30) != -1) {
            button96.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(31) != -1) {
            button97.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(32) != -1) {
            button98.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(33) != -1) {
            button99.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(34) != -1) {
            button100.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(35) != -1) {
            button101.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(36) != -1) {
            button102.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(37) != -1) {
            button103.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(38) != -1) {
            button104.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(39) != -1) {
            button105.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(40) != -1) {
            button106.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(41) != -1) {
            button107.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(42) != -1) {
            button108.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(43) != -1) {
            button109.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(44) != -1) {
            button110.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(45) != -1) {
            button111.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(46) != -1) {
            button112.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(47) != -1) {
            button113.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(48) != -1) {
            button114.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (secondSubjectAnswers.get(49) != -1) {
            button115.setBackgroundColor(R.drawable.button_curved_color);
        }
    }

    private void checkThirdAnswered() {
        if (thirdSubjectAnswers.get(0) != -1) {
            button127.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(1) != -1) {
            button128.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(2) != -1) {
            button129.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(3) != -1) {
            button130.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(4) != -1) {
            button131.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(5) != -1) {
            button132.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(6) != -1) {
            button133.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(7) != -1) {
            button134.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(8) != -1) {
            button135.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(9) != -1) {
            button136.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(10) != -1) {
            button137.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(11) != -1) {
            button138.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(12) != -1) {
            button139.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(13) != -1) {
            button140.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(14) != -1) {
            button141.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(15) != -1) {
            button142.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(16) != -1) {
            button143.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(17) != -1) {
            button144.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(18) != -1) {
            button145.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(19) != -1) {
            button146.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(20) != -1) {
            button147.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(21) != -1) {
            button148.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(22) != -1) {
            button149.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(23) != -1) {
            button150.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(24) != -1) {
            button151.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(25) != -1) {
            button152.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(26) != -1) {
            button153.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(27) != -1) {
            button154.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(28) != -1) {
            button155.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(29) != -1) {
            button156.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(30) != -1) {
            button157.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(31) != -1) {
            button158.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(32) != -1) {
            button159.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(33) != -1) {
            button160.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(34) != -1) {
            button161.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(35) != -1) {
            button162.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(36) != -1) {
            button163.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(37) != -1) {
            button164.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(38) != -1) {
            button165.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(39) != -1) {
            button166.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(40) != -1) {
            button167.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(41) != -1) {
            button168.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(42) != -1) {
            button169.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(43) != -1) {
            button170.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(44) != -1) {
            button171.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(45) != -1) {
            button172.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(46) != -1) {
            button173.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(47) != -1) {
            button174.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(48) != -1) {
            button175.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (thirdSubjectAnswers.get(49) != -1) {
            button176.setBackgroundColor(R.drawable.button_curved_color);
        }
    }

    private void checkFourthAnswered() {
        if (fourthSubjectAnswers.get(0) != -1) {
            button190.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(1) != -1) {
            button191.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(2) != -1) {
            button192.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(3) != -1) {
            button193.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(4) != -1) {
            button194.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(5) != -1) {
            button195.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(6) != -1) {
            button196.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(7) != -1) {
            button197.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(8) != -1) {
            button198.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(9) != -1) {
            button199.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(10) != -1) {
            button200.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(11) != -1) {
            button201.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(12) != -1) {
            button202.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(13) != -1) {
            button203.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(14) != -1) {
            button204.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(15) != -1) {
            button205.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(16) != -1) {
            button206.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(17) != -1) {
            button207.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(18) != -1) {
            button208.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(19) != -1) {
            button209.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(20) != -1) {
            button210.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(21) != -1) {
            button211.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(22) != -1) {
            button212.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(23) != -1) {
            button213.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(24) != -1) {
            button214.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(25) != -1) {
            button215.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(26) != -1) {
            button216.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(27) != -1) {
            button217.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(28) != -1) {
            button218.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(29) != -1) {
            button219.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(30) != -1) {
            button220.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(31) != -1) {
            button221.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(32) != -1) {
            button222.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(33) != -1) {
            button223.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(34) != -1) {
            button224.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(35) != -1) {
            button225.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(36) != -1) {
            button226.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(37) != -1) {
            button227.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(38) != -1) {
            button228.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(39) != -1) {
            button229.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(40) != -1) {
            button230.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(41) != -1) {
            button231.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(42) != -1) {
            button232.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(43) != -1) {
            button233.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(44) != -1) {
            button234.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(45) != -1) {
            button235.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(46) != -1) {
            button236.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(47) != -1) {
            button237.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(48) != -1) {
            button238.setBackgroundColor(R.drawable.button_curved_color);
        }
        if (fourthSubjectAnswers.get(49) != -1) {
            button239.setBackgroundColor(R.drawable.button_curved_color);
        }
    }

    public void fRbClick(View v) {
        int radioId = firstSubjectRadioGroup.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = firstSubjectRadioGroup.indexOfChild(rb);
        firstSubjectAnswers.set((firstQuestionId), m);
        checkFirstAnswered();
        Log.e("Radio selected Id:", m + "");
    }
    public void sRbClick(View v) {
        int radioId = secondSubjectRadioGroup.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = secondSubjectRadioGroup.indexOfChild(rb);
        secondSubjectAnswers.set((secondQuestionId), m);
        checkSecondAnswered();
        Log.e("Radio selected Id:", m + "");
    }
    public void tRbClick(View v) {
        int radioId = thirdSubjectRadioGroup.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = thirdSubjectRadioGroup.indexOfChild(rb);
        thirdSubjectAnswers.set((thirdQuestionId), m);
        checkThirdAnswered();
        Log.e("Radio selected Id:", m + "");
    }
    public void foRbClick(View v) {
        int radioId = fourthSubjectRadioGroup.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioId);

        int m = fourthSubjectRadioGroup.indexOfChild(rb);
        fourthSubjectAnswers.set((fourthQuestionId), m);
        Log.e("Radio selected Id:", m + "");
        checkFourthAnswered();
    }

    public void showFirstCheckedOption() {
        if (firstSubjectAnswers.get(firstQuestionId) == 0) {
            firstSubjectOption1.setChecked(true);
            Log.e("Selected Option", "Option 1 selected");
        } else if (firstSubjectAnswers.get(firstQuestionId) == 1) {
            firstSubjectOption2.setChecked(true);
            Log.e("Selected Option", "Option 2 selected");
        } else if (firstSubjectAnswers.get(firstQuestionId) == 2) {
            firstSubjectOption3.setChecked(true);
            Log.e("Selected Option", "Option 3 selected");
        } else if (firstSubjectAnswers.get(firstQuestionId) == 3) {
            firstSubjectOption4.setChecked(true);
            Log.e("Selected Option", "Option 4 selected");
        } else {
            firstSubjectRadioGroup.clearCheck();
            Log.e("Selected Option", "None selected");
        }
    }
    public void showSecondCheckedOption() {
        if (secondSubjectAnswers.get(secondQuestionId) == 0) {
            secondSubjectOption1.setChecked(true);
            Log.e("Selected Option", "Option 1 selected");
        } else if (secondSubjectAnswers.get(secondQuestionId) == 1) {
            secondSubjectOption2.setChecked(true);
            Log.e("Selected Option", "Option 2 selected");
        } else if (secondSubjectAnswers.get(secondQuestionId) == 2) {
            secondSubjectOption3.setChecked(true);
            Log.e("Selected Option", "Option 3 selected");
        } else if (secondSubjectAnswers.get(secondQuestionId) == 3) {
            secondSubjectOption4.setChecked(true);
            Log.e("Selected Option", "Option 4 selected");
        } else {
            secondSubjectRadioGroup.clearCheck();
            Log.e("Selected Option", "None selected");
        }
    }
    public void showThirdCheckedOption() {
        if (thirdSubjectAnswers.get(thirdQuestionId) == 0) {
            thirdSubjectOption1.setChecked(true);
            Log.e("Selected Option", "Option 1 selected");
        } else if (thirdSubjectAnswers.get(thirdQuestionId) == 1) {
            thirdSubjectOption2.setChecked(true);
            Log.e("Selected Option", "Option 2 selected");
        } else if (thirdSubjectAnswers.get(thirdQuestionId) == 2) {
            thirdSubjectOption3.setChecked(true);
            Log.e("Selected Option", "Option 3 selected");
        } else if (thirdSubjectAnswers.get(thirdQuestionId) == 3) {
            thirdSubjectOption4.setChecked(true);
            Log.e("Selected Option", "Option 4 selected");
        } else {
            thirdSubjectRadioGroup.clearCheck();
            Log.e("Selected Option", "None selected");
        }
    }
    public void showFourthCheckedOption() {
        if (fourthSubjectAnswers.get(fourthQuestionId) == 0) {
            fourthSubjectOption1.setChecked(true);
            Log.e("Selected Option", "Option 1 selected");
        } else if (fourthSubjectAnswers.get(fourthQuestionId) == 1) {
            fourthSubjectOption2.setChecked(true);
            Log.e("Selected Option", "Option 2 selected");
        } else if (fourthSubjectAnswers.get(fourthQuestionId) == 2) {
            fourthSubjectOption3.setChecked(true);
            Log.e("Selected Option", "Option 3 selected");
        } else if (fourthSubjectAnswers.get(fourthQuestionId) == 3) {
            fourthSubjectOption4.setChecked(true);
            Log.e("Selected Option", "Option 4 selected");
        } else {
            fourthSubjectRadioGroup.clearCheck();
            Log.e("Selected Option", "None selected");
        }
    }

    private void start() {
        timer = new CountDownTimer(strToLong(time) * 60000, 1000){
            @Override
            public void onTick(long l) {
                String hms = String.format("%02d:%02d:%02d",
                        TimeUnit.MILLISECONDS.toHours(l),
                        TimeUnit.MILLISECONDS.toMinutes(l) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(l)),
                        TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                txtTimeCounter.setText(hms);
            }

            @Override
            public void onFinish() {
                txtTimeCounter.setText("00:00:00");

                final Intent intention = new Intent(MultipleMainTest.this, Results.class);

                AlertDialog.Builder alerts = new AlertDialog.Builder(MultipleMainTest.this);
                alerts.setMessage("Your time is up!");
                for(int i = 0; i < firstSubjectAnswers.size(); i++) {
                    fiQuestions = firstSubjectQuestions.get(i);
                    if(firstSubjectAnswers.get(i) == fiQuestions.getAnswer()) {
                        firstScore = firstScore + 1;
                    }
                }
                for(int i = 0; i < secondSubjectAnswers.size(); i++) {
                    sQuestions = secondSubjectQuestions.get(i);
                    if(secondSubjectAnswers.get(i) == sQuestions.getAnswer()) {
                        secondScore = secondScore + 1;
                    }
                }
                for(int i = 0; i < thirdSubjectAnswers.size(); i++) {
                    tQuestions = thirdSubjectQuestions.get(i);
                    if(thirdSubjectAnswers.get(i) == tQuestions.getAnswer()) {
                        thirdScore = thirdScore + 1;
                    }
                }
                for(int i = 0; i < fourthSubjectAnswers.size(); i++) {
                    foQuestions = fourthSubjectQuestions.get(i);
                    if(fourthSubjectAnswers.get(i) == foQuestions.getAnswer()) {
                        fourthScore = fourthScore + 1;
                    }
                }

                intention.putExtra("firstSubject", firstSubject);
                intention.putExtra("secondSubject", secondSubject);
                intention.putExtra("thirdSubject", thirdSubject);
                intention.putExtra("fourthSubject", fourthSubject);
                intention.putExtra("firstScore", (firstScore + ""));
                intention.putExtra("secondScore", (secondScore + ""));
                intention.putExtra("thirdScore", (thirdScore + ""));
                intention.putExtra("fourthScore", (fourthScore + ""));
                intention.putExtra("name", username);
                intention.putExtra("regNo", regNo);
                startActivity(intention);
                finish();
                //alerts.setPositiveButton("OK", null);
                alerts.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(intention);
                    }
                });
                alerts.setTitle("Time up");
                alerts.show();
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

}
