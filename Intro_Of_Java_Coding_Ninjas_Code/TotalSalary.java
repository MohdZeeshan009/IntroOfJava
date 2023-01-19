import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		int basicSalary=sc.nextInt();
		System.out.println("Enter the Grade: ");
		String str=sc.next();
		char grade=str.charAt(0);
		int allow;
		if(grade=='A') {
			allow=1700;
		}
		else if(grade=='b') {
			allow=1500;
		}
		else
		{
			allow=1200;
		}
		double totalSal=(basicSalary+(basicSalary*.2)+(basicSalary*.5)+allow-(basicSalary*.11));
		double totalSalary=Math.round(totalSal);
		int TSalary=(int)totalSalary;
		System.out.println(TSalary);
	}
}
