package com.ObtSoft.passit.app;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class History extends ActionBarActivity {
    private List<MultiScore> multiScores;
    SeventhHelper useDatabase = null;
    ListView mulHistoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        useDatabase = new SeventhHelper(this);
        useDatabase.createDatabase();

        multiScores = populateList();
        mulHistoryList = (ListView) findViewById(R.id.listViewMultipleTest);
        ArrayAdapter<MultiScore> scoreAdapter = new MultiListAdapter();
        mulHistoryList.setAdapter(scoreAdapter);

    }

    private class MultiListAdapter extends ArrayAdapter<MultiScore> {
        private MultiListAdapter() {
            super(History.this, R.layout.multiple_history_list, multiScores);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.multiple_history_list, parent, false);
            }
            MultiScore score = multiScores.get(position);

            TextView firstSubjectTitle = (TextView) itemView.findViewById(R.id.txtFirstSubjectMT);
            firstSubjectTitle.setText(score.getFirstSubject());

            TextView secondSubjectTitle = (TextView) itemView.findViewById(R.id.txtSecondSubjectMT);
            secondSubjectTitle.setText(score.getSecondSubject());

            TextView thirdSubjectTitle = (TextView) itemView.findViewById(R.id.txtThirdSubjectMT);
            thirdSubjectTitle.setText(score.getThirdSubject());

            TextView fourthSubjectTitle = (TextView) itemView.findViewById(R.id.txtFourthSubjectMT);
            fourthSubjectTitle.setText(score.getFourthSubject());

            TextView firstSubjectScore = (TextView) itemView.findViewById(R.id.txtFirstSubjectMTScore);
            firstSubjectScore.setText(score.getFirstSubjectScore() + "");

            TextView secondSubjectScore = (TextView) itemView.findViewById(R.id.txtSecondSubjectMTScore);
            secondSubjectScore.setText(score.getSecondSubjectScore() + "");

            TextView thirdSubjectScore = (TextView) itemView.findViewById(R.id.txtThirdSubjectMTScore);
            thirdSubjectScore.setText(score.getThirdSubjectScore() + "");

            TextView fourthSubjectScore = (TextView) itemView.findViewById(R.id.txtFourthSubjectMTScore);
            fourthSubjectScore.setText(score.getFourthSubjectScore() + "");

            TextView dateText = (TextView) itemView.findViewById(R.id.txtTestDateM);
            dateText.setText(score.getDateTime());

            return itemView;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.history, menu);
        return true;
    }

    private List<MultiScore> populateList() {
        useDatabase.openDatabase();
        List<MultiScore> mul = new ArrayList<MultiScore>();

        String query = "select * from Scores";

        Cursor cursor = useDatabase.getReadableDatabase().rawQuery(query, null);

        if(cursor.getCount() > 0) {
            cursor.moveToFirst();
            while(!cursor.isAfterLast()) {
                MultiScore mulS = new MultiScore(cursor.getInt(0), cursor.getString(1), cursor.getString(2),
                        cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getInt(7),
                        cursor.getInt(8), cursor.getString(9));
                mul.add(mulS);
                cursor.moveToNext();
            }
        }
        cursor.close();

        return mul;
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
