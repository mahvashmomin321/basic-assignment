import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		double ctc;
		double tax = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter CTC");
		ctc=sc.nextDouble();
		if(ctc>=0 && ctc <= 180000) {
			System.out.println("No tax");
		}
		else if(ctc>=181001 && ctc<=300000) {
			tax=ctc*0.1;
		}
		else if(ctc>=300001 && ctc<=500000) {
			tax=ctc*0.2;
		}
		else if(ctc>=500001 && ctc<=1000000) {
			tax=ctc*0.3;
		}
		System.out.println("Tax=" +tax); 
		sc.close();
	}
}
