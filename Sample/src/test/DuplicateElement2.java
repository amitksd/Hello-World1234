package test;

import java.util.HashMap;

public class DuplicateElement2 {

	public static void main(String args[]) {

		int arr[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int j = 0; j < arr.length; j++) 
		{
			hashmap.put(arr[j], j); 
		}

		System.out.println(hashmap.keySet());

	}
}
