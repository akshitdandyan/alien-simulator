public class AlienSimulator {

    public static void main(String[] args) {
        System.out.println("=== Alien Simulator - Task 02 ===\n");

        Alien marsAlien = new MarsAlien();
        Alien moonAlien = new MoonAlien();
        Alien venusAlien = new VenusAlien();

        System.out.println("=== Initial Behavior ===");
        marsAlien.display();
        marsAlien.performVisit();
        System.out.println();

        moonAlien.display();
        moonAlien.performVisit();
        System.out.println();

        venusAlien.display();
        venusAlien.performVisit();
        System.out.println();

        System.out.println("=== Changing Behavior After Landing ===");
        System.out.println("Mars Alien changes to friendly:");
        marsAlien.setVisitBehavior(new FriendlyVisit());
        marsAlien.performVisit();
        System.out.println();

        System.out.println("Moon Alien changes to aggressive:");
        moonAlien.setVisitBehavior(new AggressiveVisit());
        moonAlien.performVisit();
        System.out.println();

        System.out.println("Venus Alien changes to aggressive:");
        venusAlien.setVisitBehavior(new AggressiveVisit());
        venusAlien.performVisit();
    }
}