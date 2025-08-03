public class AlienBattlecruiser extends UFO {

    public AlienBattlecruiser() {
        super(new Hyperdrive(), new Shield(), new PhaserCannon());
    }

    @Override
    public void displayComponents() {
        System.out.println("Alien Battlecruiser Components:");
        driveSystem.engage();
        shieldSystem.activate();
        weaponSystem.fire();
    }
}