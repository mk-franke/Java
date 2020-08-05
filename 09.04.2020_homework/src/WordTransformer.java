public class WordTransformer {

    public static String transform(String input, RuleInterface ri) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (ri.check(word)) {
                words[i] = ri.action(word);
            }
        }
        return String.join(" ", words);
    }

    public static String transform(String input) {
        RuleInterface ri = new TransformRule3();
        return transform(input, ri);
    }

}