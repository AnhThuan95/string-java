import java.util.Scanner;

public class StringAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao String: ");
        String str = scanner.nextLine();

        System.out.println("Nhap vao string: ");
        String s = scanner.nextLine();

        int count = 0;

        int lengthOfString = s.length();

        int begin = str.indexOf(s);

        int end = str.lastIndexOf(s);

        for (int i = 0; i < str.length()-lengthOfString; i++) {
            if (str.substring(i, i + lengthOfString).equals(s)) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println(begin);

        System.out.println(end);
    }
}
