import javax.inject.Inject;

public class PredatorUFOFactory implements UFOFactory {

    private DriveSystem driveSystem;
    private ShieldSystem shieldSystem;
    private WeaponSystem weaponSystem;

    @Inject
    public PredatorUFOFactory(DriveSystem driveSystem, ShieldSystem shieldSystem, WeaponSystem weaponSystem) {
        this.driveSystem = driveSystem;
        this.shieldSystem = shieldSystem;
        this.weaponSystem = weaponSystem;
    }

    @Override
    public UFO createBattlecruiser() {
        return new PredatorBattlecruiser(driveSystem, shieldSystem, weaponSystem);
    }

    @Override
    public UFO createTransport() {
        return new PredatorTransport(driveSystem, shieldSystem);
    }
}