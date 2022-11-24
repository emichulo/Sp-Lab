import java.util.ArrayList;

public class Manager implements Element{
    private String nume;
    private float sal;
    private ArrayList<Element> l1 = new ArrayList<>();

    public Manager(String nume, float sal) {
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
        vis.visitManager(this);
        for(Element el : l1)
            el.accept(vis);
    }
}
