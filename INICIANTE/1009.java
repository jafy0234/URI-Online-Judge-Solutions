import java.io.IOException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name=sc.next();
     double A= sc.nextDouble();
     double B= sc.nextDouble();
    double TOTAL = A+B*.15;
    System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
    }
 
}
