import java.util.ArrayList;
public class Firma implements Element{
    private String nume;
    private ArrayList<Element> l1 = new ArrayList<>();

    public Firma(String nume) {
        this.nume = nume;
    }

    @Override
    public void add(Element elm) {
        l1.add(elm);
    }

    @Override
    public void remove(Element elm) {

    }

    @Override
    public void print() {
        System.out.println(this.nume);
    }

    @Override
    public void accept(Visitor vis) {
        vis.visitFirma(this);
        for(Element el : l1)
            el.accept(vis);
    }
}
