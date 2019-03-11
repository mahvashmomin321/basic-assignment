import java.util.Scanner;

public class SimpleCompound {
	public static void main(String[] args) {
		int simpleInterest;
		int compoundInterest;
		int principal;
		int interest;
		int period;
		int flag;
		int t;
		simpleInterest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		principal= sc.nextInt();
		System.out.println("Enter interest");
		interest=sc.nextInt();
		System.out.println("Enter period");
		period=sc.nextInt();
		simpleInterest=(principal*interest*period)/100;
		System.out.println("Simple Interest="+simpleInterest);
		System.out.println("Enter Number of years");
		t=sc.nextInt();
		flag=1+(interest/100);
		compoundInterest=(int) (principal* Math.pow(flag, period*t));
		System.out.println("Compound Interest="+compoundInterest);
		sc.close();
	}
}
