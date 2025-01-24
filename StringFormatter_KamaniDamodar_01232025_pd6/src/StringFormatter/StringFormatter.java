package StringFormatter_KamaniDamodar_01232025_pd6.src.StringFormatter;
import java.util.List;

public class StringFormatter {
    private List<String> wordList;
    
    public StringFormatter(List<String> w) {
        wordList = w;
    }
    
    public int totalLetters() {
        int total = 0;
        for (String word : wordList) {
            total += word.length();
        }
        return total;
    }
    
    public int basicGapWidth(int fL) {
        int spaces = fL - totalLetters();
        int gaps = wordList.size() - 1;
        return spaces / gaps;
    }
    
    public int leftoverSpaces(int fL) {
        int spaces = fL - totalLetters();
        int gaps = wordList.size() - 1;
        return spaces % gaps;
    }
    
    public String format(int fL) {
        int basicWidth = basicGapWidth(fL);
        int extras = leftoverSpaces(fL);
        
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
        String result = "StringFormatter_{\nwordList: [";
        
        for (int i = 0; i < wordList.size(); i++) {
            result += wordList.get(i);
            if (i < wordList.size() - 1) {
                result += ", ";
            }
        }
        
        result += "]\n}";
        return result;
    }
    
    public List<String> getWordList() {
        return wordList;
    }
    
    public void setWordList(List<String> w) {
        wordList = w;
    }
} 