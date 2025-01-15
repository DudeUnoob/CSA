package ArrayList3_KamaniDamodar_01102025_pd6.src;
import java.io.Serializable;

public class WordTriple implements Serializable {
	private static final long serialVersionUID = 3496L;

	private String w1;
	private String w2;
	private String w3;

	public WordTriple(String a, String b, String c) {
        w1 = a;
        w2 = b;
        w3 = c;
    }

    public String getWord1() {
        return w1;
    }

    public String getWord2() {
        return w2;
    }

    public String getWord3() {
        return w3;
    }

    public String toString() {
        return "WordTriple_{ " + 
        " word1: " + w1 + "\n"
        + "word2: " + w2 + "\n"
        + "word3:" + w3 + "\n" 
        "}";
    }
}

