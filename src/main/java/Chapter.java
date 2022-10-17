import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subchp) {
        SubChapter subchapter = new SubChapter(subchp);
        subChapterList.add(subchapter);

        return subChapterList.indexOf(subchapter);
    }

    public SubChapter getSubChapter(int subchapter) {
        return new SubChapter("Subcapitolul" + name +"." + subchapter);
    }

    public void print() {

    }
}
