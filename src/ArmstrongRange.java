
public class ArmstrongRange {
	public static void main(String[] args) {
		int i;
		int flag = 0;
		int remainder;
		int number;
		for (i = 100; i<= 999; i++) {
			int sum=0;
			number=i;
			flag = number;
			while (number > 0) {
				remainder = number % 10;
				sum = sum + (remainder * remainder * remainder);
				number = number / 10;
			}

			if(flag == sum) {
				System.out.println("Number is Armstrong Number:" + sum);
			}
		}
	}
}
