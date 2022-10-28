package net.codejava;
import java.util.Random;

public class Main 
{
	public static void main(String[] args) 
	{
		long startT;
		long endT;
		
		Random rand = new Random();
		
		int[] arr = new int[10000];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(10000);
		}
		
		startT = System.currentTimeMillis();
		MergeSort.mergeSort(arr, 0, 9999);
		endT = System.currentTimeMillis();
		
		System.out.println("merge sort time: " + (endT - startT));
		
		startT = System.currentTimeMillis();
		myMerge.myMergeSort(arr, 0, 9999);
		endT = System.currentTimeMillis();
		
		System.out.println("my merge sort time: " + (endT - startT));
	}
}