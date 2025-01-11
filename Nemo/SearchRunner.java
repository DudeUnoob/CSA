package Nemo;

public class SearchRunner {
    
    public static void main(String[] args) {
        String exampleString = "I think that I shall never see; A poem lovely as a tree.";
        Search m = new Search(exampleString);
        m.findNemo1();
        System.out.println(m);

        String preamble = "We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defense, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America.";
        Search n = new Search(preamble);
        n.findNemo2();
        System.out.println(n);
    }
}
