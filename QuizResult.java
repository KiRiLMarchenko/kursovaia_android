package Marchenko.Kirill.applicationquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResult extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.quiz_result);

                final AppCompatButton retryQuiz = findViewById(R.id.retryquiz);
                final TextView correctAnswer = findViewById(R.id.correctAnswer);
                final TextView incorrectAnswer = findViewById(R.id.incorrectAnswer);

                final int getCorrectAnswer = getIntent().getIntExtra("correct",0);
                final int getIncorrectAnswer = getIntent().getIntExtra("incorrect",0);

                correctAnswer.setText(String.valueOf("Количество Верных ответов - " + getCorrectAnswer));
                incorrectAnswer.setText(String.valueOf("Количество Неверных ответов - " + getIncorrectAnswer));

                retryQuiz.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                startActivity(new Intent(QuizResult.this, MainActivity.class));
                                finish();
                        }
                });
        }

        @Override
        public void onBackPressed() {
                startActivity(new Intent(QuizResult.this, MainActivity.class));
                finish();
        }
}
