import java.util.Scanner;

public class Main {
    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        a = input.nextInt();

        System.out.println("Üs değerini giriniz : ");
        b = input.nextInt();

        System.out.print(pow(a, b));
    }
}