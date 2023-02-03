package Singleton;

public class Main {
    public static void main(String[] arg){
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
    
        if(object1 == object2){
            System.out.println("object1 and object2 are Same Object");
        }
    
        System.out.println("Count: " + Singleton.getCount());
    }
}
