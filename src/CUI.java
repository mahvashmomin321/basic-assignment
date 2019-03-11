import java.util.Scanner;

public class CUI {
	public static void main(String[] args) {
		String username;
		String password;
		int count = 0;
		Scanner sc= new Scanner(System.in);
		while(count<4) {
			System.out.println("Enter Username");
			username=sc.next();
			System.out.println("Enter Password");
			password=sc.next();
			if(username.equals("mahvash") && password.equals("mahvash21")) {
				System.out.println("welcome");
				break;
			}	
			count++;
			if(count==3) {
				System.out.println("Contact Admin");
			}
			sc.close();
		}
		
	}
}
