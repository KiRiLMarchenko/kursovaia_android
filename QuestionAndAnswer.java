package Model;

import android.util.Log;

import java.util.logging.Logger;

public class QuestionAndAnswer {

    public static Logger log = Logger.getLogger(QuestionAndAnswer.class.getName());

    private int id;
    private String Question;
    private String Answer1;
    private String Answer2;
    private String Answer3;
    private String Answer4;
    private String CorrectAnswer;

    private String UserSelectedAnswer;


    public QuestionAndAnswer() {
    }

    public QuestionAndAnswer(int id, String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String userSelectedAnswer) {
        this.id = id;
        Question = question;
        Answer1 = answer1;
        Answer2 = answer2;
        Answer3 = answer3;
        Answer4 = answer4;
        CorrectAnswer = correctAnswer;
        UserSelectedAnswer = userSelectedAnswer;
    }

    public QuestionAndAnswer(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer,String userSelectedAnswer) {
        this.Question = question;
        this.Answer1 = answer1;
        this.Answer2 = answer2;
        this.Answer3 = answer3;
        this.Answer4 = answer4;
        this.CorrectAnswer = correctAnswer;
        this.UserSelectedAnswer = userSelectedAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(String answer1) {
        Answer1 = answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(String answer2) {
        Answer2 = answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public void setAnswer3(String answer3) {
        Answer3 = answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public void setAnswer4(String answer4) {
        Answer4 = answer4;
    }

    public String getCorrectAnswer() {

        return CorrectAnswer;

    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    public String getUserSelectedAnswer() {
        return UserSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        UserSelectedAnswer = userSelectedAnswer;
    }

    @Override
    public String toString() {
        return "QuestionAndAnswer{" +
                "id=" + id +
                ", Question='" + Question + '\'' +
                ", Answer1='" + Answer1 + '\'' +
                ", Answer2='" + Answer2 + '\'' +
                ", Answer3='" + Answer3 + '\'' +
                ", Answer4='" + Answer4 + '\'' +
                ", CorrectAnswer='" + CorrectAnswer + '\'' +
                ", UserSelectedAnswer='" + UserSelectedAnswer + '\'' +
                '}';
    }
}
