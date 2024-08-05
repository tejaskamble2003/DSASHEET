class KDistictString{
    public static String kthDistinct(String[] arr, int k) {
        int temp,dc=0,p=0,d;
        String dist="";
        String a[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            temp=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    a[p]=arr[i];
                    p++;
                    break;
                }
                d=0;
                for(int p1=0;p1<p;p1++){
                    if(arr[i].equals(a[p1])){
                        System.out.println("Hello");
                        break;
                    }
                    d++;
                }
                System.out.println("P="+p);
                System.out.println("d="+d);
                if(d!=p){
                    break;
                }
                temp++;
            }
            System.out.println(temp);
            if(temp==arr.length-1){
                dist=arr[i];
                dc++;
            }
            if(dc==k){
                return dist;
            }
        }

        return dist;
    }

    public static void main(String args[]){
        String[] str={"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(str, k));
    }
}