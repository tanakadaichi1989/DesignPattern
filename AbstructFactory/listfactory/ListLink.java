package AbstructFactory.listfactory;
import AbstructFactory.factory.*;

public class ListLink extends Link {
    public ListLink(String caption, String url){
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        return "<li>" + "<a>" + caption + "</a>" + "</li>";
    }
}
