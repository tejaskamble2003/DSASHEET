public class abc {
    public static void main(String[] args) {
        int n=121;
        int k=13;
        for(int i=1;i<n;i++){
            int r=i%10;
            int q=i/10;
            if((r+q)==k){
                System.out.println(i);
            }
        }
    }
}
