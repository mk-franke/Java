public class Gadget {

    private GadgetState state;

    public void setState(GadgetState state) {
        this.state = state;
    }

    public void doAction() {
        this.state.doAction();
    }

}
