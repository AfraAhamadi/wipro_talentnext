package java_fundamentals;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a >= 'a' && a<='z') {
			System.out.println(a+ "->"+(char)(a-32));
		}
		else {
			System.out.println(a+"->"+(char)(a+32));
		}

	}

}
