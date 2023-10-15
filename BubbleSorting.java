import java.util.*;
public class BubbleSorting {
    public static void sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int[]arr){
        System.out.println("Array :"+" "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr={2,5,7,3,6,8,9};
        printArray(arr);
        sort(arr);
        printArray(arr);
    }
}
