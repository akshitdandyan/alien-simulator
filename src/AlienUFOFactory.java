public class AlienUFOFactory implements UFOFactory {

    private DriveSystem driveSystem;
    private ShieldSystem shieldSystem;
    private WeaponSystem weaponSystem;

    public AlienUFOFactory(DriveSystem driveSystem, ShieldSystem shieldSystem, WeaponSystem weaponSystem) {
        this.driveSystem = driveSystem;
        this.shieldSystem = shieldSystem;
        this.weaponSystem = weaponSystem;
    }

    @Override
    public UFO createBattlecruiser() {
        return new AlienBattlecruiser(driveSystem, shieldSystem, weaponSystem);
    }

    @Override
    public UFO createTransport() {
        return new AlienTransport(driveSystem, shieldSystem);
    }
}