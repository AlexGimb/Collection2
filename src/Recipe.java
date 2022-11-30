import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String nameRecipe;
    private double price;
    Products[] products;
    public static Set<Recipe> recipes = new HashSet<>();

    public Recipe(String nameRecipe, Products... products) {
        this.nameRecipe = ValidationUtils.ValidationString(nameRecipe,"Такой рецепт уже есть");
        this.products = products;
    }
    public static void addAllRecipe(Recipe... recipes) {
        for (Recipe recipe : recipes) {
            addRecipe(recipe);
        }
    }
    public static void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        } else {
            recipes.add(recipe);
            System.out.println(recipe.getNameRecipe() + " добавлен(о) в книгу рецептов");
        }
    }

    public static void allInfo(Recipe recipe) {
        System.out.println("Рецепт: " + recipe+"\nИнгридиенты:");
        double prices = 0;
        for (Products product : recipe.products) {
            prices+=product.getCost()*product.getAmount();
            System.out.print(product.getName() + " - " + product.getAmount() + " шт" + "\n");
        }
        System.out.println("Цена: "+prices+" руб.");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public String getNameRecipe() {
        return nameRecipe;
    }
    public double getPrice() {
        return price;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.price, price) == 0 && Objects.equals(nameRecipe, recipe.nameRecipe) && Arrays.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameRecipe, price);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return nameRecipe;
    }
}

