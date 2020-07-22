public class Cryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String  str1 = ("p apgp roziopc cjfl spgn zun zo czon ehpffnf lsn upcn zb lsn fzjoen bkhn puy lsn \r\n" + 
			"upcn zb lsn ehpff cjfl qn lsn fpcn kb mn mpul cptn p apgp roziopc nvnejlpqhn mn \r\n" + 
			"cjfl rozgkyn p cpku cnlszy lsn cpku cnlszy kf pu kuykeplzo puy p fkiupljon bzo \r\n" + 
			"apgp gkoljph cpeskun lz bkuy lsn nulox rzkul zb lsn roziopc bzo nvnejlkzu");
	String str2 =str1.toUpperCase();
	for(int i=0;i<str2.length();i++)
	{
		char a = str2.charAt(i);
		switch(a)
		{
		case 'P':		
		System.out.print('A');
		break;
		case 'Q':		
		System.out.print('B');
		break;
		case 'E':		
		System.out.print('C');
		break;
		case 'Y':		
		System.out.print('D');
		break;
		case 'N':		
		System.out.print('E');
		break;
		case 'B':		
		System.out.print('F');
		break;
		case 'I':		
		System.out.print('G');
		break;
		case 'S':		
		System.out.print('H');
		break;
		case 'K':		
		System.out.print('I');
		break;
		case 'A':		
		System.out.print('J');
		break;
		case 'T':		
		System.out.print('K');
		break;
		case 'H':		
		System.out.print('L');
		break;
		case 'C':		
		System.out.print('M');
		break;
		case 'U':		
		System.out.print('N');
		break;
		case 'Z':		
		System.out.print('O');
		break;
		case 'R':		
		System.out.print('P');
		break;
		case 'D':		
		System.out.print('Q');
		break;
		case 'O':		
		System.out.print('R');
		break;
		case 'F':		
		System.out.print('S');
		break;
		case 'L':		
		System.out.print('T');
		break;
		case 'J':		
		System.out.print('U');
		break;
		case 'G':		
		System.out.print('V');
		break;
		case 'M':		
		System.out.print('W');
		break;
		case 'V':		
		System.out.print('X');
		break;
		case 'X':		
		System.out.print('Y');
		break;
		case 'W':		
		System.out.print('Z');
		break;
		case ' ':		
		System.out.print(' ');
		break;
		}
	}
	}
}