package practice;

import java.util.Arrays;

public class ArrayEx {

	/*
	 *  3,30,34,5,9
	 */
	
	static int largest(int[] arr, int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }
 
    // Driver code
    static public void main(String[] args)
    {
        int[] arr = { 3,30,34,5,9 };
        int n = arr.length;
       
        // Function call
        System.out.println(largest(arr, n));
    }
}
