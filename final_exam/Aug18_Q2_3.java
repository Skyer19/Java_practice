package final_exam;

import java.util.Scanner;

public class Aug18_Q2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num % 2 != 0) {
				System.out.println(num + " is an odd number");
			} else {
				System.out.println(num + " is an even number");
			}
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					if (i != num) {
						System.out.println(num + " is not a prime number. It is divisible " + i + ".");
						break;
					} else {
						System.out.println(num + " is a prime number as it is only divisible by 1 and " + num + ".");
					}
				}
			}
		}
	}
}
