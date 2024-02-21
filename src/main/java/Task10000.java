import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10000 {
    public static void main(String[] args) {
        //Вывести 10_000 раз какую-либо строку без использования циклов

        String str = "Интересная задача";
        List<String> list = new ArrayList<>(Collections.nCopies(10000, "str"));
        System.out.println(list);
    }
}

