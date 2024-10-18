/* 
Brief Answer: Count Number of Maximum Bitwise-OR Subsets
Question Summary
The task is to determine the maximum possible bitwise OR of a subset from a given integer array and count the number of distinct non-empty subsets that yield this maximum OR.

Answer
To solve the problem of counting the number of maximum bitwise-OR subsets, we can follow these steps:

Calculate the Maximum Bitwise OR: Iterate through the array to compute the maximum bitwise OR value of all elements.
Count Subsets: Use a recursive approach or bit manipulation to count all non-empty subsets that achieve this maximum OR.
Here is a sample Java implementation:
 */

public class CountNumberofMaximumBitwiseORSubsets {
    public static void main(String[] args) {
        int[] nums = {3, 1};
        System.out.println(countMaxOrSubsets(nums)); // Output: 2
    }

    public static int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num; // Calculate maximum bitwise OR
        }

        return countSubsets(nums, 0, 0, maxOr);
    }

    private static int countSubsets(int[] nums, int index, int currentOr, int maxOr) {
        if (index == nums.length) {
            return currentOr == maxOr ? 1 : 0; // Count valid subset
        }
        // Include current element
        int include = countSubsets(nums, index + 1, currentOr | nums[index], maxOr);
        // Exclude current element
        int exclude = countSubsets(nums, index + 1, currentOr, maxOr);
        return include + exclude; // Total valid subsets
    }
}
//This code effectively calculates the maximum bitwise OR and counts the subsets that achieve this value, ensuring a comprehensive solution to the problem.

