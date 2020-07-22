import java.util.Scanner;

public class BarRotator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String deg = sc.next();

//		boolean ifstop = false;
//		if (deg.equals("Exit")) {
//			ifstop = true;
//		}
		while (sc.hasNext()) {
			int[][] array = new int[12][12];
			String deg = sc.next();
			// degree==0/180/360
			if (deg.equals("0") || deg.equals("180") || deg.equals("180")) {
//				int[][] array = new int[12][12];
				for (int j = 0; j <= 11; j++) {
					for (int i = 0; i <= 11; i++) {
						if (i == 5 | i == 6) {
							array[i][j] = 0;
						} else {
							array[i][j] = 1;
						}
					}
				}
			}

			// degree==45/225
			if (deg.equals("45") || deg.equals("225")) {
//				int[][] array = new int[12][12];
				for (int i = 0; i <= 11; i++) {
					int a = -1;
					int b = 1;
					for (int j = 0; j <= 11; j++) {
						if (a == i || b == i) {
							array[i][j] = 0;
						} else {
							array[i][j] = 1;
						}
						a++;
						b++;
					}
				}
			}
			// degree==90/270
			if (deg.equals("90") || deg.equals("270")) {
//				int[][] array = new int[12][12];
				for (int i = 0; i <= 11; i++) {
					if (i == 5 || i == 6) {
						for (int j = 0; j <= 11; j++) {
							array[j][i] = 0;
						}
					} else {
						for (int j = 0; j <= 11; j++) {
							array[j][i] = 1;
						}
					}
				}
			}
			// degree==135/315
			if (deg.equals("135") || deg.equals("315")) {
//				int[][] array = new int[12][12];
				for (int i = 0; i <= 11; i++) {
					int a = 12;
					int b = 10;
					for (int j = 0; j <= 11; j++) {
						if (a == i || b == i) {
							array[i][j] = 0;
						} else {
							array[i][j] = 1;
						}
						a--;
						b--;
					}
				}
			}
			// print
			for (int i = 0; i <= 11; i++) {
				for (int j = 0; j <= 11; j++) {
					if (j == 11) {
						System.out.print(array[i][j]);
					} else {
						System.out.print(array[i][j] + " ");
					}
				}
				System.out.println();
			}

		}
	}
}