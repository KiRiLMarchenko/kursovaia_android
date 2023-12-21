package Marchenko.Kirill.applicationquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import Data.DataBaseHandler;
import Data.posHandler;
import Model.QuestionAndAnswer;


public class MainActivity extends AppCompatActivity {


    private String selectedTopic = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);

        dataBaseHandler.addQuest(new QuestionAndAnswer("Как древние Египтяне называли луну?",
                "Ях", "Сарти", "Аади", "Селена", "Ях",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Как древние Египтяне называли луну?",
                "Ях", "Сарти", "Аади", "Селена", "Ях",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Как назывался план нападения Германии на СССР?",
                "Шамити", "Тайфун", "Огонь", "Барбаросс", "Барбаросс",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Согласно легенде, какой знаменитый римлянин мог делать одновременно много дел?",
                "Нерон", "Цезарь", "Марк Цицерон", "Октавиан Август", "Цезарь",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer(  "Откуда родом слово «педагог» ?",
                "Древний Рим", "Великобритания", "Древняя Греция", "Испания", "Древняя Греция",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer(  "Как называлась корона древнеегипетских фараонов?",
                "Схенти", "Хнум", "Пшенти", "Ушебти", "Пшенти",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Какой титул был у главы государства в итальянских морских республиках в Средневековье?",
                "Царь", "Шах", "Сапа", "Дож", "Дож",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Какая страна начала, но не смогла закончить строительство Панамского канала?",
                "Румыния", "Польша", "Франция", "Венгрия", "Франция ",""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Мыслителей эпохи Возрождения называют.",
                "интеллектуалами   ", "гуманистами", "философами", "схоластами", "гуманистами","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Великое переселение народов произошло",
                "в IV-VII вв.", "в IX-X вв.", "в I-III вв.", "во II-V вв.", "в IV-VII вв.","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Разгром Константинополя крестоносцами произошел",
                "в 1261 г.", "в 1453 г.", "в 1204 г.", "в 1096 г.", "в 1204 г." ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Самое большое государство в Африке?",
                "Судан", "Алжир", "Ливия", "Мадагаскар", "Алжир" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какой штат называют «Штатом конского каштана»?",
                "Юта", "Огайо", "Колорадо", "Иллинойс", "Огайо","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Около 80% территории какой страны покрыто горами?",
                "Перу", "Аргентина", "Бразилия ", "Чили", "Чили","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("На каком острове располагаются Англия, Уэльс, Шотландия?",
                "Англия", "Великобритания", "Британия", "Шотландия", "Великобритания" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "На территории какой страны расположено высокогорное озеро Титикака?",
                "Парагвай", "Уругвай", "Боливия", "Суринам", "Боливия","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Флаг какой страны состоит из двух треугольников?",
                "Непал", "Камбоджа", "Шри-Ланка", "Колумбия", "Непал","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Какая страна начала, но не смогла закончить строительство Панамского канала?",
                "Румыния", "Польша", "Франция", "Венгрия", "Франция " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какая страна раньше называлась Берегом Слоновой Кости?",
                "Бутан   ", "Кот-д'Ивуар", "Мадагаскар", "Иран", "Кот-д'Ивуар","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какое государство называют «Страной утренней свежести»?",
                "Япония", "Китай", "Южная Корея", "Вьетнам", "Южная Корея" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Какое государство ранее называлось Цейлон?",
                "Шри-Ланка", "Мьянма", "Таиланд", "Вьетнам", "Шри-Ланка" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( " Ключ, который закрепляет ноту «соль»-это?",
                "альтовый", "скрипичный", "басовый", "гаечный", "скрипичный","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Самый низкий мужской голос-это?",
                "баритон", "бас ", "тенор", "фальцет", "бас","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer(  "Исполнение музыкального произведения вдвоем одновременно-это?",
                "диалог", "оркестр", "монолог", "дуэт ", "дуэт " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Низкий женский голос-это?",
                "альт ", "сопрано", "тембр", "тенор", "альт " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Как называется коллектив, состоящий из пяти музыкантов?",
                "квартет", "октет", "группа", "квинтет ", "квинтет ","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какой из музыкальных инструментов в своем названии содержит имя своего изобретателя?",
                "скрипка", "фагот", "саксофон ", "тромбон", "саксофон ","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer(
                "Название вступительной части произведения-это?",
                "реприза", "прелюдия ", "транспозиция", "интерлюдия", "прелюдия " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Музыкальное сопровождение мелодии голоса, мелодии инструментального произведения",
                "аккомпанемент    ", "поддержка", "пение", "исполнение", "аккомпанемент " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Как называется музыкальный коллектив из трех исполнителей",
                "квартет", "тетатет", "дуэт", "трио ", "трио " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer( "Звуки изображаются посредством особого рода знаков, называемых",
                "строки", "ноты ", "иероглифы", "строфы", "ноты " ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какая река является самой длинной в мире?",
                "Амазонка   ", "Нил", "Янцзы", "Миссисипи", "Амазонка" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какое животное является символом Австралии?",
                "Кенгуру   ", "Коала", "Эму", "Вомбат", "Кенгуру" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какая планета считается самой горячей в Солнечной системе?",
                "Меркурий   ", "Венера", "Марс", "Юпитер", "Венера" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Кто написал роман <Гордость и предубеждение>?",
                "Джейн Остин   ", "Шарлотта Бронте", "Эмили Бронте", "Луиза Мэй Олкотт", "Джейн Остин" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какой химический элемент обозначается символом <Fe>?",
                "Железо   ", "Фосфор", "Фтор", "Франций", "Железо" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какая столица Японии?",
                "Токио   ", "Киото", "Осака", "Хоккайдо", "Токио" ,""));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Кто написал пьесу <Ромео и Джульетта>?",
                "Антон Чехов  ", "Уильям Шекспир", "Оскар Уайльд", "Марк Твен", "Уильям Шекспир","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какой год был провозглашен <Годом Луны> в китайском гороскопе?",
                "2020   ", "2021", "2022", "2023", "2022","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какая страна является родиной пиццы?",
                "Италия   ", "Франция", "Греция", "Испания", "Италия","" ));
        dataBaseHandler.addQuest(new QuestionAndAnswer("Какой цвет получается при смешении красного и желтого?",
                "Зеленый   ", "Фиолетовый", "Синий", "Оранжевый", "Оранжевый" ,""));
        List<QuestionAndAnswer> questionAndAnswerList = dataBaseHandler.getAllQuest();
        if (questionAndAnswerList.isEmpty()) {

        }


        final LinearLayout History = findViewById(R.id.history);
        final LinearLayout City = findViewById(R.id.city);
        final LinearLayout Music = findViewById(R.id.music);
        final LinearLayout Allquest = findViewById(R.id.allQuest);

        final Button buttonStart = findViewById(R.id.buttonstart);

        History.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "History";
                History.setBackgroundResource(R.drawable.round_back_white_10_selected);
                City.setBackgroundResource(R.drawable.round_back_white_10);
                Music.setBackgroundResource(R.drawable.round_back_white_10);
                Allquest.setBackgroundResource(R.drawable.round_back_white_10);
                posHandler.startPos = 1;
                posHandler.currentPos = posHandler.startPos;
                posHandler.endPos = 10;
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
                posHandler.startPos = 11;
                posHandler.currentPos = posHandler.startPos;
                posHandler.endPos = 20;
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
                posHandler.startPos = 21;
                posHandler.currentPos = posHandler.startPos;
                posHandler.endPos = 30;
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
                posHandler.startPos = 31;
                posHandler.currentPos = posHandler.startPos;
                posHandler.endPos = 40;
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