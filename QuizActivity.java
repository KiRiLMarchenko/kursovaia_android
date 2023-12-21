package Marchenko.Kirill.applicationquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import Data.DataBaseHandler;
import Data.posHandler;
import Model.QuestionAndAnswer;



public class QuizActivity extends AppCompatActivity {

    public int getTotalQuestions() {
        if(questionAndAnswerList==null) return 0;
        return questionAndAnswerList.size();
    }
    public TextView numberQuestion;
    public TextView question;

    public AppCompatButton option1;
    public AppCompatButton option2;
    public AppCompatButton option3;
    public AppCompatButton option4;
    public AppCompatButton next_quest;

    public List<QuestionAndAnswer> questionAndAnswerList;

    //public  List <QuestionsList> questionsList ;

    public String selectedOptionByUser = "";

   // private int currentQuestionPosition = 0;

    public int totalQuestions = 41;
    public int questionsPerScreen = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final String getSelectedTopic = getIntent().getStringExtra("SelectedTopic");
        final ImageView backButton = findViewById(R.id.backButton);
        final TextView selectedTopicName = findViewById(R.id.selectedTopicName);

        numberQuestion = findViewById(R.id.numberQuestion);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option_1);
        option2 = findViewById(R.id.option_2);
        option3 = findViewById(R.id.option_3);
        option4 = findViewById(R.id.option_4);
        next_quest = findViewById(R.id.next_quest);


         selectedTopicName.setText(getSelectedTopic);








        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);
        List<QuestionAndAnswer> questionAndAnswerList = dataBaseHandler.getAllQuest();
         question.setText(questionAndAnswerList.get(posHandler.currentPos).getQuestion());
         option1.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer1());
         option2.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer2());
         option3.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer3());
         option4.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer4());


         backButton.setOnClickListener(new View.OnClickListener() {
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
                    option1.setTextColor(Color.WHITE);
                    String St1 = questionAndAnswerList.get(posHandler.currentPos).getUserSelectedAnswer();

                    /*revealAnswer ();
                    questionAndAnswerList.get(posHandler.currentPos).setUserSelectedAnswer(selectedOptionByUser);*/
                }


             }
         });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red);
                    option2.setTextColor(Color.WHITE);
                    String St1 = questionAndAnswerList.get(posHandler.currentPos).getUserSelectedAnswer();

                    /*revealAnswer ();
                    questionAndAnswerList.get(posHandler.currentPos).setUserSelectedAnswer(selectedOptionByUser);*/
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red);
                    option3.setTextColor(Color.WHITE);
                    String St1 = questionAndAnswerList.get(posHandler.currentPos).getUserSelectedAnswer();

                    /*revealAnswer ();
                    questionAndAnswerList.get(posHandler.currentPos).setUserSelectedAnswer(selectedOptionByUser);*/
                }


            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedOptionByUser.isEmpty()) {

                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red);
                    option4.setTextColor(Color.WHITE);
                    String St1 = questionAndAnswerList.get(posHandler.currentPos).getUserSelectedAnswer();

                    /*revealAnswer ();
                    questionAndAnswerList.get(posHandler.currentPos).setUserSelectedAnswer(selectedOptionByUser);*/}


            }
        });

        next_quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedOptionByUser.isEmpty()) {
                    Toast.makeText(QuizActivity.this, "Пожалуйста выберите ответ.", Toast.LENGTH_SHORT).show();
                } else {
                    changeNextQuestion();
                }

            }
        });
    }





    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();

    }

   /* private void revealAnswer() {
        QuestionAndAnswer currentQuestion = questionAndAnswerList.get(posHandler.currentPos);

        if (currentQuestion != null) {
            String correctAnswer = currentQuestion.getCorrectAnswer();

            if (correctAnswer != null) {
                if (currentQuestion.getAnswer1().equals(correctAnswer)) {
                    option1.setBackgroundResource(R.drawable.round_back_green);
                    option1.setTextColor(Color.WHITE);
                } else if (currentQuestion.getAnswer2().equals(correctAnswer)) {
                    option2.setBackgroundResource(R.drawable.round_back_green);
                    option2.setTextColor(Color.WHITE);
                } else if (currentQuestion.getAnswer3().equals(correctAnswer)) {
                    option3.setBackgroundResource(R.drawable.round_back_green);
                    option3.setTextColor(Color.WHITE);
                } else if (currentQuestion.getAnswer4().equals(correctAnswer)) {
                    option4.setBackgroundResource(R.drawable.round_back_green);
                    option4.setTextColor(Color.WHITE);
                }
            }
        }
    }*/

    private int getCorrectAnswer () {

        int correctAnswers = 0;

        for (int i = 0;i<questionAndAnswerList.size();i++) {


            final String getUserSelectedAnswer = questionAndAnswerList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionAndAnswerList.get(i).getCorrectAnswer();
            if (getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers = correctAnswers +1;

            }
        }
        return correctAnswers;
    }

    private int getIncorrectAnswer () {

        int incorrectAnswers = 0;

        for (int i = 0;i<questionAndAnswerList.size();i++) {


            final String getUserSelectedAnswer = questionAndAnswerList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionAndAnswerList.get(i).getCorrectAnswer();
            if (!getUserSelectedAnswer.equals(getAnswer)){
                incorrectAnswers = incorrectAnswers +1;

            }
        }
        return incorrectAnswers;
    }

    private void changeNextQuestion () {
        posHandler.currentPos++;


        int currentPage = (posHandler.currentPos - 1) / questionsPerScreen + 1;
        String questionNumberText = posHandler.currentPos + "/" + questionsPerScreen * currentPage;
        numberQuestion.setText(questionNumberText);


        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);
        List<QuestionAndAnswer> questionAndAnswerList = dataBaseHandler.getAllQuest();

        if ((posHandler.currentPos+1)== posHandler.endPos) {
            next_quest.setText("Готово!");
        }
        if ((posHandler.currentPos)< posHandler.endPos) {
             selectedOptionByUser = "";


            option1.setBackgroundResource(R.drawable.round_back_white_10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));


            question.setText(questionAndAnswerList.get(posHandler.currentPos).getQuestion());
            option1.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer1());
            option2.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer2());
            option3.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer3());
            option4.setText(questionAndAnswerList.get(posHandler.currentPos).getAnswer4());
        Log.d("q",Integer.toString(posHandler.currentPos));
        }else
        {
            Intent intent = new Intent(QuizActivity.this,QuizResult.class);
            intent.putExtra("correct",getCorrectAnswer());
            intent.putExtra("incorrect",getIncorrectAnswer());
            startActivity(intent);
            finish();
        }


    }

}

