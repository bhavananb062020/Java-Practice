
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


//[1,,2,3,4]
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

    public static boolean palindrome(int num){
        int original = num;
        int reversed = 0;
        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return (original == reversed);
    }

    public static void palindromeString(String name1){
            StringBuilder sb = new StringBuilder(name1).reverse();
            String reversed = sb.toString();

            if(name1.equals(reversed)){
                System.out.println("Palindrom");
            }else {
                System.out.println("Not Palindrom");
            }

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

        System.out.println(palindrome(2002));

        String name1 = "madam";
        palindromeString(name1);


    }
}
