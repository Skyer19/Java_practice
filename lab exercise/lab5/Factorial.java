public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17;
		long mul=1;
		int i=num;
		while(i>0)
		{
		mul=i*mul;
		i--;
		}
		System.out.println("The factorial of 17 is"+" "+mul);		
	}

}