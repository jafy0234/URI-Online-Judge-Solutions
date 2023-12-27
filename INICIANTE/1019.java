import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(N/3600 + ":" + (N%3600)/60 + ":" + N%60);
    }
}
