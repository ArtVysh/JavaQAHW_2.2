public class Main {
    public static void main(String[] args) {
        int initialAccount = 123; // Начальный счет
        int refillAccount = 1234; // Пополнение счета
        int refillBonus; // Расчетная величина бонуса
        if (refillAccount >= 1000) { //если пополнение больше или равно 1000 рублей,
            refillBonus = refillAccount / 100; // то бонус составляет 1 рубль за каждые 100 рублей пополнения
        } else {
            refillBonus = 0; // иначе бонус равен 0
        }
        int totalAccount = initialAccount + refillAccount + refillBonus; // Итоговый счет
        System.out.println("Начальный счет составляет " + initialAccount + " рублей");
        System.out.println("Внесено средств: " + refillAccount + " рублей");
        System.out.println("Бонус составил " + refillBonus + " рублей");
        System.out.println("Итоговый счет равен " + totalAccount + " рублей");
    }
}