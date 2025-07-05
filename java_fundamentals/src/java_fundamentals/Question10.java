package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
		int age = sc.nextInt();
		if(gender.equals("Female") && age >= 1 && age <= 58) {
			System.out.println("the percentage of interest is 8.2%");
		}
		else if(gender.equals("Female")&& age >= 59 && age <= 100){
			System.out.println("the percentage of interest is 9.2%");
		}
		else if(gender.equals("Male") && age >= 1 && age <= 58){
			System.out.println("the percentage of interest is 8.4%");
		}
		else if(gender.equals("Male") && age >= 59 && age <= 100){
			System.out.println("the percentage of interest is 10.5%");
		}

	}

}
