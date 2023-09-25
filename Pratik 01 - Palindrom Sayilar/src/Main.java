import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int tempN = number, reverseN = 0, lastNumber;
        while (tempN != 0) {
            lastNumber = tempN % 10;
            reverseN = (reverseN * 10) + lastNumber;
            tempN /= 10;
        }
        if (number == reverseN)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}