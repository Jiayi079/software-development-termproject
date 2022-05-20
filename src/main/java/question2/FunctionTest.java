package question2;

import java.util.HashSet;
import java.util.Set;

public class FunctionTest {

    public static StringTester hasDuplicateTester(){
        return new duplicateTester();
    }

    public static StringTester hasCapsChecker() {
        return new capsChecker();
    }
}
