public class Main {
    public static void main(String[] args) {
        // Входные данные
        int initialAccount = 400; // начальный счёт
        int depositAmount = 1230; // Сумма пополнения
        // Логика программы
        int bonus; // бонус рублей
        if (depositAmount < 1000) {
            bonus = 0;
        } else {
            bonus = depositAmount / 100;
        }
        int totalAccount = initialAccount + depositAmount + bonus; // Количество денег на текущем счёте клиента
        System.out.println("Количество бонусный рублей: " + bonus);
        System.out.println("Количество денег на текущем счёте клиента: " + totalAccount);
    }
}