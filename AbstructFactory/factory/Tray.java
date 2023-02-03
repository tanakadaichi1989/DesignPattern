package AbstructFactory.factory;
import java.util.*;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList<>();

    public Tray(String caption){
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
