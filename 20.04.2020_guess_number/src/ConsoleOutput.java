public class ConsoleOutput implements GameOutput {

    @Override
    public void print(String result) {
        System.out.println(result);
    }

}