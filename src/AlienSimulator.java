import aliens_3rdparty.AlienFromNY;
import aliens_3rdparty.NeutralBesuchen;
import aliens_3rdparty.ZerstoererischBesuchen;

public class AlienSimulator {

    public static void main(String[] args) {
        System.out.println("=== Alien Simulator - Task 03 (Adapter Pattern) ===\n");

        System.out.println("=== Original Aliens ===");
        Alien marsAlien = new MarsAlien();
        Alien moonAlien = new MoonAlien();
        Alien venusAlien = new VenusAlien();

        marsAlien.display();
        marsAlien.performVisit();
        System.out.println();

        moonAlien.display();
        moonAlien.performVisit();
        System.out.println();

        venusAlien.display();
        venusAlien.performVisit();
        System.out.println();

        System.out.println("=== Third-Party Alien with Adapters ===");
        AlienFromNY alienFromNY = new AlienFromNY();
        Alien adaptedAlien = new AlienAdapter(alienFromNY);

        adaptedAlien.display();
        adaptedAlien.fly();
        adaptedAlien.setVisitBehavior(new NeutralVisitAdapter(new NeutralBesuchen()));
        adaptedAlien.performVisit();
        System.out.println();

        System.out.println("=== Changing Third-Party Alien Behavior ===");
        adaptedAlien.setVisitBehavior(new AggressiveVisitAdapter(new ZerstoererischBesuchen())); // ZerstoererischBesuchen
                                                                                                 // english: destructive
                                                                                                 // visit
        adaptedAlien.performVisit();
        System.out.println();

        System.out.println("=== Using Third-Party Behaviors with Original Aliens ===");
        marsAlien.setVisitBehavior(new NeutralVisitAdapter(new NeutralBesuchen())); // NeutralBesuchen english: neutral
                                                                                    // visit
        marsAlien.performVisit();
        System.out.println();

        moonAlien.setVisitBehavior(new AggressiveVisitAdapter(new ZerstoererischBesuchen())); // ZerstoererischBesuchen
                                                                                              // english: destructive
                                                                                              // visit
        moonAlien.performVisit();
    }
}