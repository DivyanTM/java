public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr={2,5,7,3,6,8,9};
        BubbleSorting.printArray(arr);
        reverseArray(arr);
        BubbleSorting.printArray(arr);
    }
}