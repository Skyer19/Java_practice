public class SquareIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double x1=6;
	double y1=7;
	double x2=4;
	double y2=5;
	double l1=3;
	double l2=7;
//	double r = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	if((Math.abs(x1-x2)>0.5*(l1+l2))&(Math.abs(y1-y2)>0.5*(l1+l2)))
		{
		System.out.println("The two squares are apart from each other.");
		}
	else if (Math.abs(x1-x2)>0.5*(l1+l2)&&Math.abs(y1-y2)>0.5*(l1+l2))
	{
		System.out.println("Square1 intersects with Square2.");
	}
	else if (Math.abs(x1-x2)+0.5*l2<0.5*l1&&Math.abs(y1-y2)+0.5*l2<0.5*l1)
	{
		System.out.println("Square1 contains Square2.");
	}
	else 
	{
		System.out.println("Square2 contains Square1.");
	}
	}
}