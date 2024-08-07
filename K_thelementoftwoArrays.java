import java.util.Arrays;

class K_thelementoftwoArrays {
    public static  long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int a[]=new int[arr1.length+arr2.length];
        int j=0;
        for(int i :arr1){
            a[j]=i;
            j++;
        }
        for(int i : arr2){
            a[j]=i;
            j++;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(a[6]);
        for(int i=0;i<a.length;i++){
            if(i==(k-1)){
                return a[i];
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int a1[]={2, 3, 6, 7, 9};
        int a2[]={1, 4, 8, 10};
        System.out.println(kthElement(7, a1, a2));

    }
}