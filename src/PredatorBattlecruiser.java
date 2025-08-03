public class PredatorBattlecruiser extends UFO {

    public PredatorBattlecruiser() {
        super(new WarpDrive(), new MetaphaseShield(), new LaserCannon());
    }

    @Override
    public void displayComponents() {
        System.out.println("Predator Battlecruiser Components:");
        driveSystem.engage();
        shieldSystem.activate();
        weaponSystem.fire();
    }
}