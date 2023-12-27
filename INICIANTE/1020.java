import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 365;
        int rA = n % 365;
        int rM = rA % 30;
        int m = rA / 30;
        int d = rM % 30;
        System.out.println(a + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");
    }
}
