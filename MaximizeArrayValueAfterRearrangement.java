import java.util.Arrays;

public class MaximizeArrayValueAfterRearrangement {
    public static int  Maximize(int arr[]) {
        // Sorting the array
        Arrays.sort(arr);
        int mod = 1000000007;
        long sum = 0;  // Use long to handle larger sums before taking modulo
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + ((long)arr[i] * i) % mod) % mod;
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        int a[]={5, 3, 2, 4, 1};
        System.out.println(Maximize(a));
    }
}

