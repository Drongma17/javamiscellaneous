import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        // Using compute to update the value for a key
        map.compute("one", (key, value) -> value + 10);

        // Using computeIfAbsent to add a value if the key is absent
        map.computeIfAbsent("three", key -> 3);

        // Using computeIfPresent to update the value only if the key is present
        map.computeIfPresent("two", (key, value) -> value * 2);

        System.out.println(map); // Output: {one=11, two=4, three=3}
    }
}
