package Marchenko.Kirill.applicationquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {


    private String selectedTopic = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout History = findViewById(R.id.history);
        final LinearLayout City = findViewById(R.id.city);
        final LinearLayout Music = findViewById(R.id.music);
        final LinearLayout Allquest = findViewById(R.id.allQuest);

        final Button buttonStart = findViewById(R.id.buttonstart);

        History.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "History";
                History.setBackgroundResource(R.drawable.round_back_white_10_selected);
                City.setBackgroundResource(R.drawable.round_back_white_10);
                Music.setBackgroundResource(R.drawable.round_back_white_10);
                Allquest.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });
        City.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "City";
                City.setBackgroundResource(R.drawable.round_back_white_10_selected);
                History.setBackgroundResource(R.drawable.round_back_white_10);
                Music.setBackgroundResource(R.drawable.round_back_white_10);
                Allquest.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });
        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Music";
                Music.setBackgroundResource(R.drawable.round_back_white_10_selected);
                History.setBackgroundResource(R.drawable.round_back_white_10);
                City.setBackgroundResource(R.drawable.round_back_white_10);
                Allquest.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });
        Allquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Allquest";
                Allquest.setBackgroundResource(R.drawable.round_back_white_10_selected);
                History.setBackgroundResource(R.drawable.round_back_white_10);
                City.setBackgroundResource(R.drawable.round_back_white_10);
                Music.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopic.isEmpty()){
                    Toast.makeText(MainActivity.this, "Выберите викторину" , Toast.LENGTH_SHORT).show();
                }else  {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}