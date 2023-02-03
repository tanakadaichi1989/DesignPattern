package Singleton;

public class Singleton  {
    private static Singleton singleton = new Singleton();
    private static int count = 0;
    private Singleton(){};

    public static Singleton getInstance(){
        count += 1;
        return singleton;
    }

    public static int getCount(){
        return count;
    }
}
