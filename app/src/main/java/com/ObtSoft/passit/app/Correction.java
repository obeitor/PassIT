package com.ObtSoft.passit.app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


public class Correction extends ActionBarActivity {
    private List<Questions> answeredQuestions;
    private List<Integer> answers;
    ListView listViewCorrection;

    Button btnCloseCorrection;
    TextView txtCorrectionSubjectTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correction);

        txtCorrectionSubjectTitle = (TextView) findViewById(R.id.txtCorrectionSubjectTitle);
        String subject = getIntent().getStringExtra("subject");
        txtCorrectionSubjectTitle.setText("CORRECTIONS (" + subject + ")");
        btnCloseCorrection = (Button) findViewById(R.id.buttonbtnCloseCorrection);

        btnCloseCorrection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent close = new Intent(Correction.this, MainActivity.class);
                startActivity(close);
            }
        });

        answeredQuestions = getIntent().getParcelableArrayListExtra("questions");
        answers = getIntent().getIntegerArrayListExtra("answer");

        listViewCorrection = (ListView) findViewById(R.id.listViewCorrection);
        ArrayAdapter<Questions> subjectAdapter = new CorrectionAdapter();
        listViewCorrection.setAdapter(subjectAdapter);
    }


    private class CorrectionAdapter extends ArrayAdapter<Questions> {
        private CorrectionAdapter() {
            super(Correction.this, R.layout.correction_list, answeredQuestions);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.correction_list, parent, false);
            }
            Questions q = answeredQuestions.get(position);
            int myChosenAnswer = answers.get(position);

            TextView txtCorrectionQuestion = (TextView) itemView.findViewById(R.id.txtCorrectionQuestion);
            txtCorrectionQuestion.setText((position + 1) + ". "+ q.getQuestionText());

            TextView txtCorrectAnswer = (TextView) itemView.findViewById(R.id.txtCorrectionAnswer);
            int myCorrectAnswer = q.getAnswer();
            if(myCorrectAnswer == 0) {
                txtCorrectAnswer.setText("Correct Answer: " + "A");
            } else if (myCorrectAnswer == 1) {
                txtCorrectAnswer.setText("Correct Answer: " + "B");
            } else if (myCorrectAnswer == 2) {
                txtCorrectAnswer.setText("Correct Answer: " + "C");
            } else if (myCorrectAnswer == 3) {
                txtCorrectAnswer.setText("Correct Answer: " + "D");
            } else {
                txtCorrectAnswer.setText("Correct Answer: " + "None");
            }


            TextView txtCorrectAnswerChosen = (TextView) itemView.findViewById(R.id.txtCorrectionAnswerChosen);
            if(myChosenAnswer == 0) {
                txtCorrectAnswerChosen.setText("Answer Chosen: " + "A");
            } else if (myChosenAnswer == 1) {
                txtCorrectAnswerChosen.setText("Answer Chosen: " + "B");
            } else if (myChosenAnswer == 2) {
                txtCorrectAnswerChosen.setText("Answer Chosen: " + "C");
            } else if (myChosenAnswer == 3) {
                txtCorrectAnswerChosen.setText("Answer Chosen: " + "D");
            } else {
                txtCorrectAnswerChosen.setText("Answer Chosen: " + "None");
            }

            TextView txtCorrectionExplanation = (TextView) itemView.findViewById(R.id.txtCorrectionExplanation);
            txtCorrectionExplanation.setText(q.getAnswerExplanation());

            return itemView;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.correction, menu);
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
