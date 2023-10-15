public class ternarySearch {
    public static int ternarySearch(int[]arr,int l,int r,int x){
        if(r>=l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (arr[mid1] == x) {
                return mid1;
            }
            if (arr[mid2] == x) {
                return mid2;
            }
            if (x < arr[mid1]) {
                return ternarySearch(arr, l, mid1 - 1, x);
            } else if (x > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, r, x);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int result=ternarySearch(arr,0,arr.length-1,1);
        if(result!=-1){
            System.out.println("ELEMENT FOUND AT "+result);
        }else{
            System.out.println("ELEMNT NOT FOUND");
        }
    }
}
