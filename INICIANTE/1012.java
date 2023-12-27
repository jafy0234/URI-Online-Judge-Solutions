import java.io.IOException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     double A= sc.nextDouble();
     double B= sc.nextDouble();
     double C= sc.nextDouble();
    System.out.printf("TRIANGULO: %.3f\n",.5*(A*C));
    System.out.printf("CIRCULO: %.3f\n",(3.14159*C*C));
    System.out.printf("TRAPEZIO: %.3f\n",.5*(A+B)*C);
    System.out.printf("QUADRADO: %.3f\n",B*B);
    System.out.printf("RETANGULO: %.3f\n",A*B);
    }
 
}
