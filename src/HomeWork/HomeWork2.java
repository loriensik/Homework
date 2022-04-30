package HomeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        if (c < a) {
            System.out.println("Промежуток №1");
        }
        if (c >= a && c <= b) {
            System.out.println("Промежуток №2");
        }
        if (c > b) {
            System.out.println("Промежуток №3");
        }
    }
}
