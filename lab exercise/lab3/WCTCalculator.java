package lab3;

public class WCTCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double Twc =0;
	double Tf = 31.4;
	double Tc =0;
	
	double v =20;
	double a=Math.pow(v, 0.16);
	Tc =35.74+(0.6215*Tf)-(35.75*a)+(0.4275*Tf*a);
	Twc=(Tc-32)/1.8;
	System.out.println(Twc);
	}
}
