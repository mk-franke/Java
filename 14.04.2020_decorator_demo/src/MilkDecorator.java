public class MilkDecorator extends AbstractDecorator {

    private final static int MILK_PRICE = 10;

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public int getPrice() {
        return super.getPrice() + MILK_PRICE;
    }

}
