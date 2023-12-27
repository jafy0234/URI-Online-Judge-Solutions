import java.io.IOException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
  double a, b, r;

		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();

		r = (a * b)/12;
		
		System.out.printf("%.3f\n", r);
		

	}
}
