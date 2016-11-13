package com.ObtSoft.passit.app;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Results extends ActionBarActivity {
    private List<User> myUsers;
    SeventhHelper useDatabase = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_results);

        useDatabase = new SeventhHelper(this);
        useDatabase.createDatabase();

        myUsers = populateList();
        populateView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.results, menu);
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

    private List<User> populateList() {
        useDatabase.openDatabase();
        List<User> users = new ArrayList<User>();

        String query = "select * from User";

        Cursor cursor = useDatabase.getReadableDatabase().rawQuery(query, null);

        if(cursor.getCount() > 0) {
            cursor.moveToFirst();
            while(!cursor.isAfterLast()) {
                User user = new User(cursor.getInt(0), cursor.getString(1),
                        cursor.getString(2), cursor.getString(3), cursor.getString(4),
                        cursor.getString(5), cursor.getString(6), cursor.getInt(7),
                        cursor.getInt(8), cursor.getInt(9), cursor.getInt(10));
                users.add(user);
                cursor.moveToNext();
            }
        }
        cursor.close();

        return users;
    }

    private void populateView() {
        //ListView resultList = (ListView) findViewById(R.id.resultListView);
        //ArrayAdapter<User> resultAdapter = new ResultListAdapter();
        //resultList.setAdapter(resultAdapter);
    }
/**
    private class ResultListAdapter extends ArrayAdapter<User> {
        //public ResultListAdapter() {
            super(Results.this, R.layout.result_list, myUsers);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //return super.getView(position, convertView, parent);
            View itemView = convertView;
            if(itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.result_list, parent, false);
            }
            User currentUser = myUsers.get(position);

            TextView name = (TextView) itemView.findViewById(R.id.txtNameR);
            name.setText(currentUser.getFirstName());

            TextView exNumber = (TextView) itemView.findViewById(R.id.txtNumber);
            exNumber.setText(currentUser.getRegNo());

            TextView firstSubjectTitle = (TextView) itemView.findViewById(R.id.firstTitle);
            firstSubjectTitle.setText(currentUser.getFirstSubject());

            TextView secondSubjectTitle = (TextView) itemView.findViewById(R.id.secondTitle);
            secondSubjectTitle.setText(currentUser.getSecondSubject());

            TextView thirdSubjectTitle = (TextView) itemView.findViewById(R.id.thirdTitle);
            thirdSubjectTitle.setText(currentUser.getThirdSubject());

            TextView fourthSubjectTitle = (TextView) itemView.findViewById(R.id.fourthTitle);
            fourthSubjectTitle.setText(currentUser.getFourthSubject());

            TextView fS = (TextView) itemView.findViewById(R.id.fS);
            fS.setText(currentUser.getFirstScore() + "");

            TextView sS = (TextView) itemView.findViewById(R.id.sS);
            sS.setText(currentUser.getSecondScore() + "");

            TextView tS = (TextView) itemView.findViewById(R.id.tS);
            tS.setText(currentUser.getThirdScore() + "");

            TextView foS = (TextView) itemView.findViewById(R.id.foS);
            foS.setText(currentUser.getFourthScore() + "");

            return itemView;

        }
    }*/
}
