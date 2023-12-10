package Marchenko.Kirill.applicationquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    public TextView numberQuestion;
    public TextView question;

    public AppCompatButton option1;
    public AppCompatButton option2;
    public AppCompatButton option3;
    public AppCompatButton option4;
    public AppCompatButton next_quest;

    public  List <QuestionsList> questionsList ;

    public String selectedOptionByUser = "";

    private int currentQuestionPosition;

    {
        currentQuestionPosition = 0;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final String getSelectedTopic = getIntent().getStringExtra("SelectedTopic");
        final ImageView backButoon = findViewById(R.id.backButton);
        final TextView selectedTopicName = findViewById(R.id.selectedTopicName);

        numberQuestion = findViewById(R.id.numberQuestion);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option_1);
        option2 = findViewById(R.id.option_2);
        option3 = findViewById(R.id.option_3);
        option4 = findViewById(R.id.option_4);
        next_quest = findViewById(R.id.next_quest);


         selectedTopicName.setText(getSelectedTopic);

         questionsList = QuestionBank.getQuestions(getSelectedTopic);

         numberQuestion.setText(currentQuestionPosition+1+"/"+questionsList.size());
         question.setText(questionsList.get(0).getQuestion());
         option1.setText(questionsList.get(0).getOption1());
         option2.setText(questionsList.get(0).getOption2());
         option3.setText(questionsList.get(0).getOption3());
         option4.setText(questionsList.get(0).getOption4());


         backButoon.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(QuizActivity.this, MainActivity.class));
                 finish();
             }
         });

         option1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_back_red);
                }


             }
         });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        next_quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private int getCorrectAnswer () {

        int correctAnswers = 0;

        for (int i = 0;i<questionsList.size();i++) {


            final String getUserSelectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();
            if (getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers = correctAnswers +1;

            }
        }
        return correctAnswers;
    }

    private int getIncorrectAnswer () {

        int incorrectAnswers = 0;

        for (int i = 0;i<questionsList.size();i++) {


            final String getUserSelectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();
            if (!getUserSelectedAnswer.equals(getAnswer)){
                incorrectAnswers = incorrectAnswers +1;

            }
        }
        return incorrectAnswers;
    }



    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();

    }
}