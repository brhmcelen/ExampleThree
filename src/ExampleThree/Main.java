package ExampleThree;

public class Main {

	public static void main(String[] args) {

		StudentUser ibrahim = new StudentUser();
		ibrahim.setId(0);
		ibrahim.setFullName("�brahim �elen");
		ibrahim.setEmailAdress("brhmcelen@tai.com.tr");
		ibrahim.setPassword("123456");
		
		
		
		InstructorUser celen = new InstructorUser();
		celen.setId(1);
		celen.setFullName("Engin Demiro�");
		celen.setEmailAdress("engin@demiro�.com.tr");
		celen.setPassword("44445");
		celen.setResume("Java Kursuna devam edilmektedir...");
		
		Course course = new Course (0,"Java && React Kursu ","Engin Demiro�");
		Course course1 = new Course (1,"C# Kursu ", "Engin Demiro�");
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signIn(celen);
		instructorManager.profileEdit(celen);
		instructorManager.addCourse(celen, course1);
		instructorManager.addHomework(celen, course);

		
		
		
		
	}

}
