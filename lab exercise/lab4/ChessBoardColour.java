public class ChessBoardColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessBoardColour cbc =new ChessBoardColour();
		cbc.checkColour('f',1);
		cbc.checkColour('G',7);
		cbc.checkColour('J',1);
	}
	private void checkColour(char letter,int number) {
		if(letter>='H'&&letter<='Z'||letter>='h'&&letter<='z')
		{
			System.out.println("Wrong Code!");
		}
		else if(letter=='B'||letter=='D'||letter=='F'||letter=='H'||letter=='b'||letter=='d'||letter=='f'||letter=='h')
		{
			if(number%2!=0) 
			{
			System.out.println("Light");
			}
			if(number%2==0) 
			{
			System.out.println("Dark");
			}
		}
		else if(letter=='A'||letter=='C'||letter=='E'||letter=='G'||letter=='a'||letter=='c'||letter=='e'||letter=='g')
		{
		    if(number%2==0) 
			{
		    	System.out.println("Light");
		    }
		    if(number%2!=0) 
			{
		    	System.out.println("Dark");
		    }
		}

	}
}
