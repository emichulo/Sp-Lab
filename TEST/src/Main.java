public class Main {
    public static void main(String[] args) {
        Firma f1 = new Firma("Nokia");
        Departament d = new Departament("5G");
        d.add(new Manager("Sefu", 40000));
        d.add(new Programator("Emi",15000));
        d.add(new Programator("David", 10000));
        d.add(new Tester("Jon",15000));
        f1.add(d);

        CalculSal cs1 = new CalculSal();
        f1.accept(cs1);
        cs1.print();

    }
}