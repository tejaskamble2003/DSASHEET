/*
 Brief Answer: Maximum Consecutive Steps with Increasing Altitude
Question Summary
The task is to determine the maximum number of consecutive steps one can take on buildings with increasing heights.

Answer
To solve the problem of finding the maximum number of consecutive steps with increasing altitude, we can iterate through the array of building heights and count the steps where the height of the next building is greater than the current one. We maintain a counter for the current sequence of increasing heights and update the maximum count whenever we encounter a decrease or reach the end of the array.
 */

public class RoofTop{
    public static int maxConsecutiveSteps(int [] arr){
        int curr=0;
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                curr++;
            }else{
                max=Math.max(max,curr);
                curr=0;
            }
        }
          // Final check in case the longest sequence ends at the last building
        max=Math.max(max,curr);
        return max;
    }
    public static void main(String [] args){
        int[] arr1 = {1, 2, 2, 3, 2};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(maxConsecutiveSteps(arr1)); // Output: 1
        System.out.println(maxConsecutiveSteps(arr2)); // Output: 3
    }
}