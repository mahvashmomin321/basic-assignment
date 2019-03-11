
public class BubbleSort {
	public static void main(String[] args) {
		int array1[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int length;
		int i;
		int j;
		int temp;
		length = array1.length;
		for (i = 0; i < length - 1; i++) {
			for (j = 0; j < length - i - 1; j++) {
				if (array1[j] > array1[j + 1]) {
					temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}
