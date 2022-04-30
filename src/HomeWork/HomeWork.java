package HomeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        do {
            day = scanner.nextInt();
            if (day <= 0 || day > 7) {
                System.out.println("Выйди и зайди нормально!");
            }
        } while (day <= 0 || day > 7);

        if (day == 1) {
            System.out.println("Понедельник");
        }
        if (day == 2) {
            System.out.println("Вторник");
        }
        if (day == 3) {
            System.out.println("Среда");
        }
        if (day == 4) {
            System.out.println("Четверг");
        }
        if (day == 5) {
            System.out.println("Пятница");
        }
        if (day == 6) {
            System.out.println("Суббота");
        }
        if (day == 7) {
            System.out.println("Воскреснье");
        }
    }
}