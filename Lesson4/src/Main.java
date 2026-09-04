
import java.util.HashMap;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

            HashMap<String, Double> orders = new HashMap<>();
            orders.put("Иван И.", 4345.5);
            orders.put("Ольга С.", 76564.43);
            orders.put("Александр Т.", 1234.86);
            orders.put("Александр Р.", 23432.87);
            orders.put("Екатерина О.", 1034753.6);
            orders.put("Ярослав В.", 450.0);

        double sum=0;// объявите переменную, где будет сохранена общая сумма
            for (Double price: orders.values()) { // пройдитесь в цикле по значениям
            sum+=price;
            }

            System.out.println("Всего было совершено заказов на сумму: " + sum);
        }


