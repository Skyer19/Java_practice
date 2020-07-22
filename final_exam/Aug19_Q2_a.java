package final_exam;

public class Aug19_Q2_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[][] array = new int[5][];
			array[0] = new int[5];
			array[1] = new int[4];
			array[2] = new int[3];
			array[3] = new int[2];
			array[4] = new int[1];
			for (int i = 0; i <= 5; i++) {
				for (int j = 0; j < 5 - i; j++) {
					array[i][j] = (4 - i) - j;
				}
			}
			for (int i = 0; i <= 5; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
		}
	}
}
//
//		int[][] a = new int[5][];
//		int colCount = 5;
//		for (int i = 0; i < 5; i++) {
//			a[i] = new int[colCount];
//			int inColCount = colCount - 1;
//			for (int j = 0; j < colCount; j++) {
//				a[i][j] = inColCount--;
//			}
//			colCount--;
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(Arrays.toString(a[i]));
//		}
//	}
//}
