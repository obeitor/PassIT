package com.ObtSoft.passit.app;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class singleOtherResult extends ActionBarActivity {
    List<Questions> answeredQuestions;
    ArrayList<Integer> answers;
    Questions q;
    TextView txtSubjectTitleS;
    TextView txtNumberOfQuestionsS;
    TextView txtCorrectAnswerS;
    TextView txtTimeUsedS;

    Button btnCorrection;
    Button btnCloseResultS;
    String noOfCorrectAnswers;
    String noOfQuestions;
    String subjectTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_other_result);

        btnCloseResultS = (Button) findViewById(R.id.btnCloseResultS);
        btnCorrection = (Button) findViewById(R.id.btnCorrections);
        txtCorrectAnswerS = (TextView) findViewById(R.id.txtCorrectAnswersS);
        txtSubjectTitleS = (TextView) findViewById(R.id.txtSubjectTitleS);
        txtNumberOfQuestionsS = (TextView) findViewById(R.id.txtNumberOfQuestionsS);
        txtTimeUsedS = (TextView) findViewById(R.id.txtTimeUsedS);

        btnCorrection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(singleOtherResult.this, Correction.class);
                intent.putParcelableArrayListExtra("questions", (ArrayList<? extends Parcelable>) answeredQuestions);
                intent.putIntegerArrayListExtra("answer", answers);
                String subject = getIntent().getStringExtra("subject");
                intent.putExtra("subject", subject);
                startActivity(intent);
            }
        });

        btnCloseResultS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent close = new Intent(singleOtherResult.this, MainActivity.class);
                startActivity(close);
            }
        });

        answeredQuestions = getIntent().getParcelableArrayListExtra("questions");
        answers = getIntent().getIntegerArrayListExtra("answer");
        noOfCorrectAnswers = getIntent().getStringExtra("correctAnswers");
        noOfQuestions = getIntent().getStringExtra("noOfQuestions");
        subjectTitle = getIntent().getStringExtra("subject");

        txtCorrectAnswerS.setText(noOfCorrectAnswers);
        txtNumberOfQuestionsS.setText(noOfQuestions);
        txtSubjectTitleS.setText(subjectTitle);


        for(int i = 0; i < answeredQuestions.size(); i++) {
            q = answeredQuestions.get(i);
            Log.e("Question Answer", q.getAnswer() + "");
            Log.e("Answer Chosen", answers.get(i) + "");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.single_other_result, menu);
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
