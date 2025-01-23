package StringFormatter_KamaniDamodar_01232025_pd6.src.StringFormatter;
import java.util.List;

public class StringFormatter {
    private List<String> wordList;
    
    public StringFormatter(List<String> words) {
        wordList = words;
    }
    
    public int totalLetters() {
        int total = 0;
        for (String word : wordList) {
            total += word.length();
        }
        return total;
    }
    
    public int basicGapWidth(int formattedLen) {
        int spaces = formattedLen - totalLetters();
        int gaps = wordList.size() - 1;
        return spaces / gaps;
    }
    
    public int leftoverSpaces(int formattedLen) {
        int spaces = formattedLen - totalLetters();
        int gaps = wordList.size() - 1;
        return spaces % gaps;
    }
    
    public String format(int formattedLen) {
        int basicWidth = basicGapWidth(formattedLen);
        int extras = leftoverSpaces(formattedLen);
        
        String result = wordList.get(0);
        
        for (int i = 1; i < wordList.size(); i++) {
            int spacesToAdd = basicWidth;
            if (extras > 0) {
                spacesToAdd++;
                extras--;
            }
            
            for (int j = 0; j < spacesToAdd; j++) {
                result += " ";
            }
            result += wordList.get(i);
        }
        
        return result;
    }
    
    public String toString() {
        return "StringFormatter_{ " + 
               " wordList: " + wordList + "\n" +
               "}";
    }
    
    public List<String> getWordList() {
        return wordList;
    }
    
    public void setWordList(List<String> words) {
        wordList = words;
    }
} 