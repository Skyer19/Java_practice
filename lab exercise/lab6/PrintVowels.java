public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 =(" A Java program must have one or more classes. The name of the source file and the name of the class must be the same. If we want make a Java program executable, we must provide a main method. The main method is an indicator and a signature for Java Virtual Machine to find the entry point of the program for execution.");
		String str2 = str1.replace(',',' ');
		String str3 = str2.replace('.',' ');
		String str4="";
		for(int i =str3.length()-1;i>=0;i--)
		{
			char a = str3.charAt(i);
			if(a==' ')
			{
				for( int d=i-1;d>=0;d--)
				{
					char b = str3.charAt(d);
					if(b==' ')
					{
						 str4 = str3.substring(d, i).trim();
						 System.out.print(str4+' ');
						 break;
				    }
			   }
			}
			
		}
	}
}