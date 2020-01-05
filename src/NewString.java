import java.util.HashSet;
import java.util.Scanner;

public class NewString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao chuoi: ");
        String str = scanner.nextLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = str.substring(i, 1 + j);
                set.add(s);
            }
        }

        set.forEach(System.out::println);

        System.out.println(set.size());
    }
}
