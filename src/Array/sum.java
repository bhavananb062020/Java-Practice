package Array;

public class sum {
    public static void sum(int a,int b){
        int[] arr = new int[2];
        int sum = a+b;
        int sub = a-b;
        arr[0] = sum;
        arr[1] = sub;

        printarr(arr);
    }

    public static void printarr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        sum(1,2);


    }
}

