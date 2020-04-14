public class TransformRule5 implements RuleInterface {

    @Override
    public boolean check(String input) {
        return input.length() == 5;
    }

    @Override
    public String action(String input) {
        return input.toLowerCase();
    }

}
