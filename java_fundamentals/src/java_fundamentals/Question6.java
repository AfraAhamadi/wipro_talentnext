package java_fundamentals;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.next();
		}
		if(a.length == 0) {
			System.out.println("No values");
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(i == a.length-1 ) {
					System.out.print(a[i]);
				}
				else {
					System.out.print(a[i]+", ");
				}
			}
		}

	}

}
