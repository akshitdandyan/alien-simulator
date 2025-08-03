public class PredatorTransport extends UFO {

    public PredatorTransport() {
        super(new WarpDrive(), new MetaphaseShield());
    }

    @Override
    public void displayComponents() {
        System.out.println("Predator Transport Components:");
        driveSystem.engage();
        shieldSystem.activate();
    }
}