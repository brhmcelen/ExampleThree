package ExampleThree;

public class InstructorManager extends UserManager{
	
	public void addCourse(User user, Course course) {
		
		System.out.println("E�itmen: " + user.fullName + " " + course.courseName + " e�itimi eklendi...");
		
	}
	public void addHomework(InstructorUser instructorUser, Course course) {
		
		System.out.println("E�itmen : " + instructorUser.fullName + course.courseName + "kursuna �dev eklendi..");
		
	}

}
