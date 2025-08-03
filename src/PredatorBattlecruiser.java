public class PredatorBattlecruiser extends UFO {

    public PredatorBattlecruiser(DriveSystem driveSystem, ShieldSystem shieldSystem, WeaponSystem weaponSystem) {
        super(driveSystem, shieldSystem, weaponSystem);
    }

    @Override
    public void displayComponents() {
        System.out.println("Predator Battlecruiser Components:");
        driveSystem.engage();
        shieldSystem.activate();
        weaponSystem.fire();
    }
}