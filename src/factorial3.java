public class factorial3 {

    public static int factorial(int num){
        int sum = 1;
        for(int i= 1;i<=num;i++){
            sum *= i;
        }
        return sum;
    }

    public static int Recursivefactorial(int num){
        if(num == 0){
            return 1;
        }else {
            return num * Recursivefactorial(num -1);
        }


    }


    public static void main(String[] args){
        System.out.println(factorial(3));
        System.out.println(Recursivefactorial(3));
    }
}
