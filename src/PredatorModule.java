import com.google.inject.AbstractModule;

public class PredatorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DriveSystem.class).to(WarpDrive.class);
        bind(ShieldSystem.class).to(MetaphaseShield.class);
        bind(WeaponSystem.class).to(LaserCannon.class);
    }
}