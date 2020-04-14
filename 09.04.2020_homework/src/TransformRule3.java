public class TransformRule3 implements RuleInterface {

    @Override
    public boolean check(String input) {
        return input.length() == 3;
    }

    @Override
    public String action(String input) {
        return input.toUpperCase();
    }

}
