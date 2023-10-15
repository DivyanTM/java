public class InterPolationSearch {
    public static int interpolationSearch(int[]arr,int lo,int hi,int x){
        int pos;
        if(lo<=hi&&x>=arr[lo]&&x<=arr[hi]){
             pos=lo+(((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]));

        if(arr[pos]==x){
            return pos;
        }
        if(arr[pos]<x){
            return interpolationSearch(arr,pos+1,hi,x);
        }
        if(arr[pos]>x){
            return interpolationSearch(arr,lo,pos-1,x);
        }}
        return-1;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int result=interpolationSearch(arr,0,arr.length-1,12);
        if(result!=-1){
            System.out.println("ELEMENT FOUND AT "+result);
        }else{
            System.out.println("ELEMNT NOT FOUND");
        }
    }
}
