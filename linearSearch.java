import java.util.Scanner;

public class linearSearch {
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

        linearSearch(array, item); // method call..
    }

    public static void linearSearch(int[] array, int item){

        for(int i = 0; i < array.length; i++){
            if(array[i] == item){
                System.out.println(item + " found at index : " + i);
                return;
            }
        } // end of for loop
        System.out.println("Not Found");
    } // end of linearSearch ()

} // end of linearSearch class


// Time Complexity = O(N)

// Space Complexity= O(N)