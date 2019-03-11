import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int number;
		int remainder;
		int sum;
		int flag;
		sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();
		flag=number;
		
		while(number>0) {
			remainder=number%10;
			sum= sum + (remainder*remainder*remainder);
			number=number/10;
		}
		if(flag==sum) {
			System.out.println("Number is Armstrong Number:"+sum);
		}
		else {
			System.out.println("Number is not an Armstrong Number");
		}
		sc.close();
	}
}
