public class AlienTransport extends UFO {

    public AlienTransport() {
        super(new Hyperdrive(), new Shield());
    }

    @Override
    public void displayComponents() {
        System.out.println("Alien Transport Components:");
        driveSystem.engage();
        shieldSystem.activate();
    }
}