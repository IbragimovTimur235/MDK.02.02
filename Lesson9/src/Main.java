void main() {
    Cat cat = new Cat();
    cat.catchMouse();
    cat.giveVoice();

    Dog dog = new Dog();
    dog.bringStick();
    dog.play();

    Hamster hamster = new Hamster();
    hamster.hideFood();
    hamster.sleep();

    Fish fish = new Fish();
    fish.sleep();

    Spider spider = new Spider();
    System.out.println("У паука " + spider.getPawsCount() + " лапок.");
}

public abstract class Pet {
    private final String voice;
    private final int pawsCount;

    public Pet(String voice, int pawsCount) {
        this.voice = voice;
        this.pawsCount = pawsCount;
    }
    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public void giveVoice() {
        System.out.println(voice);
    }

    public int getPawsCount() {
        return pawsCount;
    }
}
public class Fish extends Pet {
    public Fish() {
        super("...", 0);
    }
}
public class Spider extends Pet {
    public Spider() {
        super("...", 8);
    }
}
public class Dog extends Pet {
    public Dog() {
        super("Гав", 4);
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
public class Cat extends Pet {
    public Cat() {
        super("Мяу", 4);
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}
public class Hamster extends Pet {
    public Hamster() {
        super("Пи-пи", 4);
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}