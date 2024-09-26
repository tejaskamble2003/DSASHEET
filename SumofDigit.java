import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        // int rem=0;
        // int sum=0;
        int i=1;
        while(i<=n){
            int rem=0;
            int sum=0;
            int temp=i;
            while(temp>0){
                rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            if(sum==k){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
