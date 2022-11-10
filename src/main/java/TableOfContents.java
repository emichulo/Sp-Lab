public class TableOfContents implements Element{
    private String something;

    public TableOfContents(String Something){
        this.something = Something;
    }

    @Override
    public void print() {
        System.out.println(something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}
