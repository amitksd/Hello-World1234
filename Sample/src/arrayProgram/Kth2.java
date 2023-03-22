package arrayProgram;

public class Kth2 
{

	public static void main(String args[]) 
	{
		int a[] = { 9, 2, 5, 6, 3, 2 };
		int total = 6;
		int temp;
			
		for (int i = 0; i < total-1; i++) 
			{

				for (int j = i; j < total; j++) 
				{
					if (a[i] > a[j]) 
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}

		System.out.println(a[total - 2]);
		}
	}

