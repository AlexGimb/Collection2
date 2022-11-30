import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    static Set<Integer> integers = new HashSet<>();

    public static void addInt() {
        Random random = new Random();
        int counter = 0;
        while (counter < 20) {
            if (integers.add(random.nextInt(1000))) {
                counter++;
            }
        }
        System.out.println(integers.toString());
    }

    public static void removeInt() {
        integers.removeIf(integer -> integer % 2 != 0);
        System.out.println(integers.toString());
    }
}
