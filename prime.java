import java.util.Scanner;

class prime{
    public static void checkPrime(int n){
        if(n==2 && n==1){
            System.out.println("prime");
        }

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("prime");
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkPrime(n);
        
    }
}