package com.ObtSoft.passit.app;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
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


public class Single extends ActionBarActivity implements View.OnClickListener{
    Button btnSYear;
    Button btnSSubject;
    Button btnSStart;
    Button btnSelectNumberOfQuestions;
    NumberPicker singleNumberPicker;
    TextView txtTimeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        btnSYear = (Button) findViewById(R.id.btnSYear);
        btnSSubject = (Button) findViewById(R.id.btnSSubject);
        btnSStart = (Button) findViewById(R.id.btnSStart);
        btnSelectNumberOfQuestions = (Button) findViewById(R.id.btnSSelectNoOfQuestions);
        txtTimeValue = (TextView) findViewById(R.id.txtTimeValue);

        btnSYear.setOnClickListener(this);
        btnSSubject.setOnClickListener(this);
        btnSStart.setOnClickListener(this);
        btnSYear.setOnClickListener(this);
        btnSelectNumberOfQuestions.setOnClickListener(this);

        singleNumberPicker = (NumberPicker) findViewById(R.id.singleNumberPicker);
        singleNumberPicker.setMinValue(15);
        singleNumberPicker.setMaxValue(120);
        singleNumberPicker.setValue(60);
        singleNumberPicker.setWrapSelectorWheel(false);
        singleNumberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        singleNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i2) {
                txtTimeValue.setText(String.valueOf(i2));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.single, menu);
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

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSYear:
                PopupMenu dropDownYearMenu = new PopupMenu(getApplicationContext(), btnSYear);
                dropDownYearMenu.getMenuInflater().inflate(R.menu.year_options1, dropDownYearMenu.getMenu());
                dropDownYearMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        btnSYear.setText(menuItem.getTitle().toString());
                        Toast.makeText(getApplicationContext(), menuItem.getTitle().toString(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
                dropDownYearMenu.show();
                break;
            case R.id.btnSSubject:
                PopupMenu dropDownSubjectMenu = new PopupMenu(getApplicationContext(), btnSSubject);
                dropDownSubjectMenu.getMenuInflater().inflate(R.menu.subject_options, dropDownSubjectMenu.getMenu());
                dropDownSubjectMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        btnSSubject.setText(menuItem.getTitle().toString());

                        if(btnSSubject.getText().toString().equals("USE OF ENGLISH")) {
                            btnSelectNumberOfQuestions.setText("100");
                        } else {
                            btnSelectNumberOfQuestions.setText("50");
                        }
                        return true;
                    }
                });
                dropDownSubjectMenu.show();
                break;
            case R.id.btnSSelectNoOfQuestions:

                break;
            case R.id.btnSStart:
                String noOfQuestions = btnSelectNumberOfQuestions.getText().toString();
                String subject = btnSSubject.getText().toString();
                String year = btnSYear.getText().toString();
                String time = txtTimeValue.getText().toString();

                if (noOfQuestions.equals("Select") || subject.equals("Subject") || year.equals("Year")) {
                    Toast.makeText(getApplicationContext(), "Invalid Selection" + "\n" + "Make Selections", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    if(subject.equals("USE OF ENGLISH")) {
                        Intent english = new Intent(Single.this, SingleMainTestEnglish.class);
                        english.putExtra("year", year);
                        english.putExtra("time", time);
                        english.putExtra("subject", subject);
                        startActivity(english);
                    } else {
                        Intent others = new Intent(Single.this, SingeMainTest.class);
                        others.putExtra("year", year);
                        others.putExtra("time", time);
                        others.putExtra("subject", subject);
                        startActivity(others);
                    }
                }
                break;
        }
    }
}
