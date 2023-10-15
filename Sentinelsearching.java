import java.util.*;
public class Sentinelsearching {
    public static void sentinelSearch(int[]arr,int key){
        int n=arr.length;
        int last=arr[n-1];
        arr[n-1]=key;
        int i=0;
        while(arr[i]!=key){
            i++;
        }
        arr[n-1]=last;
        if(i<n-1||arr[n-1]==key){
            System.out.println("GIVEN ARRAY "+Arrays.toString(arr));
            System.out.println("ELEMENT PRESENT AT "+i);
        }
       else{
            System.out.println("ELEMENT NOT FOUnD");
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,};
        sentinelSearch(arr,1);
    }
}
