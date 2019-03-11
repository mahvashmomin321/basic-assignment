import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		int array1[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int number;
		int length;
		int flag = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = sc.nextInt();
		length = array1.length;
		for (i = 0; i < length; i++) {
			if (array1[i] == number) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}

		}
		if (flag == 1) {
			System.out.println("Element Found=" + number);
		} else {
			System.out.println("Element not Found");
		}
		sc.close();
	}
}
