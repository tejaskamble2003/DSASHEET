public class Squarerootofanumber {
    public static long floorSqrt(long n) {
        // Your code here
        long i=1;
        while(true){
            long sqrt=(i*i);
            if(sqrt==n){
                return i;
            }else if(sqrt>n){
                return i-1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        long n=5;
        System.out.println(floorSqrt(n));
    }
}
