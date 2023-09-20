import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = input.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }

    public static boolean isPrime(int number, int i) {
        if (i == 1) {
            return true;
        } else {
            if (number % i == 0) {
                return false;
            } else {
                return isPrime(number, i - 1);
            }
        }
    }
}