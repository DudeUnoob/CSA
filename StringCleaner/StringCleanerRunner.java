package StringCleaner;

public class StringCleanerRunner {
    public static void main(String[] args) {
        StringCleaner testOne = new StringCleaner("xR-MxR-MHelloxR-M", "R-M");
        StringCleaner testTwo = new StringCleaner("sxsssxssxsxssexssxsesss", "xs");
        StringCleaner testThree = new StringCleaner("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
        StringCleaner testFour = new StringCleaner("dogdogcatddodogdogdoggog", "dog");

        testOne.deleteStrings();
        testTwo.deleteStrings();
        testThree.deleteStrings();
        testFour.deleteStrings();

        System.out.println(testOne);  
        System.out.println(testTwo);
        System.out.println(testThree);
        System.out.println(testFour);
    }
}
