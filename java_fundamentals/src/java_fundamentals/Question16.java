package java_fundamentals;
import java.util.*;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = true;
		for(int i = 1;i<=Math.sqrt(n);i++) {
			if(n % 2 == 0) {
				prime = false;
				break;	
			}
		}
		if(prime == true) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not 😂😂😂 prime");
		}
	}

}
