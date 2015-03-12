import java.util.Random;
import java.util.Date;


public class BubbleSortBinarySearch 
{
	public static int []fillArray(int n)
	{
		int array[] = new int[n];
		int min = 0, max = n;
		for(int i = 0; i < array.length; i++)
		{
			Random rand = new Random();
			array[i]=rand.nextInt(max-min+1)+min;
		}
		return array;
	}
	public static void print(int a[], int perline)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
			if(i%perline == (perline-1))
				System.out.println("\n");
		}
	}
	public static int max(int a[])
	{
		int amax=a[0];
		for(int i =1; i < a.length; i++)
		{
			if(amax<a[i])
				amax = a[i];
		}
		return amax;
	}
	public static int min(int a[])
	{
		int amin=a[0];
		for(int i =1; i < a.length; i++)
		{
			if(amin>a[i])
				amin = a[i];
		}
		return amin;
	}
	public static int[] markSortA(int a[])
	{
		int temp, nm1=a.length -1, n = a.length;
		long start = System.currentTimeMillis(), stop, duration;
		
		for(int cap = 0; cap < nm1; cap++)
		{
			for(int list = cap + 1; list < n; list++)
			{
				if(a[cap] > a[list])
				{
					temp = a[cap];
					a[cap] = a[list];
					a[list] = temp;
				}
			}
		}
		stop = System.currentTimeMillis();
		duration = stop - start;
		System.out.println("Time: " + duration);
		return a;
	}
	public static int[] bubbleSortA(int a[])
	{
		int temp, n = a.length, iMinusOne;
		long start = System.currentTimeMillis(), stop, duration;
		boolean swapped = false;
		do	
		{
			swapped = false;
			for(int i = 1; i < n; i++)
			{
				iMinusOne = i-1;
					if(a[iMinusOne] > a[i])
					{
						temp = a[i];
						a[i] = a[iMinusOne];
						a[iMinusOne] = temp;
						swapped = true;
				}
			}
			n--;
		}while(swapped == true);
		stop = System.currentTimeMillis();
		duration = stop - start;
		System.out.println("Time: " + duration);
		return a;
	}
		public static int binarySearchA(int a[], int num)
		{
			int mid = 0;
			long total = 0, count = 0, average;
			for(int i = 0; i < 100; i++)
			{
				int max = a.length, min = 0;
				long start = System.currentTimeMillis(), stop, duration;
				boolean found = false;
				Random rand = new Random();
				num = rand.nextInt(max(a)-min(a)+1)+min(a);
				do
				{
					mid = (min + max)/2;
					if(a[mid] == num)
					{
						stop = System.currentTimeMillis();
						duration = stop - start;
						total += duration;
						count++;
						found = true;
					}
					else if(a[mid] < num)
					{
						min = mid+1;
					}
					else
					{
						max = mid-1;
					}
				}while(found == false && max >= min);
			}
			average = total/count;
			System.out.println("Time: " + average);
			return mid;
	}
	public static void main(String[]args)
	{
		//Declare variables
		int size = 3000;
		int searchKey = 17;
		int array1[] = fillArray(size);
		int array2[] = fillArray(size);
		//print(array,10);
		System.out.println("The max = " + max(array1));
		System.out.println("The min = " + min(array1));
		System.out.println("Array length: " + array1.length);
		System.out.println("\nMarkSort");
		markSortA(array1);
		System.out.println("\nBubbleSort");
		bubbleSortA(array2);
		System.out.println("\nBinarySearch");
		binarySearchA(array2, searchKey);

		//print(markSortA(array1), 10);
		//print(bubbleSortA(array2), 10);
	}
}
