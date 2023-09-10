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
        questions.add("What is the capital of India ?");
        answer.add("Delhi");
        questions.add("Who is the best all rounder of cricket?");
        answer.add("Shakib");
        questions.add("Who is the best player of football?");
        answer.add("Neymar");
        questions.add("Which team won the FIFA World Cup five times?");
        answer.add("Brazil");
        questions.add("Which team was winner of last FIFA world cup??");
        answer.add("Argentina");
        questions.add("What is the name of largest bridge of Bangladesh?");
        answer.add("Padmabridge");
        questions.add("What is the name of Bangladesh national Bird?");
        answer.add("Magpie");
        questions.add("Which year bangladesh was independent?");
        answer.add("1971");
        questions.add("Which city is called \"SilkCity\" in Bangladesh?");
        answer.add("Rajshahi");
        questions.add("When Rajshahi University was established?");
        answer.add("1953");
        questions.add("Who wrote \"Romeo and Juliet\"?");
        answer.add("Shakespeare");
        questions.add("What is the chemical symbol for gold?");
        answer.add("Au");
        questions.add("What is the largest planet in our solar system?");
        answer.add(" Jupiter");
        questions.add("Who painted the Mona Lisa?");
        answer.add("da Vinci");
        questions.add("What is the primary gas in Earth's atmosphere? ");
        answer.add("Oxygen");
        questions.add("What is the opposite of \"dark\"?");
        answer.add("Light");
        questions.add("What is the square root of 25?");
        answer.add("Five");
        questions.add("Which continent is home to the Sahara Desert?");
        answer.add("Africa");
        questions.add("What is the process by which plants make their own food?");
        answer.add("Photosynthesis");



        //hangman------------------------------------------------------
        hangman.add("\n+- - - - - -+\n");
        hangman.add("      |   |\n");
        hangman.add("      O   |\n");
        hangman.add("    / | \\ |\n");
        hangman.add("     / \\  |\n");
        hangman.add("          |\n");
        hangman.add("===========\n");
    }

}
