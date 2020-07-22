public class SquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		double b = 0;
		for (int i = 1; i >= 1 && i <= 100; i++) {
			if (i % 13 == 0) {
				a = a + i;
			}
			b = b + Math.pow(i, 2);
		}
		System.out.println("The sum of all numbers divisible by 13 is " + a);
		System.out.println("The sum of all squares is " + (int) b);
	}

}