package Array;

public class Rightrotate {

    public static void rightRotateArray(int[] arr,int k) {
        int n = arr.length;
        k = k % n;

        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);

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
        rightRotateArray(arr,3);    //k represents the number of positions by which the elements in the array should be right-rotated.
    }
}
