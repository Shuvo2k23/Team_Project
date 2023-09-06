# Team_Projec -
Team no - 18<br>
team Members - Shuvo Roy, Samudra Mazmder, Soumithra Debnath Shanto<br>

Project Name: Trivia Hangman<br>
Project Description: The Trivia Hangman project is a creative fusion of two classic games: trivia questions and Hangman. In this console-based game, users are presented with a trivia question, and they must guess letters to complete a hidden phrase related to the question. Each incorrect guess results in the gradual drawing of a hangman figure. The goal is to guess the phrase before the hangman is fully drawn.
<br>Features:<br>
Trivia Questions: Prepare a set of trivia questions and answers. These questions could cover a range of topics such as history, science, pop culture, or general knowledge.
Hidden Phrase: Create a hidden phrase associated with each trivia question. This phrase is revealed as the user guesses correct letters.
Gameplay: Present a trivia question to the user. As the user guesses correct letters, reveal the corresponding positions of those letters in the hidden phrase.
Incorrect Guesses: Keep track of incorrect guesses. For each incorrect guess, gradually draw the hangman figure.
Win and Lose Conditions: Define conditions for winning (guessing the phrase correctly) and losing (hangman figure completed). Inform the player when they have won or lost the game.
User Interaction: Allow users to input guesses through the console. Handle both single-letter guesses and full-phrase guesses.
Error Handling: Handle invalid inputs, such as repeated guesses, non-alphabet characters, or invalid phrase guesses.
Game Replay: After the game ends (win or lose), ask the player if they want to play again. If yes, select a new trivia question and restart the game.
User Interaction: Users interact with the program through the console. The program displays the trivia question, the hangman figure, the hidden phrase, and prompts for user input. Here's a basic interaction flow:
Display a welcome message and explanation of the Trivia Hangman game.
Present the trivia question and the hidden phrase (with underscores for unguessed letters).
User guesses a letter or phrase.
Display the updated hangman figure, if necessary, based on incorrect guesses.
Reveal correct letter positions in the hidden phrase.
Repeat steps 3-5 until the player wins or loses.
Display a win or lose message, and ask if the player wants to play again.
Implementation Considerations:
Create a class named TriviaQuestion to represent individual trivia questions, including the question, answer, and associated phrase.
Utilize data structures (e.g., lists or arrays) to manage the collection of trivia questions.
Implement methods to display questions, accept user input, and calculate the hangman figure.
Use loops to iterate through the gameplay steps and provide a smooth gaming experience.
Example Usage:
Welcome to Trivia Hangman!<br>
<br>
Question: What is the capital of France?<br>
Hidden Phrase: _ _ _ _ _ _<br>
<br>
Incorrect Guesses: 0/6<br>
Enter a letter guess: p<br>
<br>
Incorrect Guesses: 1/6<br>
Enter a letter guess: a<br>
<br>
Hidden Phrase: _ a _ _ _ _<br>
<br>
Incorrect Guesses: 1/6<br>
Enter a letter guess: r<br>
<br><br>
Congratulations! You've guessed the phrase "PARIS" correctly!<br>
<br>
Do you want to play again? (yes/no): no<br>
Thank you for playing Trivia Hangman!<br>
<br>
Conclusion: The "Trivia Hangman" project offers an entertaining and educational experience for students to practice their Java programming skills. It combines aspects of trivia questions and Hangman gameplay to create a unique and challenging game. This project helps students gain experience in managing game states, user input, and presenting engaging content to users through a console interface.
