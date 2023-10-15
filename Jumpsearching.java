public class Jumpsearching {
    public static int jumpSearch(int[]arr,int x){
        int prev=0;
        int n=arr.length;
        int step=(int)Math.floor(Math.sqrt(n));
        for(int minStep=Math.min(step,n)-1;arr[minStep]<x;minStep=Math.min(step,n)-1){
            prev=step;
            step+=(int)Math.floor(Math.sqrt(n));
            if(prev>n){
                return -1;
            }
        }
        while(arr[prev]<x){
            prev++;
            if(prev==Math.min(step,n)){
                return -1;
            }
        }
        if(arr[prev]==x){
            return prev;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        int result=jumpSearch(arr,8);
        if(result==-1){
            System.out.println("ELEMENT NOT FOUND");
        }else{
            System.out.println("ELEMENT FOUND AT "+result);
        }
    }
}
