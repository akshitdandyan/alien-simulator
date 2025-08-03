public class PredatorUFOFactory implements UFOFactory {

    @Override
    public UFO createBattlecruiser() {
        return new PredatorBattlecruiser();
    }

    @Override
    public UFO createTransport() {
        return new PredatorTransport();
    }
}