public class MoonAlien extends Alien {

    public MoonAlien() {
        setVisitBehavior(new FriendlyVisit());
    }

    @Override
    public void display() {
        System.out.println("I am a Moon Alien");
    }
}