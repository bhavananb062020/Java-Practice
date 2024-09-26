public class FindLargest2 {

    public static int LargestArray(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] arr = {11,2,3,4};
        System.out.println(LargestArray(arr));
    }
}
