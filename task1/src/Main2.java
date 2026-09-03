void main() {
    Scanner in = new Scanner(System.in);
    int eggs = Integer.parseInt(in.nextLine());
    if (eggs > 3) System.out.print("Рекомендую приготовить омлет.");
    else System.out.print("Рекомендую позавтракать бутербродами.");
    System.out.print("\nПриятного аппетита!");
}