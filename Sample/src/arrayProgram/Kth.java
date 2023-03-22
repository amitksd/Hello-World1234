package arrayProgram;

public class Kth {

	public static int getThirdLargest(int[] a, int total) 
	{
		int temp;
		for (int i = 0; i < total-1; i++) 
		{
			
			for (int j = i ; j < total; j++) 
			{
				if (a[i] > a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total - 4];
	}

	public static void main(String args[]) {
		
	
		System.out.println("Third Largest: " + getThirdLargest(a, 6));
		
	}
}
