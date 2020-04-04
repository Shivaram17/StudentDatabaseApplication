package studentdatabaseapp;

import java.util.Scanner;	

public class Student {
	
	// using encapsulation
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	//we use static when the variable is same to all other variables
	private static int id = 1000;
	
	
	// Constructor: prompt user to enter students name and year
	
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.print(" 1: Freshmen\n 2: sophomore\n 3: junior \n 4: Senior\n Enter student calss year:");
		this.gradYear = in.nextInt();
		
		setStudentId();
		// print firstname lastname and year
		//System.out.println(firstName +" "+  lastName +" "+ gradYear +" "+ studentId);
		
	}
	
	
	// generate an id
	private void setStudentId()
	{
		// grade level + id
		id++;
		this.studentId = gradYear + "" + id;
		
		
	}
	
	//Enroll in Courses
	
	public void enroll()
	{
		do{
			System.out.println("Enter course to enroll or Q to quit ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses + "\n" + " " + course;
				tuitionBalance = tuitionBalance + costOfCourse; 
				
			}
			else
			{
				//System.out.println("BREAK");
				break;
			}
		}while(1!=0);
		
		//System.out.println("Enrolled in :" + " " + courses);
		
	}
	
	//View balance
	
	public void viewBalance()
	{
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	//Pay tuition
	
	public void payTuition()
	{
		System.out.println("Enter payment amount ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		//System.out.println("Thanks for paying $" + payment);
		//viewBalance();
	}
	
	//Show status
	public String showInfo()
	{
		return "Name:" + firstName + " " + lastName +
				"\n Grad level: " + gradYear +
				"\n StudentId: " + studentId +
				"\n Courses: "  + courses +
				"\n Balance: " + tuitionBalance;
	}
	
}
