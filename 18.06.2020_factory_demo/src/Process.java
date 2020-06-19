public class Process {

    private String action;
    private ImageActionFactory factory;

    public Process(String action, ImageActionFactory factory) {
        this.action = action;
        this.factory = factory;
    }

    public void execute() {
        ImageAction imageAction = factory.getImageAction(action);

        if (imageAction != null) {
            imageAction.doAction();
        } else {
            System.out.println("No action found: " + action);
        }
    }

}
