public class PredatorTransport extends UFO {

    public PredatorTransport(DriveSystem driveSystem, ShieldSystem shieldSystem) {
        super(driveSystem, shieldSystem);
    }

    @Override
    public void displayComponents() {
        System.out.println("Predator Transport Components:");
        driveSystem.engage();
        shieldSystem.activate();
    }
}