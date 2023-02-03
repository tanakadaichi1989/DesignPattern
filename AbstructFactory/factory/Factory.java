package AbstructFactory.factory;

import AbstructFactory.listfactory.ListFactory;

public abstract class Factory {
    public static Factory getFactory(){
        Factory factory = null;
        try {
            factory = new ListFactory();
        }  catch(Exception e){
            e.printStackTrace();;
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
