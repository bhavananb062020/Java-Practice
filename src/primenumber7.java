import java.util.ArrayList;
public class primenumber7 {

    public static boolean checkPrime(int num){

        for(int i=2;i<num;i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }

    public static void primenum(int number) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 1;
        while (i <= number ) {
            if (checkPrime(i)) {
                arr.add(i);
            }

            i++;
        }
        System.out.println(arr);

    }


    public static void main(String[] args){
        System.out.println(checkPrime(21));
        primenum(10);
    }
}
