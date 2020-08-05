public class MushroomDecorator extends AbstractDecorator {

    private final static int MUSHROOM_PRICE = 60;

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getPrice() {
        return super.getPrice() + MUSHROOM_PRICE;
    }

}