package ExampleThree;

public class StudentManager extends UserManager{
	
	public void addCourse(User user, Course course) {
		System.out.println(" ��renci : " + user.fullName + " " + course.courseName + "e�itimini kurslar�na ekledi.");
	}

	public void doneHomework(StudentUser studentUser, Course course) {
		System.out.println(studentUser.fullName + " ��renci " + course.courseName + " kursunun �devlerini tamamlad�.");
		
	}

}
