package com.ObtSoft.passit.app;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

/**
 * Created by Ibrahim Muhammed on 19/08/2016.
 */
public class SeventhHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "bright.db";
    public static final String DBLOCATION = "/data/data/com.ObtSoft.passit.app/databases/";
    public static final String TABLE = "Questions";
    private static final int SCHEMA_VERSION = 1;
    DbBitmapUtility dbMap = new DbBitmapUtility();

    public SQLiteDatabase dbSqlite;

    public final Context myContext;

    public SeventhHelper(Context context) {
        super(context, DBNAME, null, SCHEMA_VERSION);
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void createDatabase() {
        createDB();
    }
    private void createDB() {
        boolean dbExist = DBExists();

        if (!dbExist) {
            this.getWritableDatabase();

            copyDBFromResource();
        }
    }

    private boolean DBExists() {
        SQLiteDatabase db = null;

        try {
            String databasePath = DBLOCATION + DBNAME;
            db = SQLiteDatabase.openDatabase(databasePath, null, SQLiteDatabase.OPEN_READWRITE);
            db.setLocale(Locale.getDefault());
            db.setLockingEnabled(true);
            db.setVersion(1);
            Log.e("SQLHelper", " Database found");
        } catch(SQLiteException e) {
            Log.e("SQLHelper", " Database not found");
        }

        if (db != null) {
            db.close();
        }

        return db != null ? true : false;
    }

    private void copyDBFromResource() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        String dbFilePath = DBLOCATION + DBNAME;

        try {
            inputStream = myContext.getAssets().open(DBNAME);

            outputStream = new FileOutputStream(dbFilePath);

            byte[] buffer = new byte[1024];
            int length;

            while((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            outputStream.flush();
            outputStream.close();
            inputStream.close();
            Log.e("CopyDBFrom Resource", "Database Copied");
        } catch(IOException e) {
            throw new Error("Problem copying database from resource file.");
        }
    }

    public void openDatabase() {
        String myPath = DBLOCATION + DBNAME;
        try {
            dbSqlite = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
            Log.e("OpDB", "Database is opened");
        } catch(SQLException e) {
            Log.e("OpDB", "Database is not opened");
        }

    }
/**

    public List<Question> getSelectedQuestions() {
        openDatabase();
        List<Question> selectedQuestions = new ArrayList<Question>();


        String sql = "select * from Questions where question_year = \"2015\" and question_subject = \"English\";";
        String squestion = null;

        Cursor cursor = getReadableDatabase().rawQuery(sql, null);

        if (cursor.getCount() > 0) {
            Log.e("Cursor value", "There are values");
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                Question question = new Question(cursor.getInt(0),
                        cursor.getString(1), cursor.getString(2),
                        cursor.getString(3), cursor.getString(4),
                        cursor.getString(5), cursor.getString(6),
                        DbBitmapUtility.getImage(cursor.getBlob(7)));

                selectedQuestions.add(question);

             //   squestion = cursor.getString(1);
                Log.e("Selecting", "Questions added");
                //Log.e("Getting data", squestion);

                cursor.moveToNext();
            }
        }
        cursor.close();
        return selectedQuestions;
    } */
}
