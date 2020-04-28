public class Main {

    public static void main(String[] args) {

        Gadget g = new Gadget();
        GadgetState onState = new EnabledState();
        GadgetState offState = new DisabledState();

        g.setState(onState);
        g.doAction();

        g.setState(offState);
        g.doAction();

    }

}
