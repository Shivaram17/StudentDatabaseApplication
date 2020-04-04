package studentdatabaseapp;
import java.util.Scanner;
public class StudentDatabaseApp {

	
	public static void main(String[] args) {
		
		//Ask how many new users we want add using array
		System.out.println("Enter number of students to enroll: ");
		
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		// create n number of students;
		for(int n=0; n<numOfStudents; n++)
		{
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for(int n=0; n<numOfStudents; n++)
		{
			System.out.println(students[n].showInfo());
		}
		
		// Create a number of new users

	}

}
