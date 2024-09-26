
//23 = 2^2 + 3^2 = 23
public class Amstrongnum8 {


    public static boolean checkAmstrong(int num){
        String S = Integer.toString(num);
        int exp = S.length();
        System.out.println(exp);
        int sum = 0;
        int number = num;
        while (number !=0){
            int digit = number % 10;
            sum += Math.pow(digit,exp);
            number/=10;

        }
        return sum == num;
    }
    public static void main(String[] args){
        System.out.println(checkAmstrong(153));

    }
}
