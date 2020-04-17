public class DisabledState implements GadgetState {

    @Override
    public void doAction() {
        System.out.println("I'm switched OFF");
    }

}
