import aliens_3rdparty.NeutralBesuchen;

public class NeutralVisitAdapter implements VisitBehavior {

    private NeutralBesuchen adaptee;

    public NeutralVisitAdapter(NeutralBesuchen adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void visitEarth() {
        adaptee.abwarten();
    }
}