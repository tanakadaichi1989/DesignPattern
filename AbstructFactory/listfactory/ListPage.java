package AbstructFactory.listfactory;
import AbstructFactory.factory.*;
import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String makeHTML() {
        // TODO Auto-generated method stub
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><body><title>" + title + "</title></head>¥n");
        buffer.append("<body>¥n");
        buffer.append("<h1>" + title + "</h1>");
        buffer.append("<ul>¥n");
        Iterator it = content.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>¥n");
        buffer.append("<p>" + author + "</p>¥n");
        buffer.append("</body></html>¥n");
        return buffer.toString();
    }
}
