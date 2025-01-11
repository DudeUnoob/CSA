package StringCleaner;

public class StringCleaner {
    private String undesired;
    private String sentence;
    private String originalSentence;

    public StringCleaner(String sen, String und) {
        this.sentence = sen;
        this.undesired = und;
        this.originalSentence = sen;
    }

    public void deleteStrings() {
        int n = sentence.length();
        int m = undesired.length();

        int i = 0;

        while (i <= n - m) {
            if (sentence.substring(i, i + m).equals(undesired)) {
                if (i > 0 && Character.isLetter(sentence.charAt(i - 1))) {
                    sentence = sentence.substring(0, i - 1) + sentence.substring(i + m);
                } else {
                    sentence = sentence.substring(0, i) + sentence.substring(i + m);
                }

                n = sentence.length();

                i = 0;
            } else {
                i++;
            }
        }

    }


    public String toString() {
        return String.format("%s - String to remove %s \n%s\n\n", originalSentence, undesired, sentence);
    }

}