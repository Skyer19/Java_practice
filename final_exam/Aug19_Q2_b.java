package final_exam;

import java.util.Scanner;

public class Aug19_Q2_b{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		double area = 0;
		double circum = 0;
		if (sec == 1) {
			area = Math.PI * Math.pow(fir, 2);
			System.out.println(area);
		} else {
			circum = Math.PI * 2 * fir;
			System.out.println(circum);
		}
	}

}
