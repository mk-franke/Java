public class Main {

    public static void main(String[] args) {

        Coffee c = new CoffeeImpl();

        Coffee cm = new MilkDecorator(c);
        System.out.println(cm.getPrice());

        Coffee cs = new SugarDecorator(c);
        System.out.println(cs.getPrice());

        Coffee cms = new MilkDecorator(new SugarDecorator(new CoffeeImpl()));
        System.out.println(cms.getPrice());

    }

}
