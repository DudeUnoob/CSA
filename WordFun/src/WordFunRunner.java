package WordFun.src;
import static java.lang.System.*;

public class WordFunRunner {
    public static void main(String args[]) {
        WordFun test = new WordFun("Hello World");
        WordFun rhinos = new WordFun("Carnegie rhinos");
        WordFun cs = new WordFun("Computer Science");
        WordFun cvhsTeam = new WordFun("CVHS TEAM");
        WordFun stateChamps = new WordFun("State Champions");

        out.println(test);
        test.makeUpper();
        out.println(test);
        test.addHyphen();
        out.println(test);

        out.println(rhinos);
        rhinos.makeUpper();
        out.println(rhinos);
        rhinos.addHyphen();
        out.println(rhinos);

        out.println(cs);
        cs.makeUpper();
        out.println(cs);
        cs.addHyphen();
        out.println(cs);

        out.println(cvhsTeam);
        cvhsTeam.makeUpper();
        out.println(cvhsTeam);
        cvhsTeam.addHyphen();
        out.println(cvhsTeam);

        out.println(stateChamps);
        stateChamps.makeUpper();
        out.println(stateChamps);
        stateChamps.addHyphen();
        out.println(stateChamps);
    }
}