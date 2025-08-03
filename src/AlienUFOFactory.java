public class AlienUFOFactory implements UFOFactory {

    @Override
    public UFO createBattlecruiser() {
        return new AlienBattlecruiser();
    }

    @Override
    public UFO createTransport() {
        return new AlienTransport();
    }
}