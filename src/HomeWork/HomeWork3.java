package HomeWork;

public class HomeWork3 {
    public static void main(String[] args) {
        int a = 156;
        int b = 36;
        int c = 155;
        int middle = (a + b + c) / 3;
        System.out.println(middle);
        if (a > b && a > c) {
            System.out.println(a);
        } else {
            if (b > c) {
                System.out.println(b);
            } else System.out.println(c);
        }
        if (a < b && a < c) {
            System.out.println(a);
        } else {
            if (b < c) {
                System.out.println(b);
            } else System.out.println(c);
        }
    }
}