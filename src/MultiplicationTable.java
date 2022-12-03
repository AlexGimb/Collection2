import java.util.*;

public class MultiplicationTable {
    private final static Set<MultiplicationTable> table = new HashSet<>();
    private  int first;
    private int second;

    public MultiplicationTable(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void multiTable() {
        Random random = new Random();
        while (table.size() < 20) {
            table.add(new MultiplicationTable(random.nextInt(9), random.nextInt(9)));
        }
        System.out.println(table.toString().replace("[", "").replace("]", "").replace(", ", ""));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return (first == that.first && second == that.second)||
                (first==that.second && second==that.first);

    }

    @Override
    public int hashCode() {
        return Objects.hash(first * second, first + second);
    }

    @Override
    public String toString() {
        return first + " * " + second + " = \n";
    }
}
