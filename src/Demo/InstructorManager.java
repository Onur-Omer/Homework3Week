package Demo;

public class InstructorManager extends UserManager{
	@Override
	public void show(User user) {
		System.out.println("Welcome Instructor =>"+user.getUserName());
	}
}
