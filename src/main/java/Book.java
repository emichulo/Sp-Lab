import java.util.*;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapterList;


    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        this.author = author;
    }

    public int createChapter(String chapter) {
        Chapter chp = new Chapter(chapter);
        chapterList.add(chp);

        return chapterList.indexOf(chp);
    }

    public Chapter getChapter(int chapter) {
        return new Chapter("Capitolul" + chapter);
    }

    public void print() {
        System.out.println("Titlul cartii este " + title);
    }
}
