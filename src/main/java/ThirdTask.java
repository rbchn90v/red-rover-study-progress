import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        String str = ("А роза упала на лапу Азора").toLowerCase();
        String strNew = str.replace(" ", "");
        char[] array = strNew.toCharArray();
        System.out.println(Arrays.toString(array));
        int one = 0;
        int two = strNew.length() - 1;
        while (one < two) {
            if (array[one] != array[two]) {
                System.out.println("false");
            }
            one++;
            two--;
        }
        System.out.println("true");
    }
}
//Условие задачи
//Проверить, является ли фраза палиндромом

//Входные данные:А роза упала на лапу Азора

//true