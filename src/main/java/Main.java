import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите выражение");
            String str = scanner.nextLine();
            System.out.println(Calculator.getResult(str));
        }
    }
}
