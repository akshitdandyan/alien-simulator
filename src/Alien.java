public abstract class Alien {

    private VisitBehavior visitBehavior;

    public void fly() {
        System.out.println("Alien is flying");
    }

    public abstract void display();

    public void performVisit() {
        visitBehavior.visitEarth();
    }

    public void setVisitBehavior(VisitBehavior visitBehavior) {
        this.visitBehavior = visitBehavior;
    }
}