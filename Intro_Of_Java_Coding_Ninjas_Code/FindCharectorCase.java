import java.util.*;
public class FindCharectorCase {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
		char ch=str.charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println(0);
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println(1);
		}
		else {
			System.out.println(-1);
		}
	}
	
	

}
