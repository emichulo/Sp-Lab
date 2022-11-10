import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> authors;

    public Book(String Title){
        super(Title);
        this.authors = new ArrayList<>();
    }

    public Book(String Title, Author Author){
        super(Title);
        this.authors.add(Author);
    }

    public void print(){
        System.out.println("Authors: ");
        for(Author i : authors){
            i.print();
        }
        System.out.println();
        super.print();
    }

    public void addAuthor(Author newAuthor){
        authors.add(newAuthor);
    }

    public void addContent(Element element){
        super.add(element);
    }
}
