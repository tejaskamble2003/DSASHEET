public class CelibrityProblem {
    // Function to find if there is a celebrity in the party or not.
    public static  int celebrity(int mat[][]) {
        // code here
        if(mat[0].length==2){
            return -1;
        }
        int celibrity=0;
        int j,count;
        for(int i=0;i<mat.length;i++){
            count=0;
            for(j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    count++;
                }
            }
            System.out.println(count);
            System.out.println(mat[0].length);
            if(count==mat[0].length){
                celibrity++;
            }
        }
        return celibrity;
    }

    public static void main(String[] args){
        int a[][]={
            {0,1,0},
            {0,0,0},
            {0,1,0}
        };
        System.out.println(celebrity(a));
    }
}