package Demo;

public class StudentManager extends UserManager{
	@Override
	public void show(User user) {
		System.out.println("Welcome Student =>"+user.getUserName());
	}
}
