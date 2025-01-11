package Nemo;

public class Search {

    private String nemo;
    private int n_count, e_count, m_count, o_count;

    public Search(String nemo) {
        this.nemo = nemo;

    }

    public void findNemo1() {
        int i = 0;
        int totalLetters = 0; 
        do {
            char currentChar = nemo.charAt(i); 
            if (Character.isLetter(currentChar)) {
                totalLetters++; 
                if (currentChar == 'n') {
                    n_count++;
                } else if (currentChar == 'e') {
                    e_count++;
                } else if (currentChar == 'm') {
                    m_count++;
                } else if (currentChar == 'o') {
                    o_count++;
                }
            }
            i++;
        } while (i < nemo.length());
        
        getTotalLetters(totalLetters);
    }

    public void findNemo2() {
        int totalLetters = 0; 

        for (int i = 0; i < nemo.length(); i++) {
            char currentChar = Character.toLowerCase(nemo.charAt(i));
            if (Character.isLetter(currentChar)) {
                totalLetters++; 
                if (currentChar == 'n') {
                    n_count++;
                } else if (currentChar == 'e') {
                    e_count++;
                } else if (currentChar == 'm') {
                    m_count++;
                } else if (currentChar == 'o') {
                    o_count++;
                }
            }
        }
        
        getTotalLetters(totalLetters);
    }

    public double percentage(int count, int total) {
        if (total == 0) return 0; 
        return (double) count / total * 100; 
    }

    public String toString() {
        String result = "There are " + getTotalLetters() + " letters in the \"" + nemo + "\"\n";
        result += "n = " + n_count + " at " + String.format("%.6f", percentage(n_count, getTotalLetters())) + "%\n";
        result += "e = " + e_count + " at " + String.format("%.6f", percentage(e_count, getTotalLetters())) + "%\n";
        result += "m = " + m_count + " at " + String.format("%.6f", percentage(m_count, getTotalLetters())) + "%\n";
        result += "o = " + o_count + " at " + String.format("%.6f", percentage(o_count, getTotalLetters())) + "%\n";
        return result;
    }

    private int totalLetters = 0;

    private void getTotalLetters(int count) {
        this.totalLetters = count;
    }

    private int getTotalLetters() {
        return this.totalLetters; 
    }
}
