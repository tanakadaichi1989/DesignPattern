package AbstructFactory;
import AbstructFactory.factory.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreateFactory");
            System.out.println("Example1: java Main listfactory.ListFactory");
            System.out.println("Example2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory();

        Link google = factory.createLink("Google", "https://www.google.com/");
        Link yahoo = factory.createLink("yahoo", "https://www.yahoo.co.jp/");

        Tray searchEngine = factory.createTray("Search Engine");
        searchEngine.add(google);
        searchEngine.add(yahoo);
        
        Page page = factory.createPage("Link Page", "Sample");
        page.add(searchEngine);
        page.output();
    }
}
