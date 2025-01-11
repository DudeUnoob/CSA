package KamaniDamodar_Phrase_10312024_pd6.src.phrase;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurence(String str, int n) {
        int count = 0;
        int pos = 0;
        
        while (count < n && pos != -1) {
            pos = currentPhrase.indexOf(str, pos);
            if (pos != -1) {
                count++;
                if (count < n) {
                    pos += 1;
                }
            }
        }
        return pos;
    }

    public void replaceNthOccurence(String str, int n, String repl) {
        int pos = findNthOccurence(str, n);
        if (pos != -1) {
            currentPhrase = currentPhrase.substring(0, pos) + repl + currentPhrase.substring(pos + str.length());
        }
    }

    public int findLastOccurence(String str) {
        int i = 1;
        int lastPos = -1;
        int currentPos;
        
        while ((currentPos = findNthOccurence(str, i)) != -1) {
            lastPos = currentPos;
            i++;
        }
        
        return lastPos;
    }

    public String toString() {
        return currentPhrase;
    }
}