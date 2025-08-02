public class MarsAlien extends Alien {

    public MarsAlien() {
        setVisitBehavior(new AggressiveVisit());
    }

    @Override
    public void display() {
        System.out.println("I am a Mars Alien");
    }
}