package java_fundamentals;
import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n > 0) {
			int ld = n%10;
			sum += ld;
			n = n/10;
		}
		System.out.println(sum);
	}

}
