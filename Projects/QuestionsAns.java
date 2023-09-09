package Projects;

import java.util.ArrayList;

public class QuestionsAns {
    ArrayList<String>questions = new ArrayList<>();
    ArrayList<String>answer = new ArrayList<>();
    ArrayList<String>hangman = new ArrayList<>();
    public QuestionsAns(){
        questions.add("What is the capital of France?");
        answer.add("Paris");
        questions.add("What is the capital of Bangladesh?");
        answer.add("Dhaka");
        questions.add("What is the capital of India?");
        answer.add("Delhi");
        hangman.add("\n+- - - - - -+\n");
        hangman.add("      |   |\n");
        hangman.add("      O   |\n");
        hangman.add("    / | \\ |\n");
        hangman.add("     / \\  |\n");
        hangman.add("          |\n");
        hangman.add("===========\n");
    }

}
