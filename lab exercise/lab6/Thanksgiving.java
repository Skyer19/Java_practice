public class Thanksgiving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=("These are some treats for your hard works.");
		int a= str1.length();
		int b= str1.indexOf('h');
		String str2 =str1.toLowerCase();
		String str3 =str1.toUpperCase();
       	String str4 =(a+"\r\n"+b+"\r\n"+str2+"\r\n"+str3);
		System.out.println(str4);
		
		
	}

}