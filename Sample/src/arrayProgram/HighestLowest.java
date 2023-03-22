package arrayProgram;

import java.util.Scanner;

public class HighestLowest {

	public static void main(String[] args) {
		int high;
		int low;
		int num;
		int a[] = new int[5];
		Scanner s1 = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			a[i] = s1.nextInt();
		}

		high = a[0]; // 10
		low = a[0];

		for (int i = 0; i < 5; i++) {
			num = a[i];
			if (num > high) {
				high = num;
			}

			if (num < low) {
				low = num;
			}
		}

		System.out.println("highest = " + high + "   lowest = " + low);

	}

}
