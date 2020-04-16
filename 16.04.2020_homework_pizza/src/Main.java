public class Main {

    public static void main(String[] args) {

        Pizza p = new PizzaImpl();
        System.out.println(p.getPrice());

        Pizza ph = new HamDecorator(p);
        System.out.println(ph.getPrice());

        Pizza ps = new SalamiDecorator(p);
        System.out.println(ps.getPrice());

        Pizza pm = new MushroomDecorator(p);
        System.out.println(pm.getPrice());

        Pizza phsm = new HamDecorator(new SalamiDecorator(new MushroomDecorator(p)));
        System.out.println(phsm.getPrice());

    }

}
