public class AlienFactory {

    public Alien createAlien(String type) {
        if (type.equals("mars")) {
            return new MarsAlien();
        } else if (type.equals("moon")) {
            return new MoonAlien();
        } else if (type.equals("venus")) {
            return new VenusAlien();
        } else {
            throw new IllegalArgumentException("Unknown alien type: " + type);
        }
    }
}
