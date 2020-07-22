package lab3;

public class BetaBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double s1=55;
	double s2=37;
	double v1=4.6;
	double v2=2.4;
	double t=25.2;
	double a=1-v2*v2/v1/v1;
	double b=2*t*v2*v2/v1-2*s1;
	double c=s1*s1+s2*s2-v2*v2*t*t;
	double x1=-b/(2*a)+(Math.sqrt(b*b-4*a*c))/(2*a);
	double x2=-b/(2*a)-(Math.sqrt(b*b-4*a*c))/(2*a);
	System.out.println(x1);
	System.out.println(Math.sqrt((s1-x1)*(s1-x1)+s2*s2));
	}
}
