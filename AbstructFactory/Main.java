package AbstructFactory;

import AbstructFactory.factory.Factory;

public class Main {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreateFactory");
            System.out.println("Example1: java Main listfactory.ListFactory");
            System.out.println("Example2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);
    }
}
