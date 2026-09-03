void main() {
    Scanner in = new Scanner(System.in);
    String weather = in.nextLine();
    if (weather.equals("Дождь")) System.out.print("Беру с собой зонт");
    else System.out.print("Иду на легке");
    System.out.print("\nЛюблю гулять!");
}