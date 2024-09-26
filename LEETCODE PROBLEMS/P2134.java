public class P2134 {
        public static int minSwaps(int[] nums) {
            int start=0;
            int end=nums.length-1;
            int countOnes=0;
            for(int i:nums){
                if(i==1){
                    countOnes++;
                }
            }
            System.out.println("countOnes");
            if(countOnes==0){
                return 0;
            }
            int countZeros;
            int res=Integer.MAX_VALUE;
            for(int i=0;i<=end;i++){
                countZeros=0;
                for(int j=i;j<countOnes;j++){
                    if(nums[j%nums.length]==0){
                        countZeros++;
                    }
                }
                System.out.println(countZeros);
                res=Math.min((countOnes-countZeros),res);
            }
            return res;
        }
    public static void main(String[] args){
        int a[]={0,1,0,1,1,0,0,1};
        System.out.println(minSwaps(a));

    }
}
