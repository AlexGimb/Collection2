import java.util.Objects;
public class Products {
    private String name;
    private double cost;
    private int amount;
    public Products(String name, double cost, int amount) {
        this.name = ValidationUtils.ValidationString(name);
        setCost(cost);
        setAmount(amount);
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = ValidationUtils.ValidationDouble(cost);
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = ValidationUtils.ValidationInt(amount);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.cost, cost) == 0 && amount == products.amount && Objects.equals(name, products.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, cost, amount);
    }
    @Override
    public String toString() {
        return "\n" + name + " - количество:" + amount + ",,  цена:" + cost * amount + " руб.";
    }
}
