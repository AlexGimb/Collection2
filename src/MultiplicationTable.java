import java.util.*;

public class MultiplicationTable {
    static List<MultiplicationTable> table = new ArrayList<MultiplicationTable>();
    public int first;
    public int second;

    public MultiplicationTable(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void multiTable() {
        for (int first = 1; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                table.add(new MultiplicationTable(first, second));
            }
        }
        Collections.shuffle(table);
        List<MultiplicationTable> chosenPairs = table.subList(0, 15);
        System.out.println(chosenPairs.toString().replace("[", "").replace("]", "").replace(", ", ""));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return first + " * " + second + " = \n";
    }
}
