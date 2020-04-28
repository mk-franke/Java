public class Game {

    private int secretNumber;
    private int attempts;
    private GameReader reader;
    private GameOutput output;

    public Game(int secretNumber, int attempts, GameReader reader, GameOutput output) {
        this.secretNumber = secretNumber;
        this.attempts = attempts;
        this.reader = reader;
        this.output = output;
    }

    public void play() {
        showGreetings();
        boolean guess = tryToGuess();
        showGameOver(guess);
    }

    private boolean tryToGuess() {
        boolean guessedCorrectly = false;
        while(attempts > 0 && !guessedCorrectly) {
            int number = getNumber();
            if(number == secretNumber) {
                guessedCorrectly = true;
            } else {
                showTryAgain();
            }
            attempts--;
        }
        return guessedCorrectly;
    }

    private void showGreetings() {
        output.print("Enter your number: ");
    }

    private void showTryAgain () {
        output.print("Try again");
    }

    private void showGameOver(boolean guess) {
        if(guess) {
            output.print("Congratulation, you won!");
        } else {
            output.print("You lose!");
        }
    }

    private int getNumber() {
        return reader.getGuessedNumber();
    }

}