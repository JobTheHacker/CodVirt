import java.util.*;
public class Bubble_Sort 
{
	public static void BubbleSort(int[] arr)
	{
		boolean swapped = false;
		int n = arr.length;
		for (int i = 0; i<n-1; i++)
		{
			for (int j = 0; j<n-1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swapped = true;
				}
			}
			if (swapped = false)
			{
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 15;
		int[] arr = new int[n];
		System.out.println("Enter 15 integers :");
		for (int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array before sorting it with bubble sort:");
		for (int i = 0; i<n; i++)
		{
			System.out.println(" \t"+arr[i]);
		}
		BubbleSort(arr);
		System.out.println("The array after sorting it with bubble sort :");
		for (int i = 0; i<n; i++)
		{
			System.out.println(" \t"+arr[i]);
		}
		
	}

}
