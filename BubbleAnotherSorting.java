import java.util.*;
public class BubbleAnotherSorting {
    public static void sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            Boolean swapped=false;
             for(int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     swapped =true;
                 }
             }
             if(!swapped){
                 break;
             }
        }
    }
    public static void printArray(int[]arr){
        System.out.println("ArRAY : "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr={2,5,7,3,6,8,9};
        printArray(arr);
        sort(arr);
        printArray(arr);
    }
}
