package final_exam;

import java.util.Scanner;

public class Jan18_Q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count = 0;
		String[] array = new String[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) == 'a') {
					count++;
				}
				String temp = array[i].replace('t', '*');
				array[i] = temp;
			}
		}
		System.out.println(count);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
