public class SalamiDecorator extends AbstractDecorator{

    private final static int SALAMI_PRICE = 70;

    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getPrice() {
        return super.getPrice() + SALAMI_PRICE;
    }

}
