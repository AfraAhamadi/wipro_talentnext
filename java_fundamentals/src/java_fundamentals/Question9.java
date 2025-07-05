package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
			System.out.println("Alphabet");
		}
		else if( a >= '0' && a <= '9' ) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
