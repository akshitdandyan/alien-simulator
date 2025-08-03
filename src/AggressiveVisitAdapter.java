import aliens_3rdparty.ZerstoererischBesuchen;

public class AggressiveVisitAdapter implements VisitBehavior {

    private ZerstoererischBesuchen adaptee;

    public AggressiveVisitAdapter(ZerstoererischBesuchen adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void visitEarth() {
        adaptee.zerstoere();
    }
}