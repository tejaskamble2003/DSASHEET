import java.util.Scanner;

public class SumofLtoR {
    public static void sumLtoR(int l,int R){
        int sum=0;
        for(int i=l;i<=R;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        sumLtoR(L, R);
        
    }
}
