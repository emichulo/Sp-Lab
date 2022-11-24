import java.util.ArrayList;

public class Programator implements Element{
    private String nume;
    private float sal;
    private ArrayList<Element> l1 = new ArrayList<>();

    public Programator(String nume, float sal) {
        this.nume = nume;
        this.sal = sal;
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

    public float getSal() {
        return sal;
    }

    @Override
    public void accept(Visitor vis) {
        vis.visitProgramator(this);
        for(Element el : l1)
            el.accept(vis);
    }
}
