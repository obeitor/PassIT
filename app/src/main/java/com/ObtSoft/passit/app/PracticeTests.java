package com.ObtSoft.passit.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class PracticeTests extends ActionBarActivity implements View.OnClickListener {
    Button btnPStart;
    NumberPicker numberPickerP;
    TextView timeValueP;
    Button btnPSubject;
    Button btnPYear;
    Button btnPSelectNoOfQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_tests);

        btnPStart = (Button) findViewById(R.id.btnPStart);
        numberPickerP = (NumberPicker) findViewById(R.id.numberPickerP);
        timeValueP = (TextView) findViewById(R.id.txtTimeValueP);
        btnPSubject = (Button) findViewById(R.id.btnPSubject);
        btnPYear = (Button) findViewById(R.id.btnPYear);
        btnPSelectNoOfQuestions = (Button) findViewById(R.id.btnPSelectNoOfQuestions);

        btnPSubject.setOnClickListener(this);
        btnPYear.setOnClickListener(this);
        btnPSelectNoOfQuestions.setOnClickListener(this);
        btnPStart.setOnClickListener(this);

        numberPickerP.setMinValue(15);
        numberPickerP.setMaxValue(120);
        numberPickerP.setValue(60);
        numberPickerP.setWrapSelectorWheel(false);
        numberPickerP.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        numberPickerP.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i2) {
                timeValueP.setText(String.valueOf(i2));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practice_tests, menu);
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
            case R.id.btnPYear:
                PopupMenu dropDownYearMenu = new PopupMenu(getApplicationContext(), btnPYear);
                dropDownYearMenu.getMenuInflater().inflate(R.menu.year_options1, dropDownYearMenu.getMenu());
                dropDownYearMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        btnPYear.setText(menuItem.getTitle().toString());
                        Toast.makeText(getApplicationContext(), menuItem.getTitle().toString(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
                dropDownYearMenu.show();
                break;
            case R.id.btnPSubject:
                PopupMenu dropDownSubjectMenu = new PopupMenu(getApplicationContext(), btnPSubject);
                dropDownSubjectMenu.getMenuInflater().inflate(R.menu.subject_options, dropDownSubjectMenu.getMenu());
                dropDownSubjectMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        btnPSubject.setText(menuItem.getTitle().toString());
                        Toast.makeText(getApplicationContext(), menuItem.getTitle().toString(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
                dropDownSubjectMenu.show();
                break;
            case R.id.btnPSelectNoOfQuestions:
                PopupMenu dropDownNoOfQuestions = new PopupMenu(getApplicationContext(), btnPSelectNoOfQuestions);
                if(btnPSubject.getText().equals("USE OF ENGLISH")) {
                    dropDownNoOfQuestions.getMenuInflater().inflate(R.menu.no_of_english_questions, dropDownNoOfQuestions.getMenu());
                } else {
                    dropDownNoOfQuestions.getMenuInflater().inflate(R.menu.no_of_questions, dropDownNoOfQuestions.getMenu());
                }

                dropDownNoOfQuestions.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        btnPSelectNoOfQuestions.setText(menuItem.getTitle().toString());
                        Toast.makeText(getApplicationContext(), menuItem.getTitle().toString(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
                dropDownNoOfQuestions.show();
                break;
            case R.id.btnPStart:
                String noOfQuestions = btnPSelectNoOfQuestions.getText().toString();
                String subject = btnPSubject.getText().toString();
                String year = btnPYear.getText().toString();
                String time = timeValueP.getText().toString();

                //Toast.makeText(getApplicationContext(), noOfQuestions + "\n" + subject + "\n" + year, Toast.LENGTH_LONG).show();

                if (noOfQuestions.equals("Select") || subject.equals("Subject") || year.equals("Year")) {
                    Toast.makeText(getApplicationContext(), "Invalid Selection" + "\n" + "Make Selections", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    Intent practiceTest = new Intent(PracticeTests.this, PracticeTestEnglish.class);
                    practiceTest.putExtra("subject", subject);
                    practiceTest.putExtra("noOfQuestions", noOfQuestions);
                    practiceTest.putExtra("year", year);
                    practiceTest.putExtra("time", time);
                    startActivity(practiceTest);
                }
                break;
        }
    }
}
