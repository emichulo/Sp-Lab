import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> imageList;
    private List<Paragraph> paragraphList;
    private List<Table> tableList;

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewImage(String img) {
        Image image = new Image(img);
        imageList.add(image);
    }

    public void createNewParagraph(String prg) {
        Paragraph paragraph = new Paragraph(prg);
        paragraphList.add(paragraph);
    }

    public void createNewTable(String tbl) {
        Table table = new Table(tbl);
        tableList.add(table);
    }

    public void print() {
        System.out.println("Subchapter:" + name +
                "\nImage with name: " + imageList +
                "\nParagraph: " + paragraphList +
                "\nTable with Title: " + tableList);
    }
}
