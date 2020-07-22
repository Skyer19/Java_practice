package lab3;

public class EasterSunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int year=2020;
	int quo1,quo2,quo3,quo4,quo5,quo7;
	int rem0,rem1,rem2,rem3,rem4,rem6,rem8;
	rem0=year%19;
	quo1=year/100;
	rem1=year%100;
	quo2=quo1/4;
	rem2=quo1%4;
	quo3=(quo1*8+13)/25;
	rem3=(rem0*19+quo1-quo2-quo3+15)%30;
	quo4=rem1/4;
	rem4=rem1%4;
	quo5=(rem0+11*rem3)/319;
	rem6=(2*rem2+2*quo4-rem4-rem3+quo5+32)%7;
	quo7=(rem3-quo5+rem6+90)/25;
	rem8=(rem3-quo5+rem6+quo7+19)%32;
	System.out.println(rem8);
	System.out.println(quo7);
	System.out.println(2020);
	}
}
