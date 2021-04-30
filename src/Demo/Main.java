package Demo;

public class Main {

	public static void main(String[] args) {
		
		Student onur =new Student();
		Instructor engin =new Instructor();
		
		onur.setUserId(1);
		onur.setUserName("Onur");
		onur.setTeacher("Engin");
		
		engin.setUserId(2);
		engin.setUserName("Engin");
		engin.setStudentNumber(3000);
		
		UserManager studentManager =new StudentManager();
		UserManager instructorManager=new InstructorManager();
		
		studentManager.show(onur);
		instructorManager.show(engin);
				

	}

}
