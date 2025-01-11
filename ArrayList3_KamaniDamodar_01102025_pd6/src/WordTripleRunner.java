import java.io.*;
import java.util.ArrayList;

public class WordTripleRunner {
    public static int count(ArrayList<WordTriple> obj, String startWith) {
        int count = 0;
        for (WordTriple triple : obj) {
            if (triple.getWord1().equals(startWith)) {
                count++;
            }
        }
        return count;
    }
    
    public static int countAll(ArrayList<WordTriple> obj, String wordToCount) {
        int count = 0;
        for (WordTriple triple : obj) {
            if (triple.getWord1().equals(wordToCount)) count++;
            if (triple.getWord2().equals(wordToCount)) count++;
            if (triple.getWord3().equals(wordToCount)) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("triplets.cvhs"))) {
            ArrayList<WordTriple> wordTripleObj = (ArrayList<WordTriple>) ois.readObject();
            
            for (WordTriple triple : wordTripleObj) {
                System.out.println(triple);
            }

            System.out.println("\nTesting count method:");
            System.out.println("Words starting with 'for': " + count(wordTripleObj, "for"));
            System.out.println("Words starting with 'a': " + count(wordTripleObj, "a"));

            System.out.println("\nTesting countAll method:");
            System.out.println("Total occurrences of 'to': " + countAll(wordTripleObj, "to"));
            System.out.println("Total occurrences of 'general': " + countAll(wordTripleObj, "general"));
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
} 