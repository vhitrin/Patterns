package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton;
        singleton = Singleton.getInstance("First");
        singleton = Singleton.getInstance("Second");
        System.out.println(singleton.name);
    }
}
