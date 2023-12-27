import java.io.IOException;

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        double A = (4/3.0)*(3.14159*R*R*R);
        System.out.printf("VOLUME = %.3f\n",A);
    }
 
}
