public class DivideBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=40;
		int count =0;
		int b=0;
		int rem=3;
		while(rem>=2)
		{
			count++;
			rem=num1/2;
			num1=rem;
					
		}
		System.out.println(count);
	}

}