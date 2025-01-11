package WordFun.src;

public class WordFun {
    private String word;

    public WordFun(String w) {
        this.word = w;
    }

    public void makeUpper() {

        String newWord = word
            .replace("b", "B").replace("c", "C").replace("d", "D").replace("f", "F")
            .replace("g", "G").replace("h", "H").replace("j", "J").replace("k", "K")
            .replace("l", "L").replace("m", "M").replace("n", "N").replace("p", "P")
            .replace("q", "Q").replace("r", "R").replace("s", "S").replace("t", "T")
            .replace("v", "V").replace("w", "W").replace("x", "X").replace("y", "Y")
            .replace("z", "Z");
        System.out.println(newWord);
    }

    public void addHyphen() {

        String hyphenatedWord = word.replace(" ", "-");
        System.out.println(hyphenatedWord);
    }

    public String toString() {
        return word;
    }
}
