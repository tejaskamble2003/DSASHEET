public class MinMaxElementArray {

    public static void MinMax(int [] a){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Min="+min);
        System.out.println("Max="+max);
    }
    public static void main(String [] args){
        int a[]={-1,-4,5,6,7};
        MinMax(a);

    }
}
