package Projects;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Trivia Hangman!");
        System.out.println();
        Console console = new Console();
        boolean repeat = true;


        Scanner scan = new Scanner(System.in);
       do{
            console.play();
            System.out.println();
            System.out.println("Do you play again? (yes/no): ");
            String response = scan.next();
            if(response.equals("no")){
                repeat = false;
            }

       }
       while (repeat);
        System.out.println("\nThank you for playing Trivia Hangman!");

    }
}
