package question2;

@FunctionalInterface
public interface StringTester {

    public boolean testString(String input);
}

class duplicateTester implements StringTester {

    @Override
    public boolean testString(String input) {
        String prev = null;
        String next = null;
        if (input != null) {
            for (String s : input.split("")) {
                if (prev == null) {
                    prev = s;
                } else {
                    next = s;
                    if (prev.equals(next)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

class capsChecker implements StringTester {

    @Override
    public boolean testString(String input) {
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                if (Character.isUpperCase(input.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
