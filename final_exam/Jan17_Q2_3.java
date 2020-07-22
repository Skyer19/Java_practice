package final_exam;

public class Jan17_Q2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 22;// 11
		int count = 0;
		int max = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
				max = i;
			}
		}
		System.out.println("The largest number that divides evenly into " + num + " excluding itself is " + max + ".");
		System.out.println(count + " numbers divide evenly into " + num + ", excluding itself.");
	}

}
