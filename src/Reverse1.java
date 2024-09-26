
import java.util.Arrays;
import java.util.Collections;

public class Reverse1 {

    public static int reverseNumber(int num){
        int reversed = 0;
        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }



    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        return arr;

    }

    //reverse array using collections
    public static void reverseCollections(int[] arr){
        Collections.reverse(Arrays.asList(arr));
    }


    public static String reverseString(String name){
        String reversed = "";
        for(int i = name.length()-1;i>=0;i--){
            reversed += name.charAt(i);

        }
        return reversed;
    }

    //Using StringBuilder reverse string
    public static String reverseStringBuilder(String name){
        return new StringBuilder(name).reverse().toString();
    }


    public static void main(String[] args){
        System.out.println(reverseNumber(2027));

        int[] arr = {1,2,3,4};
        reverseArray(arr);
        System.out.println("Reversed array: "+Arrays.toString(arr));
        reverseCollections(arr);
        System.out.println("Reversed array: "+Arrays.toString(arr));

        String name = "Bhavana";
        System.out.println(reverseString(name));

        System.out.println(reverseStringBuilder(name));
    }
}
