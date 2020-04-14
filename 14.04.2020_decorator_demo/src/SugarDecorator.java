public class SugarDecorator extends AbstractDecorator {

    private final static int SUGAR_PRICE = 5;

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public int getPrice() {
        return super.getPrice() + SUGAR_PRICE;
    }

}
