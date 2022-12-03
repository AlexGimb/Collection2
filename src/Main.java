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
        Products lap = new Products("Лапша", 46.00, 2);

        Basket basket = new Basket();
        basket.addAllBasket(new Products("Пиво",120.00,4),moloko, hleb, myaso, syr, lapsha,lap);
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
        basket.clear();
        System.out.println(basket.toString());
        System.out.println("------------------------------------------------------------------------------------------");

        Recipe buter = new Recipe("Бутерброд", hleb, kolbasa, syr);
        Recipe grechaPoKupecheski = new Recipe("Гречка по Купечески",
                new Products("Чеснок", 10.00, 1),
                new Products("Перец молотый", 25.00, 1),
                new Products("Лук", 15.00, 1),
                grecha, myaso, sol);
        Recipe butrik = new Recipe("Бутерброд", hleb, kolbasa, syr);

        Recipe.allInfo(butrik);
        Recipe.allInfo(buter);
        Recipe.allInfo(grechaPoKupecheski);

        Recipe.addAllRecipe(butrik,grechaPoKupecheski);

        System.out.println("В книге рецептов: \n" + Recipe.recipes.toString());
        System.out.println("------------------------------------------------------------------------------------------");
        SetOfInteger.addInt();
        SetOfInteger.removeInt();
        System.out.println("------------------------------------------------------------------------------------------");
        MultiplicationTable.multiTable();
        System.out.println("------------------------------------------------------------------------------------------");
        new Passport(1234567890, "Громов", "Василий", "Петрович", new Passport.DateOfBirth(1981, 07, 18));
        new Passport(1987654321, "Туров", "Петр", "Викторович", new Passport.DateOfBirth(1987, 03, 07));
        new Passport(1582734901, "Хромов", "Игорь", "Семенов", new Passport.DateOfBirth(1996, 11, 12));
        System.out.println(Passport.passports);
        Passport.search(1234567890);
    }



}



