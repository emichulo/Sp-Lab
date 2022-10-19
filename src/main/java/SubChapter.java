import java.util.ArrayList;
import java.util.List;

public class SubChapter implements Element{
    private String name;

    List<Element> e1 = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewImage(String img) {
        Image image = new Image(img);
        e1.add(image);
    }

    public void createNewParagraph(String prg) {
        Paragraph paragraph = new Paragraph(prg);
        e1.add(paragraph);
    }

    public void createNewTable(String tbl) {
        Table table = new Table(tbl);
        e1.add(table);
    }

    public void print() {
        System.out.println(name);
        for (Element e:e1) {
            e.print();

        }
    }
}
