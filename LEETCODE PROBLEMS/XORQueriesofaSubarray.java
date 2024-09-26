class XORQueriesofaSubarray{
    public static void xorQueries(int[] arr, int[][] queries) {
        int i=0;
        int a[]=new int[arr.length];
        int res;
        while(i<queries.length){
            res=0;
            for(int j=queries[i][0];j<queries[i][1];j++){
                res =res | arr[j]|arr[j+1];
            }
            a[i]=res;
            i++;
        }
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,8};
        int queries [][]= {{0,1},{1,2},{0,3},{3,3}};
        xorQueries(arr,queries);
    }
}