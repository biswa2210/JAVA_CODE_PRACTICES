// Java program to remove an element
// from a specific index from an array

import java.util.Arrays;
class arraydeletion {
    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {

            System.out.println("Invalid!!!");
            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

}
class arrayinsertion{
    // Function to insert x in arr at position pos
    public static int[] insertion(int n, int[] arr,int x, int pos)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

}

public class Main {



    // Driver Code
    public static void main(String[] args)
    {

        // Get the array
        int[] arr = { 1, 2, 3, 4, 5 };

        // Print the resultant array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Get the specific index
        int index = 2;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arraydeletion eledel=new arraydeletion();
        arr = eledel.removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: " + Arrays.toString(arr));
        arrayinsertion insertele= new arrayinsertion();
        arr=insertele.insertion(arr.length,arr,100,3);
        System.out.println("value 100 inserted at position 3");
        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}
