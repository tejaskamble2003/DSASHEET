import java.util.Arrays;

public class SumofMiddleelementsoftwosortedarrays {
    public static int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int a[]=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            a[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++){
            a[k]=arr2[i];
            k++;
        }
        Arrays.sort(a);
        int mid=a.length/2;
        return a[mid-1]+a[mid];
    }

    public static void main(String[] args) {
        int arr1[]={1,2,4,6,10};
        int arr2[]={4,5,6,9,12};
        System.out.println(SumofMiddleElements(arr1, arr2));
    }
}