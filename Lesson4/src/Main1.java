void main() {
    ArrayList<Integer> january = new ArrayList<>(2);
    january.add(1);
    january.add(7);
    ArrayList<Integer> february = new ArrayList<>(2);
    february.add(23);
    ArrayList<Integer> march = new ArrayList<>(2);
    march.add(8);
    ArrayList<Integer> may = new ArrayList<>(2);
    may.add(1);
    may.add(8);
    ArrayList<Integer> june = new ArrayList<>(2);
    june.add(12);
    ArrayList<Integer> november = new ArrayList<>(2);
    november.add(4);

    HashMap<String, List> stateHolidays= new HashMap<>(6);
    stateHolidays.put("Январь ", january);
    stateHolidays.put("Февраль ", february);
    stateHolidays.put("Март ", march);
    stateHolidays.put("Май ", may);
    stateHolidays.put("Июнь ", june);
    stateHolidays.put("Ноябрь ", november);
    System.out.println(stateHolidays);
}