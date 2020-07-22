
public class Histogram_Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count7 = 0;
		int array[] = new int[10];
//		String digit = "";
		String str = "1022473578476949426110832338899437170338449409627474102214022150928";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (a == '0') {
				array[0]++;
			}
			if (a == '1') {
				array[1]++;
			}
			if (a == '2') {
				array[2]++;
			}
			if (a == '3') {
				array[3]++;
			}
			if (a == '4') {
				array[4]++;
			}
			if (a == '5') {
				array[5]++;
			}
			if (a == '6') {
				array[6]++;
			}
			if (a == '7') {
				array[7]++;
			}
			if (a == '8') {
				array[8]++;
			}
			if (a == '9') {
				array[9]++;
			}
		}
//		for (int j = 0; j < array.length; j++) {
//			System.out.println(array[j]);
//		}

		int sum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (sum < array[i]) {
				sum = array[i];
			}
		}
//		System.out.println(sum);

		for (int j = sum; j > 0; j--) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] > j-1) {
					System.out.print("["+i+"]" + " ");
				} else {
					System.out.print(" "+"   ");
				}
			}
			System.out.println();
		}

	}

}
