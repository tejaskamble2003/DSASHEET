import java.util.*;
class Maxsubarraysum {
    public static int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                cnt++;
            }
        }
        if(cnt==nums.length){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }

        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentsum+=nums[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }

    public static void main(String args[]){
        int a[]={1,2,-1};
        System.out.println(maxSubArray(a));
        for (int i : a) {
            System.out.println(i);
        }
    }
}
