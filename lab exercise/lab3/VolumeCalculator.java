package lab3;

public class VolumeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double r1=23.5,r2=17.39,r3=4.39;
	double h1=24.3293,h2=23.16,h3=31,h4=20,h5=11.9999;
	double V1,V2,V3,V4,V5;
	V1=3.1415*Math.pow(r3, 2)*h5;
	V3=3.1415*Math.pow(r2, 2)*h3;
	V2=3.1415/3*(Math.pow(r3, 2)+Math.pow(r2, 2)+r3*r2)*h4;
	V4=3.1415/3*(Math.pow(r1, 2)+Math.pow(r2, 2)+r1*r2)*h2;
	V5=3.1415*Math.pow(r1, 2)*h1;
	System.out.println(V1+V2+V3+V4+V5);	
}
}
