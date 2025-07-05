package java_fundamentals;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		switch(a) {
		case 'R' :
			System.out.println("R -> Red");
			break;
		case 'B':
			System.out.println("B -> Blue");
			break;
		case 'O':
			System.out.println("O -> Orange");
			break;
		case 'Y':
			System.out.println("Y -> Yellow");
			break;
		case 'W':
			System.out.println("W -> White");
			break;
		default:
			System.out.println("Invalid Code");
		}		
	}
}	
		
