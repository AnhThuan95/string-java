import java.util.ArrayList;
import java.util.List;

public class ListToString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa1");
        list.add("aaa2");
        list.add("aaa3");
        list.add("aaa4");

        String str = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            str = str + "," + list.get(i);
        }
        System.out.println(str);
    }
}
