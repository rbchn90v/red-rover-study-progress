public class FirstTask {
    public static void main(String[] args) {
        power2(1024);
    }

    public static void power2(int num) {
        if ((num > 0) && (num & (num - 1)) == 0) {

            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
//Условие задачи
//Написать код, который принимает число и выдает true,
//если число является степенью двойки и false - если нет

//Входные данные: 2, 256, 300, 500, 1024

//Ожидаемый результат: true, true, false, false, true