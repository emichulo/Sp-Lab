import java.util.ArrayList;

public class BookStatistics implements Visitor {
    private int paragraphs = 0;
    private int images = 0;
    private int tables = 0;
    private int pag = 0;

    private ArrayList<String> s1 = new ArrayList<>();

    @Override
    public void visitBook(Book b) {
    }
    @Override
    public void visitSection(Section s) {
        ++pag;
        s1.add(s.getTitle());
    }
    @Override
    public void visitTableOfContents(TableOfContents table) {
    }
    @Override
    public void visitParagraph(Paragraph p) {++paragraphs;}
    @Override
    public void visitImageProxy(ImageProxy image) {
        ++images;
    }
    @Override
    public void visitImage(Image img) {
        ++images;
    }
    @Override
    public void visitTable(Table tbl) {
        ++tables;
    }

    public void printStatistics() {
        System.out.println("Visited paragraphs: " + paragraphs);
        System.out.println("Visited images: " + images);
        System.out.println("Visited tables: " + tables);
        for(int i=0;i<pag;i++)
            System.out.println(s1.get(i) + "  ------     pag." + pag);
    }
}