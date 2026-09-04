import java.util.ArrayList;
void main() {
    ArrayList<String> animals = new ArrayList<>(5);
    animals.add("Шиншилла");
    animals.add("Крокодил");
    animals.add("Лев");
    animals.add("Медведь");
    animals.add("Слон");

    ArrayList<String> ktime = new ArrayList<>(5);
    ktime.add("В 9:00 - "+ animals.get(1));
    ktime.add("В 10:00 -"+ animals.get(4));
    ktime.add("В 11:00 - "+ animals.get(0));
    ktime.add("В 12:00 - "+ animals.get(2));
    ktime.add("В 13:00 - "+ animals.get(3));
    System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
    for (String animal : animals){
        System.out.println(animal);
    }
    System.out.println("Расписание кормлений:");
    for (String time : ktime){
        System.out.println(time);
    }
}