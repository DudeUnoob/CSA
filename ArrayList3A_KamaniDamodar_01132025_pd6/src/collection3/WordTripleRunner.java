package collection3;

import java.io.*;
import java.util.*;

public class WordTripleRunner {
    private static ArrayList<WordTriple> wordTriples;
    
    public static void main(String[] args) {
        loadWordTriples();
        if (wordTriples != null) {
            
            Iterator<WordTriple> it = wordTriples.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
            
            System.out.println("\nTesting countRepeats method:");
            System.out.println("Count for 'in': " + countRepeats("in"));
            System.out.println("Count for 'ordain': " + countRepeats("ordain"));
            System.out.println("Count for 'to': " + countRepeats("to"));
            System.out.println("Count for 'States': " + countRepeats("States"));
        }
    }
    
    private static void loadWordTriples() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("triplets-2.cvhs")))) {
            wordTriples = (ArrayList<WordTriple>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            wordTriples = null;
        }
    }
    
    public static int countRepeats(String word) {
        if (wordTriples == null || word == null) return -1;
        
        int repeatedCount = 0;
        for (WordTriple triple : wordTriples) {
      
            int count = 0;
            if (triple.getWord1().equals(word)) count++;
            if (triple.getWord2().equals(word)) count++;
            if (triple.getWord3().equals(word)) count++;
            

            if (count > 1) {
                repeatedCount++;
            }
        }
        
        if (repeatedCount == 0) {
            boolean wordFound = wordTriples.stream().anyMatch(triple -> 
                triple.getWord1().equals(word) || 
                triple.getWord2().equals(word) || 
                triple.getWord3().equals(word));
            return wordFound ? 0 : -1;
        }
        
        return repeatedCount;
    }
} 