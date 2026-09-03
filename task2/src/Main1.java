import static java.lang.Math.min;

void main() {
    String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
    String beefKcal = "30.2"; // калорийность говядины
    String chickenKcal = "23.8"; // калорийность курицы
    String creamKcal = "32.1"; // калорийность сливок
    String milkKcal = "13.5"; // калорийность молока

    float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
    float totalKcal = Integer.parseInt(pixelKcalDay) + pixelChoice;
    checkKcal(totalKcal);
}

private static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesert, String secondDesert) {
    float firstDishKcalFloat = Float.parseFloat(firstDishKcal);
    float secondDishKcalFloat = Float.parseFloat(secondDishKcal);
    float minDishKcal = min(firstDishKcalFloat, secondDishKcalFloat); // вычислите минимальную калорийность основного блюда

    float firstDesertFloat = Float.parseFloat(firstDesert);
    float secondDesertFloat = Float.parseFloat(secondDesert);
    float minDesertKcal = min(firstDesertFloat, secondDesertFloat); // вычислите минимальную калорийность десерта
    return minDishKcal + minDesertKcal;
}

private static void checkKcal(Float catKcal) {
    if (catKcal == null) {
        System.out.println("Что-то пошло не так");
    } else {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
}