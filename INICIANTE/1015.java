import java.io.IOException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double X1= sc.nextDouble();
    double Y1= sc.nextDouble();
    double X2= sc.nextDouble();
    double Y2= sc.nextDouble();
    
    double dist=Math.sqrt(Math.pow(X2-X1,2)+Math.pow(Y2-Y1,2));
    System.out.printf("%.4f\n",dist);
    }
 
}
