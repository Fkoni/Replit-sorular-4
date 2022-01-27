package _00Replit;

import java.util.Arrays;

public class _00ReplitOdev20arrayMinMaxdeger {

public static void main(String args[]) {
		/*
		 *Input : {3,2,5,4,1,6}

			Output :

			min: 1

			max: 6
		 */
		
	int arr[]= {3,2,5,4,1,6};
	Arrays.sort(arr);
	
	int min=arr[0];
	int max=arr[arr.length-1];
	
		
		System.out.println("min: "+(min));
		System.out.println("max: "+(max));
	}

}

