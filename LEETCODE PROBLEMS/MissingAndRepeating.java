
import java.util.Arrays;

public class MissingAndRepeating {
    public static int[] findTwoElement(int arr[]) {
        // code here
        int a[]=new int[2];
        Arrays.sort(arr);
        a[0]=0;
        for(int i=1;i<=arr.length-1;i++){
            if(i==arr[i]){
                if(arr[i]==arr[i+1]){
                    a[0]=arr[i];
                }
            }else{
                a[1]=i;
            }
        }
        System.out.println(a[0]);
        if(a[0]==0){
            a[0]=arr.length;
            System.out.println("hello");
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={2,2};
        int a1[]=findTwoElement(a);
        System.out.println(a1[0]);
        System.out.println(a1[1]);
    }
}
