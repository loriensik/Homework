package HomeWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        double a = 289;
        Scanner scanner = new Scanner(System.in);
        double b = scanner.nextDouble();
        double c = Math.abs((b-a)/b*100);
        System.out.println(c);
        if (c < 10) {
            System.out.println("Близко");
        } else {
            System.out.println("Не близко");
        }
    }
}
