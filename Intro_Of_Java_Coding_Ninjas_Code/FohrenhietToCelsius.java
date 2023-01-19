import java.util.Scanner;

public class FohrenhietToCelsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value of Fohrenhiet: ");
		int s=sc.nextInt();
		System.out.println("Enter the end value of Fohrenhiet: ");
		int e=sc.nextInt();
		System.out.println("Enter the step size: ");
		int w=sc.nextInt();
		for(int i=s; i<=e;i+=w) {
			int cel=(i-32)*5/9;
			System.out.println(i+" "+ cel);
		}
		
	}
}
