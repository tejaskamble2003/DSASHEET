import java.util.ArrayList;

public class SetMatrixZero{
    public static void setZero(int [][] a){
        ArrayList r=new ArrayList<>();
        ArrayList c=new ArrayList<>();
        int m=a.length;
        int n=a[0].length;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }

        for(int i=0;i<r.size();i++){
            int ind=(int)r.get(i);
            for(int j=0;j<n;j++){
                a[ind][j]=0;
            }
        }
        for(int i=0;i<c.size();i++){
            int ind=(int)c.get(i);
            for(int j=0;j<m;j++){
                a[j][ind]=0;
            }
        }
    } 

    public static void printArray(int [][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int a[][]={{1,1,1},{1,0,1},{1,1,1}};
        printArray(a);
        setZero(a);
        printArray(a);
    }
}