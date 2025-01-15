package ArrayList3_KamaniDamodar_01102025_pd6.src;
import java.io.*;
import java.util.ArrayList;

public class WordTripleRunner {
    private static final String INPUT_FILE = "triplets.cvhs";
    
    public static void main(String[] args) {
        ArrayList<WordTriple> wordTriples = loadWordTriples();
        
        if (wordTriples != null) {
            System.out.println("Count of WordTriples starting with 'to': " + count(wordTriples, "to"));
            System.out.println("Count of all occurrences of 'to': " + countAll(wordTriples, "to"));
        }
    }

    private static ArrayList<WordTriple> loadWordTriples() {
        try (ObjectInputStream ois = new CustomObjectInputStream(
                new BufferedInputStream(new FileInputStream(INPUT_FILE)))) {
            return (ArrayList<WordTriple>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    public static int count(ArrayList<WordTriple> triples, String startWith) {
        if (triples == null || startWith == null) return 0;
        
        int count = 0;
        for (WordTriple triple : triples) {
            if (triple.getWord1().equals(startWith)) {
                count++;
            }
        }
        return count;
    }

    public static int countAll(ArrayList<WordTriple> triples, String wordToCount) {
        if (triples == null || wordToCount == null) return 0;
        
        int count = 0;
        for (WordTriple triple : triples) {
            if (triple.getWord1().equals(wordToCount)) count++;
            if (triple.getWord2().equals(wordToCount)) count++;
            if (triple.getWord3().equals(wordToCount)) count++;
        }
        return count;
    }

	static class CustomObjectInputStream extends ObjectInputStream {
    	public CustomObjectInputStream(InputStream in) throws IOException {
        	super(in);
    	}

    	@Override
    	protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
        	if (desc.getName().equals("collection3.WordTriple")) {
            	return WordTriple.class;
        	}
        	return super.resolveClass(desc);
    	}
	}
}

