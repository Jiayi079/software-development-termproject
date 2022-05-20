package question5;

public class SingletonTest {

    private static SingletonTest instance = null;

    public static SingletonTest getInstance(){
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }
}
