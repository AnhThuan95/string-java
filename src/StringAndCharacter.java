import java.util.Scanner;

public class StringAndCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao String: ");
        String s = scanner.nextLine();

        System.out.println("Nhap vao ki tu: ");
        String c = scanner.nextLine();

        int count = 0;

        int begin = s.indexOf(c);

        int end = s.lastIndexOf(c);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c.charAt(0)) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println(begin);

        System.out.println(end);
    }
}
