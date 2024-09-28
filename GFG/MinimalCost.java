/* 
Question Summary
The problem involves calculating the minimum cost for a Geek to jump across stones, where the cost is determined by the height difference between the stones. The Geek can jump up to k stones ahead, and the goal is to find the least expensive path to the last stone.

Answer
To solve this problem, we can utilize dynamic programming. We will maintain an array dp where dp[i] represents the minimum cost to reach stone i. The transition will involve checking all possible stones that can be jumped to from the current stone, up to k stones ahead. The cost incurred for each jump is the absolute difference in heights between the current stone and the target stone.
*/

public class MinimalCost{
    public static int minCost(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0; // Cost to reach the first stone is 0

        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE; // Initialize with a large value
            for (int j = 1; j <= k && i - j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(arr[i] - arr[i - j]));
            }
        }
        return dp[n - 1]; // Minimum cost to reach the last stone
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 20};
        int k = 3;
        System.out.println(minCost(arr, k)); // Output: 30
    }
}