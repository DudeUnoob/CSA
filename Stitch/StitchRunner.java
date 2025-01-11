package Stitch;

public class StitchRunner {

    public static void main(String[] args) {

        
        System.out.println("stitch1 Tests:");
        System.out.println(Stitch.stitch1("abcdefg", "123")); 
        System.out.println(Stitch.stitch1("123", "abcdefg"));
        System.out.println(Stitch.stitch1("", "123"));        
        System.out.println(Stitch.stitch1("abc123", ""));     
        System.out.println(Stitch.stitch1("hello", "1234")); 

      
        System.out.println("\nstitch2 Tests:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Stitch.stitch2("a2c3", "123456"));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Stitch.stitch2("b4d6", "987654"));
        }
    }
}
