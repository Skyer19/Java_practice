package final_exam;

import java.util.Scanner;

public class Aug18_Q2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (str1.equals(str2)) {
			System.out.println("Exactly the same: True");
		} else {
			System.out.println("Exactly the same: False");
			if (str1.equalsIgnoreCase(str2)) {
				System.out.println("Similar: True");
			} else {
				System.out.println("Similar: False");
			}
		}

	}

}
