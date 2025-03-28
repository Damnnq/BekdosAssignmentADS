import java.util.Scanner;  // import scanner for user input

public class Main {
    // recursive function finds the minimum element in the array
    public static int findMinRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0]; // base case: if there's only one element, return it
        }
        return Math.min(arr[n - 1], findMinRecursive(arr, n - 1)); // compares last element with min of rest
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates scanner object
        int[] arr = new int[5]; // array to store 5 numbers

        /* asks user to write 5 numbers */
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt(); // read numbers into the array
        }

        // calling the recursive function and printing the minimum
        System.out.println("Minimum element: " + findMinRecursive(arr, arr.length));

    }
}