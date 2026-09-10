void main() {
    System.out.println("Готовим основу:");
    SoupBase soupBase = new SoupBase(2, 5);
    soupBase.printIngredients();

    System.out.println("\nИз основы приготовим вегетарианский суп и бульон:");
    Bouillon bouillon = new Bouillon(soupBase, 300);
    bouillon.printIngredients();
    VegetarianSoup vegetarianSoup = new VegetarianSoup(soupBase, 200);
    vegetarianSoup.printIngredients();

    System.out.println("\nПриготовим вегетарианский суп с нуля");
    VegetarianSoup vegetarianSoupWithoutBase = new VegetarianSoup(1.5, 5, 200);
    vegetarianSoupWithoutBase.printIngredients();

    System.out.println("\nПриготовим другой бульон для картофельного супа:");
    Bouillon anotherBouillon = new Bouillon(5, 10, 800);
    anotherBouillon.printIngredients();

    System.out.println("\nИз этого бульона приготовим суп с картошкой:");
    PotatoSoup potatoSoup = new PotatoSoup(anotherBouillon, 4, 1);
    potatoSoup.printIngredients();

    System.out.println("\nСуп с картошкой можно приготовить и из суповой основы:");
    PotatoSoup potatoSoupFromBase = new PotatoSoup(soupBase, 200, 3, 0);
    potatoSoupFromBase.printIngredients();

    System.out.println("\nА можно и совсем с нуля:");
    PotatoSoup totallyNewPotatoSoup = new PotatoSoup(5, 10, 400, 5, 1);
    totallyNewPotatoSoup.printIngredients();
}
public class SoupBase {
    double water;

    public SoupBase( double water,double salt) {
        this.salt = salt;
        this.water = water;
    }

    double salt;

    // реализуйте конструктор

    public void printIngredients() {
        System.out.println("Ингредиенты суповой основы:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
    }
}
public class Bouillon extends SoupBase {
    public Bouillon(SoupBase b, double meat) {
        super(b.water, b.salt);
        this.meat = meat;
    }
    public Bouillon(double water, double salt, double meat) {
        super(water, salt);
        this.meat = meat;
    }

    double meat;

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты бульона:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
    }
}
public class VegetarianSoup extends SoupBase {
    public VegetarianSoup(SoupBase b, double vegetables) {
        super(b.water, b.salt);
        this.vegetables = vegetables;
    }
    public VegetarianSoup(double water, double salt, double vegetables) {
        super(water, salt);
        this.vegetables = vegetables;
    }

    double vegetables;

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}
public class PotatoSoup extends Bouillon {
    double potato;
    double carrot;

    public PotatoSoup(Bouillon bouillon, double potato, double carrot) {
        super(bouillon.water, bouillon.salt, bouillon.meat);
        this.potato = potato;
        this.carrot = carrot;
    }
    public PotatoSoup(SoupBase soupBase, double meat, double potato, double carrot) {
        super(soupBase.water, soupBase.salt, meat);
        this.potato = potato;
        this.carrot = carrot;
    }
    public PotatoSoup(double water, double salt, double meat, double potato, double carrot) {
        super(water, salt, meat);
        this.potato = potato;
        this.carrot = carrot;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты картофельного супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
        System.out.println("Картошка: " + potato + " шт.");
        System.out.println("Морковка: " + carrot + " шт.");
    }
}