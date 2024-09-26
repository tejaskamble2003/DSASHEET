
import java.util.Arrays;


class RangeSumSortedSubarray {
    public  static int rangeSum(int[] nums, int n, int left, int right) {
        int a[]=new int[(n*(n+1))/2];
        int v=0,sum;
        System.out.println(a.length);
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                sum=0;
                for(int k=i;k<j;k++){
                    sum+=nums[k];
                }
                a[v]=sum;
                v++;
            }
        }
        int res=0;
        for(int i: a){
            System.out.println(i);
        }
        Arrays.sort(a);
        for(int i=left-1;i<right;i++){
            res=(res+a[i]);
        }
        return res;
    }

    public static void main(String[] args){
        int input[]= {1,2,3,4};
        int n = 4, left = 1, right = 5;
        System.out.println(rangeSum(input,n,left,right));
        
    }

}