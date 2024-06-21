import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String a = scan.nextLine();
        System.out.print("Введите строку b: ");
        String b = scan.nextLine();

        if(a.equals(b)){
            System.out.println("Строки идентичны");
        }
        else{
            System.out.println("Строки неидентичны");
        }
    }
}
