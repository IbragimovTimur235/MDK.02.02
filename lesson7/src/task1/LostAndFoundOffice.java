package task1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    private ArrayList<Object> things = new ArrayList<>();// создайте список things

    public void put(Object element) {
        things.add(element);
    }// реализуйте метод put()

    public boolean check(Object target) {
        if (target == null) {
            return false;
        }// реализуйте метод check()

        for(Object object :things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
