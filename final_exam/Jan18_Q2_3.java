package final_exam;

import java.util.Scanner;

public class Jan18_Q2_3 {
//Ì«¼èÄÑÁË  19/12/24
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] array = new int[size][4];
		// input
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		// average rental
		double people = 0;
		double rent = 0;
		for (int i = 0; i < size; i++) {
			if (array[i][3] == 1) {
				people = people + array[i][1];
				rent = rent + array[i][2];
			}
		}
//		for (int i = 0; i < size; i++) {
//			System.out.println(Arrays.toString(array[i]));
//		}

		System.out.println("average rental=" + (rent / people));

		// print the contents
		for (int i = 0; i < size; i++) {
			System.out.print("Propery " + i + ": ");
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}

		// +100
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < size; k++) {
				array[k][2] = array[k][2] + 100;
			}
		}

		// new average rental
		for (int i = 0; i < size; i++) {
			if (array[i][3] == 1) {
				people = people + array[i][1];
				rent = rent + array[i][2];
			}
		}
		System.out.println("new average rental=" + rent / people);

	}
}
