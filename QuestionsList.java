package Marchenko.Kirill.applicationquiz;

public class QuestionsList {

    private final String option1;
    private final String option2;
    private final String option3;
    private final String option4;
    private final String question;
    private final String answer;
    private final String userSelectedAnswer;

    public QuestionsList(String question,String option1, String option2, String option3, String option4,  String answer, String userSelectedAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }
}
