import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking the size of the array as input from the user
        System.out.print("Enter the size of the Array : ");
        int sizeOfArray = sc.nextInt();
        int array[] = new int[sizeOfArray];

        System.out.print("Enter the elements into the Array : ");
        // taking the array as input from the user
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = sc.nextInt();
        } // end of for loop

        System.out.print("Enter the Element to search in the Array : ");
        // taking the item to be searched as input from the user
        int item = sc.nextInt();

//        int position = binarySearch(array, 0, array.length - 1, item); // method call..

//        if(position == -1){
            System.out.println("Element not found");
//        } else{
//            System.out.println("The value " + item + " found at position " + position);
        }
    }

    // Recursive Approach
  /*  public static int binarySearch(int arr[], int left, int right, int item){

        if(right >= left){
            int middle = left + (right - left) / 2;

            if(item == arr[middle]){
                return middle;
            }

            // if the element to find is less than middle element
            if(item < arr[middle]){
                return binarySearch(arr, left, middle-1, item);
            }
            // if the element to find is larger than middle element
            else{
                return binarySearch(arr, middle+1, right, item);
            }
        }
        else{
            return -1;
        }
    } // end of binarySearch()
} // end of binarySearch class */

// Time Complexity : O(N*logN)
// Space Complexity : O(N)


// Iterative Approach
    /* public static int binarySearch(int arr[], int left, int right, int item){

        while(left <= right){
            int middle = left + (right - left) / 2;

            if(arr[middle] == item){
                return middle;
            }

            // if the element to find is less than middle element
            if(arr[middle] < item){
                left = middle + 1;
            }

            // if the element to find is larger than middle element
            else {
                right = middle - 1;
            }
        } // end of while loop
        return -1;
    } // end of binarySearch()
} // end of binarySearch class */


// Time Complexity : O(N)
// Space Complexity : O(1)
