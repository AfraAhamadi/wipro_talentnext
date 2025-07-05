package java_fundamentals;
import java.util.*;
public class Question21 {
	public static int rev(int n) {
		int rev = 0;
		while(n > 0) {
			int ld = n%10;
			rev = rev*10+ld;
			n = n/10;
			
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = rev(n);
		if(n == n1) {
			System.out.println(n+ " is a Palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}

	}

}
