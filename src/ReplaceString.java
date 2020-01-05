import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("raw: ");
        String raw = scanner.nextLine();

        System.out.println("from: ");
        String from = scanner.nextLine();

        System.out.println("to: ");
        String to = scanner.nextLine();

        String result = raw.replace(from, to);
        System.out.println(result);
    }
}
