package final_exam;

public class Jan18_Q2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 101; i <= 1000; i++) {
			String str = "" + i;
			if (str.charAt(0) == str.charAt(2)) {
				System.out.println(str);
				count++;
			}
		}
		System.out.println(count);
	}
}