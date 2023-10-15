import java.util.Arrays;

public class ExponentialSearching {
    public static int exponentialSearch(int[]arr,int x){
        int n=arr.length;
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(i<n&&arr[i]<=x){
            i*=2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,n-1),x);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int result=exponentialSearch(arr,12);
        if(result>0){
            System.out.println("ELEMENT FOUND AT "+result);
        }else{
            System.out.println("ELEMNT NOT FOUND");
        }
    }
}
