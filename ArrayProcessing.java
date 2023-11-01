import java.util.Arrays;

public class ArrayProcessing 
{
    public static void main(String[] args) 
    {
      	// Create an array
      	int[] array = {3, 1, 4, 2};
      
      	// Print the array
      	System.out.println(Arrays.toString(array)); // [3, 1, 4, 2]
      
      	// Sort the array
      	Arrays.sort(array);
      	System.out.println(Arrays.toString(array)); // [1, 2, 3, 4]
      
      	// Check if the array is equal to another array
      	int[] array2 = {1, 2, 3, 4};
      	boolean isEqual = Arrays.equals(array, array2);
      	System.out.println(isEqual); // true
      
      	// Fill the array with a specific value
      	Arrays.fill(array, 0);
      	System.out.println(Arrays.toString(array)); // [0, 0, 0, 0]
      
      	// Copy the array and change its size
      	int[] array3 = Arrays.copyOf(array, 6);
      	System.out.println(Arrays.toString(array3)); // [0, 0, 0, 0, 0, 0]
      
      	// Copy a range of the array
      	int[] array4 = Arrays.copyOfRange(array, 1, 3);
      	System.out.println(Arrays.toString(array4)); // [0, 0]
    }
}
