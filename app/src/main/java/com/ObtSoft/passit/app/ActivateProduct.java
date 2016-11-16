package com.ObtSoft.passit.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ActivateProduct extends ActionBarActivity {
    EditText edActivate;
    Button btnActivate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activate_product);

        edActivate = (EditText) findViewById(R.id.edActivate);
        btnActivate = (Button) findViewById(R.id.btnActivateProduct);

        btnActivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String entry = edActivate.getText().toString();
                if(entry.isEmpty()){
                    edActivate.setError("Please enter the code");
                }
                else{
                    ActivateBackground.createBackgroundActivity(activity,entry);
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getSharedPreferences(MainActivity.PREF,MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(MainActivity.ACTIVATED,MainActivity.getActivationStatus());
        editor.commit();
    }
}
