public class OuterDemo {

    public static String message = "Hello World!";

    public static class InnerDemo {

        public void print() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        OuterDemo od = new OuterDemo();
        OuterDemo.InnerDemo id = new InnerDemo(); //if inner class is static
        id.print();
//        OuterDemo.InnerDemo id = o.new InnerDemo(); //if inner class is not static
    }

}
