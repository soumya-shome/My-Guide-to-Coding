import java.util.*;
public class Main{
	public static Hosteller getHostellerDetails() {
		Scanner sc=new Scanner(System.in);
		Hosteller ob=new Hosteller();
		System.out.println("Enter the Details");
		System.out.println("Student Id");
		ob.setStudentId(sc.nextInt());
		System.out.println("Student Name");
		ob.setName(sc.nextLine());
		System.out.println("Department Id");
		ob.setDepartmentId(sc.nextInt());
		System.out.println("Gender");
		ob.setStudentId(sc.nextInt());
		System.out.println("Phone Number");
		ob.setStudentId(sc.nextInt());
		System.out.println("Hostel Name");
		ob.setStudentId(sc.nextInt());
		System.out.println("Room Number");
		ob.setStudentId(sc.nextInt());
		System.out.println("Modify Phone Number");
		ob.setStudentId(sc.nextInt());
		System.out.println("New Phone Number");
		ob.setStudentId(sc.nextInt());
		return ob;
	}
}