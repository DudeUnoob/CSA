package GuessingGame;

public class Guess {

    private char key;

    public Guess() {

        int randomIndex = (int)(Math.random() * 26);
        
        key = (char)('a' + randomIndex);
        

        System.out.println(key);
    }

    public boolean checkLetter(char guess) {

        if (key == guess){
            return true;
        }
        else {
            if(guess < key){
                System.out.println("Your guess was lower. Try a higher number");
            }

            else {
                System.out.println("Your guess was higher. Try a lower number");
            }

            return false;
        }
    }
    
}
