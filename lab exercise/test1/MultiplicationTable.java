public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("MultiplicationTable");
for(int i=1;i<10;i++)
{
System.out.print(" ");
	System.out.print(" "+i+"");	
}
System.out.println();
	for(int i=1;i<10;i++)
	{
		System.out.print(i+"|");
		for(int n=1;n<=i;n++) {
			
			System.out.print(i*n+" ");
			
		}
		System.out.println();
	}
		}
	
	}