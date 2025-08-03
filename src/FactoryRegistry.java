import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {

    private static Map<String, PredatorUFOFactory> registry = new HashMap<>();

    public static void register(String name, PredatorUFOFactory factory) {
        registry.put(name, factory);
    }

    public static PredatorUFOFactory get(String name) {
        return registry.get(name);
    }
}