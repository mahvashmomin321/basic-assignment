import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int student[][] = new int[100][100];
		int total;
		int i;
		int j;
		int average;
		int subjectTotal;
		int subjectAverage;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			System.out.println("Enter the Marks of Student" + " " + (i + 1));
			for (j = 0; j < 3; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		System.out.println("physics chemisty maths");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(student[i][j] + " " + " " + " " + " " + " " + " ");
			}
			System.out.println();
		}

		for (i = 0; i < 3; i++) {
			total = 0;
			average = 0;
			for (j = 0; j < 3; j++) {
				total = total + student[i][j];
				average = total / 3;
			}
			System.out.println("total Marks of student" + (i + 1) + " " + total);
			System.out.println("Average Marks of student" + (i + 1) + " " + average);
		}

		for (i = 0; i < 3; i++) {
			subjectTotal = 0;
			subjectAverage = 0;
			for (j = 0; j < 3; j++) {

				subjectTotal += student[j][i];
				subjectAverage = subjectTotal / 3;

			}

			if (i == 0) {
				System.out.println("Total Marks of Physics" + " " + subjectTotal + " ");
				System.out.println("Average Marks of Physics" + " " + subjectAverage + " ");
			}

			else if (i == 1) {
				System.out.println("Total Marks of chemistry" + " " + subjectTotal + " ");
				System.out.println("Average  Marks of chemistry" + " " + subjectAverage + " ");

			} else if (i == 2) {
				System.out.println("Total Marks of maths" + " " + subjectTotal + " ");
				System.out.println("Average Marks of maths" + " " + subjectAverage + " ");

			}
		}
		sc.close();
	}
}
