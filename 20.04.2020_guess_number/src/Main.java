public class Main {

    public static void main(String[] args) {

        KeyboardReader reader = new KeyboardReader();
        ConsoleOutput output = new ConsoleOutput();

        int secretNumber = 15;
        int attempts = 3;

        Game game = new Game(secretNumber, attempts, reader, output);
        game.play();

    }

}