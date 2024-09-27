import java.util.ArrayList;
import java.util.HashMap;

public class NonrepeatingeleArray6 {


    public static ArrayList<Integer> nonrepeat(ArrayList<Integer> arr){

        for(int i=0;i<arr.size();i++){

            for(int j=0;j<arr.size();j++){

                if(i!=j && arr.get(i)== arr.get(j)){

                    arr.remove(i);
                    arr.remove(j);

                }
            }

        }
       return arr;
    }

    public static ArrayList<Integer> nonrepeatOptimized(ArrayList<Integer> arr1) {
        // Step 1: Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Count the frequency of each element
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Create a new list to store non-repeating elements
        ArrayList<Integer> result = new ArrayList<>();

        // Step 4: Add elements with frequency 1 to the result list
        for (int num : arr1) {
            if (frequencyMap.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(nonrepeat(arr));

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        System.out.println(nonrepeatOptimized(arr1));
    }
}
