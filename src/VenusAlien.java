public class VenusAlien extends Alien {

    public VenusAlien() {
        setVisitBehavior(new FriendlyVisit());
    }

    @Override
    public void display() {
        System.out.println("I am a Venus Alien");
    }
}