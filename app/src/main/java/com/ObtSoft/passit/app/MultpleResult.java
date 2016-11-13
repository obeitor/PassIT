package com.ObtSoft.passit.app;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MultpleResult extends ActionBarActivity {
    Button btnClose;
    //TextView txtName;
    TextView txtFirstSubjectTitle;
    TextView txtSecondSubjectTitle;
    TextView txtThirdSubjectTitle;
    TextView txtFourthSubjectTitle;
    TextView txtFirstSubjectScore;
    TextView txtSecondSubjectScore;
    TextView txtThirdSubjectScore;
    TextView txtFourtSubjectScore;
    TextView txtTotalScore;

    SeventhHelper helper = null;

    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String date;

    String firstSubjectTitle;
    String secondSubjectTitle;
    String thirdSubjectTitle;
    String fourthSubjectTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multple_result);

        helper = new SeventhHelper(this);
        helper.createDatabase();

        btnClose = (Button) findViewById(R.id.btnCloseMultiResult);
        txtFirstSubjectTitle = (TextView) findViewById(R.id.txtFirstSubject);
        txtSecondSubjectTitle = (TextView) findViewById(R.id.txtSecondSubject);
        txtThirdSubjectTitle = (TextView) findViewById(R.id.txtThirdSubject);
        txtFourthSubjectTitle = (TextView) findViewById(R.id.txtFourthSubject);
        txtFirstSubjectScore = (TextView) findViewById(R.id.txtFirstSubjectScore);
        txtSecondSubjectScore = (TextView) findViewById(R.id.txtSecondSubjectScore);
        txtThirdSubjectScore = (TextView) findViewById(R.id.txtThirdSubjectScore);
        txtFourtSubjectScore = (TextView) findViewById(R.id.txtFourthSubjectScore);
        txtTotalScore = (TextView) findViewById(R.id.txtTotal);

        int first = strToInt(getIntent().getStringExtra("firstScore"));
        int second = strToInt(getIntent().getStringExtra("secondScore"));
        int third = strToInt(getIntent().getStringExtra("thirdScore"));
        int fourth = strToInt(getIntent().getStringExtra("fourthScore"));
        //String registNo = getIntent().getStringExtra("regNo");

        firstSubjectTitle = getIntent().getStringExtra("firstSubject");
        secondSubjectTitle = getIntent().getStringExtra("secondSubject");
        thirdSubjectTitle = getIntent().getStringExtra("thirdSubject");
        fourthSubjectTitle = getIntent().getStringExtra("fourthSubject");

        Log.e("Okay", firstSubjectTitle);
        insertScoreToDatabase(first, second, third, fourth, firstSubjectTitle, secondSubjectTitle, thirdSubjectTitle, fourthSubjectTitle);

        //txtName.setText(getIntent().getStringExtra("name"));
        txtFirstSubjectTitle.setText(firstSubjectTitle);
        txtSecondSubjectTitle.setText(secondSubjectTitle);
        txtThirdSubjectTitle.setText(thirdSubjectTitle);
        txtFourthSubjectTitle.setText(fourthSubjectTitle);
        txtFirstSubjectScore.setText(first + " / " + "100");
        txtSecondSubjectScore.setText(second + " / " + "50");
        txtThirdSubjectScore.setText(third + " / " + "50");
        txtFourtSubjectScore.setText(fourth + " / " + "50");

        int total = (first + second + third + fourth);
        txtTotalScore.setText(total + "");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multple_result, menu);
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

    public static int strToInt(String str) {
        int intStr = Integer.parseInt(str);
        return intStr;
    }

    private void insertScoreToDatabase(int first, int second, int third, int fourth, String firstTitle, String secondTitle, String thirdTitle, String fourthTitle) {
        helper.openDatabase();
        ContentValues content = new ContentValues();
        SQLiteDatabase db = helper.getReadableDatabase();

        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        date = simpleDateFormat.format(calendar.getTime());

        content.put("firstSubject", firstTitle);
        content.put("secondSubject", secondTitle);
        content.put("thirdSubject", thirdTitle);
        content.put("fourthSubject", fourthTitle);
        content.put("firstSubjectScore", first);
        content.put("secondSubjectScore", second);
        content.put("thirdSubjectScore", third);
        content.put("fourthSubjectScore", fourth);
        content.put("dateTime", date);

        //db.update("User", content, "reg_no" + " = '" + reg + "'", new String[]{"first_score", "second_subject_score", "third_subject_score", "fourth_subject_score)"});
        db.insert("Scores", null, content);
        //db.update("User", content, "reg_no" + " = ?", new String[]{reg});

        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
        db.close();
    }
}
