package net.codejava;

public class myMerge 
{
	public static void myMergeSort(int[] arr, int start, int end)
	{
		int mid = 0;
		if(start < end)
		{
			mid = (start + end) / 2;
			myMergeSort(arr, start, mid);
			myMergeSort(arr, mid + 1, end);
			
			//merging
			int[] sortedArr = new int[arr.length];
			merging(arr, sortedArr, start, mid, end);
		}
	}
	
	public static void merging(int[] arr, int[] sortedArr, int start, int mid, int end)
	{
		int posLeft = start;
		int posRight = mid + 1;
		int count = 0;
		
		//when left array is not empty and right array is also not empty
		while(posLeft <= mid && posRight <= end)
		{
			if(sortedArr[posLeft] <= arr[posRight])
			{
				sortedArr[count] = arr[posLeft];
				posLeft++;
			}
			else
			{
				sortedArr[count] = arr[posRight];
				posRight++;
			}
			count++;
		}
		
		//when left array is empty, but right array is not empty
		while(posLeft > mid && posRight <= end)
		{
			sortedArr[count] = arr[posRight];
			posRight++;
			count++;
		}
		
		//when left array is not empty, but right array is empty
		while(posLeft <= mid && posRight > end)
		{
			sortedArr[count] = arr[posLeft];
			posLeft++;
			count++;
		}
		
		for(int i = 0; i < end - start + 1; i++)
		{
			arr[start + i] = sortedArr[i];
		}
	}
}
