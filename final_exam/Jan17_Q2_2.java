package final_exam;

import java.util.Scanner;

public class Jan17_Q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first name:");
		String first = sc.next();
		String a = first.substring(0, 1);
		a = a.toUpperCase();
		String a1 = first.substring(1, first.length());
		a1 = a1.toLowerCase();
		first = a + a1;

		System.out.println("Please enter your middle name:");
		String middle = sc.next();
		String c = middle.substring(0, 1);
		c = c.toUpperCase();
		middle = c;

		System.out.println("Please enter your last name:");
		String second = sc.next();
		String b = second.substring(0, 1);
		b = b.toUpperCase();
		String b1 = second.substring(1, second.length());
		b1 = b1.toLowerCase();
		second = b + b1;
		System.out.println("Name is:" + second + " ," + first + " ," + middle);
	}
}
