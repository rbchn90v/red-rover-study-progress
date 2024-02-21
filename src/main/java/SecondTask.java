import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int rez1 = Math.max(a, b);
        int rez2 = Math.max(c, d);
        int max = (Math.max(rez1, rez2));
        System.out.println(max);
    }
}

//Условие задачи
//Даны 4 числа, надо найти наибольшее.
//if использовать нельзя, код должен быть не больше 10 строк

//Входные данные:2, 4, 5, 3

//Ожидаемый результат: 5