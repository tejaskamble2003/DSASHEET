public class pno {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("No is perfect");
        }else{
            System.out.println("Not perfect");
        }
    }
}
