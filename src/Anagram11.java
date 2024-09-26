import java.util.Arrays;

public class Anagram11 {

    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        for(int i=0 ; i < arr1.length ; i++){
           if(arr1[i] != arr2[i]){
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cac";

        System.out.println(isAnagram(str1,str2));

    }
}
