
//a,b,next
public class Fibanacci5 {

    public static void fibonacci(int num){
        int a = 0;
        int b = 1;
        System.out.print(a +" " +b);
        for(int i=1;i<=num;i++){
            int next = a + b;
            a = b;
            b = next;
            System.out.print(" "+next+" ");
        }


    }


    public static int Recursivefibonacci(int num){
        if(num == 1){
            return 0;
        }else if(num ==2){
            return 1;
        }
        return Recursivefibonacci(num-1) + Recursivefibonacci(num-2);
    }

    public static void main(String[] args){
//        System.out.println(Recursivefibonacci(4));

        fibonacci(4);
    }
}
