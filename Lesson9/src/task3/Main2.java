import task3.LandlinePhone;
import task3.MobilePhone;
import task3.Phone;
import task3.Smartphone;

void main() {

    System.out.println("Вас приветствует виртуальная АТС!");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите ваш номер телефона:");
    String number = scanner.next();
    System.out.println("Введите номер пользователя, которому хотите позвонить:");
    String friendNumber = scanner.next();
    System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
    int type = scanner.nextInt();
    Smartphone smartphone = new Smartphone(number);
    MobilePhone mobilePhone = new MobilePhone(number);
    if (type < 1 || type > 3) {
        System.out.println("Введена неверная модель телефона");
        return;
    }
    if (type>1){
        System.out.println("вы хотите позвонить - 1 или отправить смс - 2 ?");
            switch (scanner.nextInt()){
                case 1:
                    if(type == 2)
                    getPhone(type, number).makeCall(friendNumber);
                    else {
                        System.out.println("позвонить через приложение - 1 или по сотовой связи - 2 ?");
                        switch (scanner.nextInt()){
                            case 1:
                                System.out.println("введите название преложения:");
                                smartphone.makeCall(number,scanner.nextLine());
                                break;
                            case 2:
                                getPhone(type, number).makeCall(friendNumber);
                                break;
                            default:
                                System.out.println("вы ввели неверные данные");
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Введите сообщение:");
                    String massage = scanner.nextLine();
                    if(type == 2)
                        mobilePhone.sendSms(number,massage);
                    else {
                        System.out.println("написать E-mail - 1 или смс - 2 ?");
                        switch (scanner.nextInt()){
                            case 1:
                                scanner.nextLine();
                                System.out.println("введите E-mail");
                                smartphone.sendEmail(scanner.nextLine(), massage);
                                break;
                            case 2:
                                smartphone.sendSms(number,massage);
                                break;
                            default:
                                System.out.println("вы ввели неверные данные");
                        }
                    }
                    break;
                default:
                    System.out.println("вы ввели неверные данные");
            }
    }
    else
        getPhone(type, number).makeCall(friendNumber);
}
public static Phone getPhone(int type, String number) {
    if (type == 1) {
        return new LandlinePhone(number);
    } else if (type == 2) {
        return new MobilePhone(number);
    } else {
        return new Smartphone(number);
    }
}