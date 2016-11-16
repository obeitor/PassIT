package com.ObtSoft.passit.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button practiceTest;
    Button takeATest;
    Button btnActivate;
    protected static final String PREF = "pref";
    protected static final String ACTIVATED = "activated";
    private static String activationStatus;
    protected static String getActivationStatus(){
        return activationStatus;
    }
    protected static void setActivationStatus(String status){
        activationStatus = status;
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences(PREF,MODE_PRIVATE);
        activationStatus = preferences.getString(ACTIVATED,"EYYI SUTA");
        
        practiceTest = (Button) findViewById(R.id.btnPracticeTest);
        takeATest = (Button) findViewById(R.id.btnTakeATest);
        btnActivate = (Button) findViewById(R.id.btnActivate);

        takeATest.setOnClickListener(this);

        practiceTest.setOnClickListener(this);

        btnActivate.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.historyMenu:
                Intent historyMenu = new Intent(MainActivity.this, History.class);
                startActivity(historyMenu);
                break;
        }
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPracticeTest:
                Intent practice = new Intent(MainActivity.this, PracticeTests.class);
                startActivity(practice);
                break;
            case R.id.btnTakeATest:
                Intent takeTest = new Intent(MainActivity.this, TakeATest.class);
                startActivity(takeTest);
                break;
            case R.id.btnActivate:
                Intent activate = new Intent(MainActivity.this, ActivateProduct.class);
                startActivity(activate);
                break;
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getSharedPreferences(PREF,MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(ACTIVATED,activationStatus);
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = getSharedPreferences(PREF,MODE_PRIVATE);
        activationStatus = preferences.getString(ACTIVATED,"EYYI SUTA");
        if(activationStatus.equalsIgnoreCase("ORE SUTA")){
            takeATest.setEnabled(true);
            practiceTest.setEnabled(true);
            btnActivate.setVisibility(View.GONE);
            btnActivate.setEnabled(false);
        }
        else{
            takeATest.setEnabled(false);
            practiceTest.setEnabled(false);
            btnActivate.setEnabled(true);
            btnActivate.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(ACTIVATED,activationStatus);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        activationStatus = savedInstanceState.getString(ACTIVATED,"EYYI SUTA");
    }
}
