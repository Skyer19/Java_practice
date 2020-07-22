package final_exam;

public class Aug19_Q2_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6];
		for (int i = 0; i <= 5; i++) {
			int num = (int) (Math.random() * 42);
			array[i] = num;
		}
		for (int a : array) {
			System.out.println(a);
		}
	}

}
