package arrayProgram;

import java.util.Scanner;

public class HighestLowest2 {

	public static void main(String[] args) {
		int high;
		int low;
		int num;
		int a[] = { 1, 2, 5, 6, 3, 2 };

		for (int i = 0; i < 5; i++) {
			int c = a[i];
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
