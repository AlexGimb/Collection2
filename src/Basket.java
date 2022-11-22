import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Basket {
    Set<Products> basket = new HashSet<>();
    public void addAllBasket(Products... products) {
        for (Products product : products) {
            addBasket(product);
        }
    }
    public void addBasket(Products products) {
        basket.add(products);
        System.out.println(products.getName() + " добавлен(о) в корзину");
    }
    public boolean buy(Products products, boolean buy) {
        if (buy == true) {
            basket.remove(products);
            System.out.println(products.getName() + " оплачен(о) и удален из корзины");
        } else {
            System.out.println(products.getName() + "  не оплачен(о)");
        }
        return buy;
    }

    public void removeBasket(Products products) {
        basket.remove(products);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket1 = (Basket) o;
        return Objects.equals(basket, basket1.basket);
    }
    @Override
    public int hashCode() {
        return Objects.hash(basket);
    }

    @Override
    public String toString() {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            return String.format("В корзине: " + Arrays.toString(basket.toArray()).replace("[", "").replace("]", "").replace(", ", ""));
        }
        return String.format("------------------------------------------------------------------------------------------");
    }
}
