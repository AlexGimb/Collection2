import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Products moloko = new Products ("Молоко", 71.00, 1);
        Products hleb = new Products("Хлеб", 30.00, 2);
        Products myaso = new Products("Мясо", 370.00, 4);
        Products sahar = new Products("Сахар", 55.00, 1);
        Products sol = new Products("Соль", 44.00, 1);
        Products grecha = new Products("Гречка", 52.00, 1);
        Products ris = new Products("Рис", 49.00, 1);
        Products kolbasa = new Products("Колбаса", 170.00, 1);
        Products syr = new Products("Сыр", 89.00, 2);
        Products lapsha = new Products("Лапша", 46.00, 1);

        Basket basket = new Basket();
        basket.addAllBasket(new Products("Пиво",120.00,4),moloko, hleb, myaso, syr, lapsha);
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println(basket.toString());
        System.out.println("------------------------------------------------------------------------------------------");

        basket.buy(moloko, false);
        basket.buy(hleb, true);
        basket.buy(myaso, true);
        basket.buy(syr, true);
        basket.buy(lapsha, true);
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println(basket.toString());
        System.out.println("------------------------------------------------------------------------------------------");
        basket.removeBasket(moloko);
        System.out.println(basket.toString());
    }
}



