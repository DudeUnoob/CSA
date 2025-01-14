import java.io.Serializable;

public class WordTriple implements Serializable {
	private static final long serialVersionUID = 3496L;

	private String word1;
	private String word2;
	private String word3;

	public WordTriple(String word1, String word2, String word3) {
    	this.word1 = word1;
    	this.word2 = word2;
    	this.word3 = word3;
	}

	public String getWord1() {
    	return word1;
	}

	public String getWord2() {
    	return word2;
	}

	public String getWord3() {
    	return word3;
	}

	public String toString() {
    	return ":: " + word1 + ", " + word2 + ", " + word3 + " ::";
	}
}

