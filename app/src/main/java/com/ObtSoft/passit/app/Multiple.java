package com.ObtSoft.passit.app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Multiple extends ActionBarActivity implements View.OnClickListener{
    ArrayList<String> selectedSubject = new ArrayList<String>();
    Button btnMSelectYear;
    Button btnMStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);

        btnMSelectYear = (Button) findViewById(R.id.btnMSelectYear);
        btnMStart = (Button) findViewById(R.id.btnMStart);

        btnMSelectYear.setOnClickListener(this);
        btnMStart.setOnClickListener(this);

        ListView lv = (ListView) findViewById(R.id.checkableList);
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String [] subjects = {"PRINCIPLES OF ACCOUNTS", "PHYSICS", "MATHEMATICS", "BIOLOGY", "COMMERCE"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.subject_list, R.id.txt_subject, subjects);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = ((TextView)view).getText().toString();
                if(selectedSubject.contains(selectedItem)) {
                    selectedSubject.remove(selectedItem);
                } else
                    selectedSubject.add(selectedItem);
            }
        });
    }

    public void showSelectedSubjects(View view) {
        String items = "";

        for(String item:selectedSubject) {
            items+="-"+item+"\n";
        }
        for(int i = 0; i < selectedSubject.size(); i++) {
            Log.e("Subject", selectedSubject.get(i));
        }
        Toast.makeText(getApplicationContext(), "\n" + items, Toast.LENGTH_LONG).show();
    }

    public List<String> getSelectedSubjects() {
        List<String> subjects = new ArrayList<String>();
        String items = "";

        for(String item:selectedSubject) {
            items+="-"+item+"\n";
        }
        for(int i = 0; i < selectedSubject.size(); i++) {
            subjects.add(selectedSubject.get(i));
        }

        return subjects;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multiple, menu);
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
            case R.id.btnMSelectYear:
                PopupMenu dropDownYearMenu = new PopupMenu(getApplicationContext(), btnMSelectYear);
                dropDownYearMenu.getMenuInflater().inflate(R.menu.year_options, dropDownYearMenu.getMenu());
                dropDownYearMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        btnMSelectYear.setText(menuItem.getTitle().toString());
                        Toast.makeText(getApplicationContext(), menuItem.getTitle().toString(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
                dropDownYearMenu.show();
                break;
            case R.id.btnMStart:
                List<String> subjects = getSelectedSubjects();
                if (subjects.size() == 3) {
                    if (btnMSelectYear.getText().toString().equals("Year")) {
                        Toast.makeText(getApplicationContext(), "Invalid Year" + "\n" + "Select Year Value", Toast.LENGTH_LONG).show();
                        return;
                    } else {
                        String first = "USE OF ENGLISH";
                        String second = subjects.get(0);
                        String third = subjects.get(1);
                        String fourth = subjects.get(2);
                        Intent startMultiple = new Intent(Multiple.this, MultipleMainTest.class);

                        startMultiple.putExtra("first", first);
                        startMultiple.putExtra("second", second);
                        startMultiple.putExtra("third", third);
                        startMultiple.putExtra("fourth", fourth);
                        startMultiple.putExtra("time", "180");

                        startActivity(startMultiple);
                    }

                } else if (subjects.size() < 3){
                    Toast.makeText(getApplicationContext(), "Few Subjects Selected" + "\n" + "Select Three Subjects", Toast.LENGTH_LONG).show();
                    return;
                } else if (subjects.size() > 3) {
                    Toast.makeText(getApplicationContext(), "Excess Subjects Selected" + "\n" + "Select Three Subjects", Toast.LENGTH_LONG).show();
                    return;
                }

                break;
        }
    }
}
