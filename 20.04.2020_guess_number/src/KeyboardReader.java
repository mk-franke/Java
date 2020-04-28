import java.util.Scanner;

public class KeyboardReader implements GameReader {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int getGuessedNumber() {
        return scanner.nextInt();
    }

}
