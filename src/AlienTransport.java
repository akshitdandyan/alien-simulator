public class AlienTransport extends UFO {

    public AlienTransport(DriveSystem driveSystem, ShieldSystem shieldSystem) {
        super(driveSystem, shieldSystem);
    }

    @Override
    public void displayComponents() {
        System.out.println("Alien Transport Components:");
        driveSystem.engage();
        shieldSystem.activate();
    }
}