public class HamDecorator extends AbstractDecorator {

    private final static int HAM_PRICE = 80;

    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getPrice() {
        return super.getPrice() + HAM_PRICE;
    }

}
