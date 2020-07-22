
public class ScheduleValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int st1=1215;
	int st2=820;
	int end1=2030;
	int end2=1345;
	if(st2>st1&&st2<end2) {
		System.out.println(" Appointment1 – Appointment2");
	}
	else if(st2<st1&&st1<end2){
		System.out.println(" Appointment2 - Appointment1");
	}
	else  {
	    System.out.println("Perfectly scheduled!");
	}
}
}
