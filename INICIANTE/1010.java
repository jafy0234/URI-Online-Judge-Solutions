import java.io.IOException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
     int B= sc.nextInt();
     double C= sc.nextDouble();
     
      int D=sc.nextInt();
     int E=sc.nextInt();
     double F= sc.nextDouble();
     
    double TOTAL = (C*B)+(E*F);
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);
    }
 
}
