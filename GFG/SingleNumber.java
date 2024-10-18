/* Brief Answer: Finding the Odd Occurring Element in an Array
Question Summary
Given an array of positive integers where every element appears an even number of times except for one, the task is to identify the element that occurs an odd number of times.

Answer
To solve the problem of finding the number that occurs an odd number of times in an array, we can utilize the properties of the XOR bitwise operation. The XOR of two identical numbers is zero, and the XOR of any number with zero is the number itself. Thus, by XORing all elements in the array, the even occurrences will cancel out, leaving us with the number that appears an odd number of times.
*/


public class SingleNumber {
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2};
        int[] arr2 = {8, 8, 7, 7, 6, 6, 1};
        
        System.out.println("Output: " + findOddOccurrence(arr1)); // Output: 2
        System.out.println("Output: " + findOddOccurrence(arr2)); // Output: 1
    }
}


//This code efficiently finds the odd occurring element with a time complexity of O(n) and an auxiliary space complexity of O(1), making it optimal for this problem.

