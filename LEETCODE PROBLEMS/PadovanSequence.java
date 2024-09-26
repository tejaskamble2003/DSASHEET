public class PadovanSequence {

    public static void printPadovanSeq(int n){
        int a=1,b=1,c=1,d=0;
        System.out.print("Padovan Sequence= "+a+" "+b+" "+c+" ");
        for(int i=3;i<=n;i++){
            d=(a+b)%100000007;
            a=b;
            b=c;
            c=d;
            System.out.print(d+" ");
        }
    }
    public static void main(String [] args){
        int n=1;
        printPadovanSeq(n);
    } 
}
