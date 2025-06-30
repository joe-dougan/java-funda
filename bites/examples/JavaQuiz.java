package bites.examples;

public class JavaQuiz {
    String questionOne;
    String questionTwo;

    public JavaQuiz(String questionOne, String questionTwo){
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

    public String getQuestionOne() {
        return this.questionOne;
    }

    public String getQuestionTwo() {
        return this.questionTwo;
    }

    public static void main(String[] args) {
        JavaQuiz quiz = new JavaQuiz("What is the capital of England?", "What flag is not a rectangular shape?");
        System.out.println(quiz.getQuestionOne());
        System.out.println(quiz.getQuestionTwo());

    }
}