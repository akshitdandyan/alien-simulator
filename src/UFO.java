public abstract class UFO {

    protected DriveSystem driveSystem;
    protected ShieldSystem shieldSystem;
    protected WeaponSystem weaponSystem;

    public UFO(DriveSystem driveSystem, ShieldSystem shieldSystem) {
        this.driveSystem = driveSystem;
        this.shieldSystem = shieldSystem;
    }

    public UFO(DriveSystem driveSystem, ShieldSystem shieldSystem, WeaponSystem weaponSystem) {
        this.driveSystem = driveSystem;
        this.shieldSystem = shieldSystem;
        this.weaponSystem = weaponSystem;
    }

    public abstract void displayComponents();
}