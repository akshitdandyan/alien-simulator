public class PredatorFactory {

    public Predator createPredator(String type) {
        if (type.equals("hishquten")) {
            return new HishQuTen();
        } else if (type.equals("yautja")) {
            return new Yautja();
        } else {
            throw new IllegalArgumentException("Unknown predator type: " + type);
        }
    }
}
