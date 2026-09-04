
import java.util.ArrayList;


void main() {


    ArrayList<Integer> speeds; // объявите список
    speeds = new ArrayList<>(6);
            speeds.add(120);
            speeds.add(75);
            speeds.add(42);
            speeds.add(60);
            speeds.add(110);
            speeds.add(20);

            int sum = 0;
            for (int speed : speeds) {
            sum=sum+speed;
            }

            int averageSpeed = sum/6; // вычислите среднюю скорость
            System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
        }
