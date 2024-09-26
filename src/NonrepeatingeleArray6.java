import java.util.ArrayList;

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
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(nonrepeat(arr));
    }
}
