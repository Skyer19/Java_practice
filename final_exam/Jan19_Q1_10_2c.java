package final_exam;

import java.util.Scanner;

//complex
public class Jan19_Q1_10_2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a String of email addresses:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] array = str.split(";");
		System.out.println("The individual email addresses are:");
		for (String email : array) {
			System.out.println(email);
		}
		System.out.println("The names are:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				int a = -1;
				if (array[i].charAt(j) == '.') {
					System.out.print(array[i].substring(0, j));
					a = j;
					break;
				}
			}
			for (int k = 0; k < array[i].length(); k++) {
				if (array[i].charAt(k) == '.') {
					int a = k;
					for (int z = a; z < array[i].length(); z++) {
						if (array[i].charAt(z) == '@') {
							System.out.print(array[i].substring(a, z));
						}
					}
				}
			}
			System.out.println();
		}
	}
}
