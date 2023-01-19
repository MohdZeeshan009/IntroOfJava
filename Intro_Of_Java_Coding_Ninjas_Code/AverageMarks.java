import java.util.*;
public class AverageMarks {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Student");
		String student=sc.next();
		char ch=student.charAt(0);
		System.out.println("Enter the mark of 1st subject: ");
		int marks1=sc.nextInt();
		System.out.println("Enter the mark of 2nd subject: ");
		int marks3=sc.nextInt();
		System.out.println("Enter the mark of 3rd subject: ");
		int marks2=sc.nextInt();
		
		int average=(marks1+marks2+marks3)/3;
		System.out.println(ch);
		System.err.println(average);
		
	}

}
