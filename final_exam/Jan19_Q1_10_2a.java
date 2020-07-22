package final_exam;

import java.util.Scanner;

public class Jan19_Q1_10_2a{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String num = sc.next();
			boolean iftrue = false;
			if (num.length() == 5) {
				if (num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3)) {
					iftrue = true;
				}
			}
			if (iftrue) {
				System.out.println(num);
			}
		}
	}

}
