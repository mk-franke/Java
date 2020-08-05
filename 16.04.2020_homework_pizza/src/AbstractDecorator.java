public class AbstractDecorator implements Pizza {

    private Pizza pizza;

    public AbstractDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getPrice() {
        return pizza.getPrice();
    }

}
