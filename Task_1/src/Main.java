import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        Integer a = scan.nextInt();
        System.out.print("Введите число b: ");
        Integer b = scan.nextInt();
        if (a > b) {
            System.out.print("A > B");
        } else if (a < b) {
            System.out.print("A < B");
        } else {
            System.out.print("A = B");
        }

        System.out.printf("\nA + B = %d\nA - B = %d\nA / B = %f\nA * B = %d", a + b, a - b, a.floatValue() / b.floatValue(), a * b);
    }
}
