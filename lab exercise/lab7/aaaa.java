import java.util.Scanner;
 class aaaa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String qq = "";
		OUT: 
			while (sc.hasNext()) {
			qq = sc.next();
			if (qq == "exit") 
			{
				sc.close();
				break OUT;
			}
			try {
				byte value = Byte.parseByte(qq);
				System.out.println(qq + " can be converted into a type byte!");
			} catch (NumberFormatException ina) {
				System.out.println(qq + " cannot be converted into a type byte!");
			}
			try {
				short value1 = Short.parseShort(qq);
				System.out.println(qq + " can be converted into a type short!");
			} catch (NumberFormatException inb) {
				System.out.println(qq + " cannot be converted into a type short!");
			}
			try {
				int value2 = Integer.parseInt(qq);
				System.out.println(qq + " can be converted into a type int!");
			} catch (NumberFormatException inc) {
				System.out.println(qq + " cannot be converted into a type int!");
			}
			try {
				Float value3 = Float.parseFloat(qq);
				System.out.println(qq + " can be converted into a type float!");
			} catch (NumberFormatException ind) {
				System.out.println(qq + " cannot be converted into a type float!");
			}
			try {
				double value4 = Double.parseDouble(qq);
				System.out.println(qq + " can be converted into a type double!");
			} catch (NumberFormatException ine) {
				System.out.println(qq + " cannot be converted into a type double!");
			}
		}

	}
}