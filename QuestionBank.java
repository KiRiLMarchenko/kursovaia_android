package Marchenko.Kirill.applicationquiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> historyQuestions() {

        final List<QuestionsList> questionsList = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Как древние Египтяне называли луну?",
                "Ях", "Сарти", "Аади", "Селена", "Ях", "");

        final QuestionsList question2 = new QuestionsList("Как назывался план нападения Германии на СССР?",
                "Шамити", "Тайфун", "Огонь", "Барбаросс", "Барбаросс", "");

        final QuestionsList question3 = new QuestionsList("Согласно легенде, какой знаменитый римлянин мог делать одновременно много дел?",
                "Нерон", "Цезарь", "Марк Цицерон", "Октавиан Август", "Цезарь", "");

        final QuestionsList question4 = new QuestionsList("Откуда родом слово «педагог» ?",
                "Древний Рим", "Великобритания", "Древняя Греция", "Испания", "Древняя Греция", "");

        final QuestionsList question5 = new QuestionsList("Как называлась корона древнеегипетских фараонов?",
                "Схенти", "Хнум", "Пшенти", "Ушебти", "Пшенти", "");

        final QuestionsList question6 = new QuestionsList("Какой титул был у главы государства в итальянских морских республиках в Средневековье?",
                "Царь", "Шах", "Сапа", "Дож", "Дож", "");

        final QuestionsList question7 = new QuestionsList("Какая страна начала, но не смогла закончить строительство Панамского канала?",
                "Румыния", "Польша", "Франция", "Венгрия", "Франция ", "");

        final QuestionsList question8 = new QuestionsList("Мыслителей эпохи Возрождения называют.",
                "интеллектуалами   ", "гуманистами", "философами", "схоластами", "гуманистами", "");

        final QuestionsList question9 = new QuestionsList("Великое переселение народов произошло",
                "в IV-VII вв.", "в IX-X вв.", "в I-III вв.", "во II-V вв.", "в IV-VII вв.", "");

        final QuestionsList question10 = new QuestionsList("Разгром Константинополя крестоносцами произошел",
                "в 1261 г.", "в 1453 г.", "в 1204 г.", "в 1096 г.", "в 1204 г.", "");




        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;

    }

    private static List<QuestionsList> cityQuestions() {

        final List<QuestionsList> questionsList = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Самое большое государство в Африке?",
                "Судан", "Алжир", "Ливия", "Мадагаскар", "Алжир", "");

        final QuestionsList question2 = new QuestionsList("Какой штат называют «Штатом конского каштана»?",
                "Юта", "Огайо", "Колорадо", "Иллинойс", "Огайо", "");

        final QuestionsList question3 = new QuestionsList("Около 80% территории какой страны покрыто горами?",
                "Перу", "Аргентина", "Бразилия ", "Чили", "Чили", "");

        final QuestionsList question4 = new QuestionsList("На каком острове располагаются Англия, Уэльс, Шотландия?",
                "Англия", "Великобритания", "Британия", "Шотландия", "Великобритания", "");

        final QuestionsList question5 = new QuestionsList("На территории какой страны расположено высокогорное озеро Титикака?",
                "Парагвай", "Уругвай", "Боливия", "Суринам", "Боливия", "");

        final QuestionsList question6 = new QuestionsList("Флаг какой страны состоит из двух треугольников?",
                "Непал", "Камбоджа", "Шри-Ланка", "Колумбия", "Непал", "");

        final QuestionsList question7 = new QuestionsList("Какая страна начала, но не смогла закончить строительство Панамского канала?",
                "Румыния", "Польша", "Франция", "Венгрия", "Франция ", "");

        final QuestionsList question8 = new QuestionsList("Какая страна раньше называлась Берегом Слоновой Кости?",
                "Бутан   ", "Кот-д'Ивуар", "Мадагаскар", "Иран", "Кот-д'Ивуар", "");

        final QuestionsList question9 = new QuestionsList("Какое государство называют «Страной утренней свежести»?",
                "Япония", "Китай", "Южная Корея", "Вьетнам", "Южная Корея", "");

        final QuestionsList question10 = new QuestionsList("Какое государство ранее называлось Цейлон?",
                "Шри-Ланка", "Мьянма", "Таиланд", "Вьетнам", "Шри-Ланка", "");




        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;

    }

    private static List<QuestionsList> musicQuestions() {

        final List<QuestionsList> questionsList = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList(" Ключ, который закрепляет ноту «соль»-это?",
                "альтовый", "скрипичный", "басовый", "гаечный", "скрипичный", "");

        final QuestionsList question2 = new QuestionsList("Самый низкий мужской голос-это?",
                "баритон", "бас ", "тенор", "фальцет", "бас", "");

        final QuestionsList question3 = new QuestionsList("Исполнение музыкального произведения вдвоем одновременно-это?",
                "диалог", "оркестр", "монолог", "дуэт ", "дуэт ", "");

        final QuestionsList question4 = new QuestionsList("Низкий женский голос-это?",
                "альт ", "сопрано", "тембр", "тенор", "альт ", "");

        final QuestionsList question5 = new QuestionsList("Как называется коллектив, состоящий из пяти музыкантов?",
                "квартет", "октет", "группа", "квинтет ", "квинтет ", "");

        final QuestionsList question6 = new QuestionsList("Какой из музыкальных инструментов в своем названии содержит имя своего изобретателя?",
                "скрипка", "фагот", "саксофон ", "тромбон", "саксофон ", "");

        final QuestionsList question7 = new QuestionsList("Название вступительной части произведения-это?",
                "реприза", "прелюдия ", "транспозиция", "интерлюдия", "прелюдия ", "");

        final QuestionsList question8 = new QuestionsList("Музыкальное сопровождение мелодии голоса, мелодии инструментального произведения",
                "аккомпанемент    ", "поддержка", "пение", "исполнение", "аккомпанемент ", "");

        final QuestionsList question9 = new QuestionsList("Как называется музыкальный коллектив из трех исполнителей",
                "квартет", "тетатет", "дуэт", "трио ", "трио ", "");

        final QuestionsList question10 = new QuestionsList("Звуки изображаются посредством особого рода знаков, называемых",
                "строки", "ноты ", "иероглифы", "строфы", "ноты ", "");




        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;

    }

    private static List<QuestionsList> allQuestQuestions() {

        final List<QuestionsList> questionsList = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Как называется коллектив, состоящий из пяти музыкантов?",
                "квартет", "октет", "группа", "квинтет ", "квинтет ", "");

        final QuestionsList question2 = new QuestionsList("Около 80% территории какой страны покрыто горами?",
                "Перу", "Аргентина", "Бразилия ", "Чили", "Чили", "");

        final QuestionsList question3 = new QuestionsList("Согласно легенде, какой знаменитый римлянин мог делать одновременно много дел?",
                "Нерон", "Цезарь", "Марк Цицерон", "Октавиан Август", "Цезарь", "");

        final QuestionsList question4 = new QuestionsList("Название вступительной части произведения-это?",
                "реприза", "прелюдия ", "транспозиция", "интерлюдия", "прелюдия ", "");

        final QuestionsList question5 = new QuestionsList("Какое государство называют «Страной утренней свежести»?",
                "Япония", "Китай", "Южная Корея", "Вьетнам", "Южная Корея", "");

        final QuestionsList question6 = new QuestionsList("Какой титул был у главы государства в итальянских морских республиках в Средневековье?",
                "Царь", "Шах", "Сапа", "Дож", "Дож", "");

        final QuestionsList question7 = new QuestionsList(" Ключ, который закрепляет ноту «соль»-это?",
                "альтовый", "скрипичный", "басовый", "гаечный", "скрипичный", "");


        final QuestionsList question8 = new QuestionsList("Самое большое государство в Африке?",
                "Судан", "Алжир", "Ливия", "Мадагаскар", "Алжир", "");

        final QuestionsList question9 = new QuestionsList("Великое переселение народов произошло",
                "в IV-VII вв.", "в IX-X вв.", "в I-III вв.", "во II-V вв.", "в IV-VII вв.", "");

        final QuestionsList question10 = new QuestionsList("Разгром Константинополя крестоносцами произошел",
                "в 1261 г.", "в 1453 г.", "в 1204 г.", "в 1096 г.", "в 1204 г.", "");




        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;

    }

    public static List<QuestionsList> getQuestions (String selectedTopicName){
        switch (selectedTopicName){
            case "history" : return historyQuestions();
            case "city" : return cityQuestions();
            case "music" : return musicQuestions();
            default : return allQuestQuestions();


        }
    }

}
