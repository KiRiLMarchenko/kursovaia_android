package Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.google.api.ResourceDescriptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import Marchenko.Kirill.applicationquiz.QuestionsList;
import Model.QuestionAndAnswer;
import Utils.Util;

public class DataBaseHandler extends SQLiteOpenHelper {

    public DataBaseHandler( Context context) {
        super(context, Util.DATABASE_NAME,null, Util.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    String CREATE_QUESTIONANDANSWER_TABLE = " CREATE TABLE " + Util.TABLE_NAME + " ("
        + Util.KEY_ID + " INTEGER PRIMARY KEY,"
        + Util.KEY_QUESTION + " TEXT,"
        + Util.KEY_ANSWER1 + " TEXT,"
        + Util.KEY_ANSWER2 + " TEXT,"
        + Util.KEY_ANSWER3 + " TEXT,"
        + Util.KEY_ANSWER4 + " TEXT,"
        + Util.KEY_CORRECTANSWER + " TEXT,"
        + Util.KEY_USERSELECTEDANSWER + " " + " )";




    db.execSQL(CREATE_QUESTIONANDANSWER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Util.TABLE_NAME);
         onCreate(db);

    }

    public void addQuest (QuestionAndAnswer questionAndAnswer){
    SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Util.KEY_QUESTION, questionAndAnswer.getQuestion());
        contentValues.put(Util.KEY_ANSWER1, questionAndAnswer.getAnswer1());
        contentValues.put(Util.KEY_ANSWER2, questionAndAnswer.getAnswer2());
        contentValues.put(Util.KEY_ANSWER3, questionAndAnswer.getAnswer3());
        contentValues.put(Util.KEY_ANSWER4, questionAndAnswer.getAnswer4());
        contentValues.put(Util.KEY_CORRECTANSWER, questionAndAnswer.getCorrectAnswer());
        contentValues.put(Util.KEY_USERSELECTEDANSWER, questionAndAnswer.getUserSelectedAnswer());

        db.insert(Util.TABLE_NAME, null,contentValues );
        db.close();

    }


    public QuestionAndAnswer getQuest(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(Util.TABLE_NAME, new String[]{Util.KEY_ID,Util.KEY_QUESTION, Util.KEY_ANSWER1, Util.KEY_ANSWER2, Util.KEY_ANSWER3, Util.KEY_ANSWER4,Util.KEY_CORRECTANSWER,Util.KEY_USERSELECTEDANSWER},
                Util.KEY_ID + "=?",new String[] {String.valueOf(id)},null,null,null,null);
                if (cursor != null){
                        cursor.moveToFirst();
                }
                QuestionAndAnswer questionAndAnswer =new QuestionAndAnswer(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2),
        cursor.getString(3), cursor.getString(4), cursor.getString(5),cursor.getString(6),cursor.getString(7));

        return questionAndAnswer;
    }

    public List<QuestionAndAnswer> getAllQuest () {

        SQLiteDatabase db = this.getReadableDatabase();
        List<QuestionAndAnswer> questionAndAnswerList = new ArrayList<>();
        String selectAllQuest = "Select * from " + Util.TABLE_NAME;
            Cursor cursor = db.rawQuery(selectAllQuest, null);
            if (cursor.moveToFirst()) {

                do {
                    QuestionAndAnswer questionAndAnswer = new QuestionAndAnswer();
                    questionAndAnswer.setId(Integer.parseInt( cursor.getString(0)));
                    questionAndAnswer.setQuestion( cursor.getString(1));
                    questionAndAnswer.setAnswer1( cursor.getString(2));
                    questionAndAnswer.setAnswer2( cursor.getString(3));
                    questionAndAnswer.setAnswer3( cursor.getString(4));
                    questionAndAnswer.setAnswer4( cursor.getString(5));
                    questionAndAnswer.setCorrectAnswer(cursor.getString(6));
                    questionAndAnswer.setUserSelectedAnswer(cursor.getString(7));

                    questionAndAnswerList.add(questionAndAnswer);
                } while (cursor.moveToNext());

            }
            return questionAndAnswerList;
    }
}

