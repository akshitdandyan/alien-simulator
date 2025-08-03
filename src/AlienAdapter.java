import aliens_3rdparty.AlienFromNY;

public class AlienAdapter extends Alien {

    private AlienFromNY adaptee;
    private VisitBehavior visitBehavior;

    public AlienAdapter(AlienFromNY adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void fly() {
        adaptee.fly();
    }

    @Override
    public void display() {
        adaptee.show();
    }

    @Override
    public void performVisit() {
        visitBehavior.visitEarth();
    }

    @Override
    public void setVisitBehavior(VisitBehavior visitBehavior) {
        this.visitBehavior = visitBehavior;
    }
}