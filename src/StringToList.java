import java.util.ArrayList;
import java.util.List;

public class StringToList {
    public static void main(String[] args) {
        String str = "aaa1,aaa2,aaa3";

        List<String> list = new ArrayList<>();

        int a = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(",")) {
                list.add(str.substring(a, i));
                a = i + 1;
            }
        }

        list.add(str.substring(a, str.length()));

        System.out.println(list.size());

        list.forEach(System.out::println);
    }
}
