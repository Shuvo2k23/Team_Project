package Projects;

import java.util.Random;
import java.util.Scanner;

public class Console extends QuestionsAns{
    Scanner scan = new Scanner(System.in);
    private final int ERRORS = 6;
    private final int TOTAL_QUESTION = 2;
    public void play(){
        Random random = new Random();
        int questionIndex = random.nextInt(TOTAL_QUESTION);
        System.out.println("Question: "+questions.get(questionIndex));
        System.out.print("Hidden Phrase: ");
        String ans = answer.get(questionIndex);
        int limit = ans.length();
        for(int i =0;i< limit;i++){
            System.out.print("- ");
        }
        System.out.println();
        //Gameplay-----------------------------------------
        int i =0,countRight =0;
        boolean[] checkAns = new boolean[limit];
        while (i<ERRORS) {
            System.out.println();
            System.out.println("Incorrect Guesses: "+i+"/6");
            System.out.print("Enter a latter guess: ");
            char input = scan.next().charAt(0);
            boolean present = false;
            for(int j =0;j<limit;j++){
                if(input == ans.charAt(j) && !checkAns[j]){
                    present = true;
                    checkAns[j] = true;
                    countRight++;
                    break;
                }
            }
            if(present){
                System.out.println();
                for(int j=0;j<limit;j++){
                    if(checkAns[j]){
                        System.out.print(ans.charAt(j)+ " ");
                    }
                    else{
                        System.out.print("- ");
                    }

                }
                System.out.println();
            }
            else{
                i++;
            }
            if(countRight==limit){
                System.out.println("Congratulations! You've guessed the phrase \"" +ans+"\" correctly!");
                break;
            }
            System.out.println();
        }
        if(countRight!=limit){
            System.out.println("Game over! Right phrase is \"" +ans +"\".");
        }

        //System.out.println(ans);
    }
}
