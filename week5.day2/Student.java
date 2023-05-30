package week5.day2;

public class Student {
	public void getStudentInfo(String id) {
		System.out.println("Student id : "+id );
		
	}
	public void getStudentInfo(String id,String name) {
		System.out.println("String id :"+id);
		System.out.println("Student name : "+name);
	}
	public void getStudentInfo(String emailId,long phone) {
		System.out.println("Student email Id :"+emailId);
		System.out.println("Student PhoneNumber :"+phone);
	}
	public static void main(String[] args) {
		Student detail=new Student();
		detail.getStudentInfo("ID001");
		detail.getStudentInfo("ID001", "MATHIVANAN");
		detail.getStudentInfo("mathivananmtg@gmail.com", 9150888712L);
	}
}
