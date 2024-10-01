package Array;

public class leftrotate {

    public static void leftRotateArray(int[] arr,int k) {
        int n = arr.length;
        k = k % n;

        rotate(arr,k,n-1);

        rotate(arr,k,n-1);
        rotate(arr,0,n-1);


        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int[] arr,int start,int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        leftRotateArray(arr,3);
    }
}

