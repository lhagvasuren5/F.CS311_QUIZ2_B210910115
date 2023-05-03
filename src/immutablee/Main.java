package immutablee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Software Construction");
		course.setCourseName("Software Construction");
		
		
		System.out.println(course.getCourseName());
		
		course.setCourseName("Programm hangamjiin buteelt");
	    System.out.println(course.getCourseName());
	}

}
