public class AlienBattlecruiser extends UFO {

    public AlienBattlecruiser(DriveSystem driveSystem, ShieldSystem shieldSystem, WeaponSystem weaponSystem) {
        super(driveSystem, shieldSystem, weaponSystem);
    }

    @Override
    public void displayComponents() {
        System.out.println("Alien Battlecruiser Components:");
        driveSystem.engage();
        shieldSystem.activate();
        weaponSystem.fire();
    }
}