import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		float subject1;
		float subject2;
		float subject3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject1");
		subject1= sc.nextFloat();
		System.out.println("Enter marks of subject2");
		subject2= sc.nextFloat();
		System.out.println("Enter marks of subject3");
		subject3= sc.nextFloat();
		if(subject1>60 && subject2>60 && subject3>60) {
			System.out.println("Passed");
		}
		else if((subject1>60 && subject2>60)||(subject2>60 && subject3>60) || (subject1>60 && subject3>60)) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("failed");
		}
		sc.close();
		
	}
}
