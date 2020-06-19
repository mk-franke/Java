public class Demo {

    public static void main(String[] args) {

//        String action = args[0];
        String action = "THUMBNAIL";

        ImageActionFactory factory = new ImageActionFactory();

        Process process = new Process(action, factory);
        process.execute();

    }

}
