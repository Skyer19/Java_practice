public class Lab_2_Task_4{

	public static void main (String[] args) {
	 double x1=230.1,x2=44.5,x3=17.2,x4=151.1,x5=180.8,x6=8.7,x7=57.5,x8=120.2,x9=8.6,x10=199.8;
	 double y1=22.1;
	 double y2=10.4;
	 double y3=9.3;
	 double y4=18.5;
	 double y5=12.9;
	 double y6=7.2;
	 double y7=11.8;
	 double y8=13.2;
	 double y9=4.8;
	 double y10=10.6;
	 double averagex=(x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/10;
	 double averagey=(y1+y2+y3+y4+y5+y6+y7+y8+y9+y10)/10;
	 double num1=(x1-averagex)*(y1-averagey)+(x2-averagex)*(y2-averagey)+(x3-averagex)*(y3-averagey)+(x4-averagex)*(y4-averagey)+(x5-averagex)*(y5-averagey)+(x6-averagex)*(y6-averagey)+(x7-averagex)*(y7-averagey)+(x8-averagex)*(y8-averagey)+(x9-averagex)*(y9-averagey)+(x10-averagex)*(y10-averagey);
	 double num2=(x1-averagex)*(x1-averagex)+(x2-averagex)*(x2-averagex)+(x3-averagex)*(x3-averagex)+(x4-averagex)*(x4-averagex)+(x5-averagex)*(x5-averagex)+(x6-averagex)*(x6-averagex)+(x7-averagex)*(x7-averagex)+(x8-averagex)*(x8-averagex)+(x9-averagex)*(x9-averagex)+(x10-averagex)*(x10-averagex);
	 double d=(num1/num2);
	 System.out.println(averagey-d*averagex+d*350);
	}
}
