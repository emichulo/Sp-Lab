public class CalculSal implements Visitor{
    private float TotalSal = 0;
    private float ProgSal = 0;
    private float TesterSal = 0;
    private float ManagerSal = 0;

    @Override
    public void visitFirma(Firma f) {

    }

    @Override
    public void visitDepartament(Departament d) {

    }

    @Override
    public void visitManager(Manager m) {
        ManagerSal = ManagerSal + m.getSal();
    }

    @Override
    public void visitTester(Tester t) {
        TesterSal = TesterSal + t.getSal();
    }

    @Override
    public void visitProgramator(Programator p) {
        ProgSal = ProgSal + p.getSal();
    }

    void print(){
        System.out.println("Suma salariilor pentru Manager: " + ManagerSal);
        System.out.println("Suma salariilor pentru Programator: " + ProgSal);
        System.out.println("Suma salariilor pentru Tester: " + TesterSal);

        float salAll = 0;
        salAll = ManagerSal + ProgSal + TesterSal;
        System.out.println("Suma salariilor pentru toata firma: " + salAll);

    }
}
