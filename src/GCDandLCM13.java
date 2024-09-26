public class GCDandLCM13 {

    public static void GCDORLCM(int a,int b) {
        int a1 = a;
        int b1 = b;
        while (b1 !=0){
            int temp = b1;
            b1=a1%b;
            a1=temp;
        }
        System.out.println(a1);
        int lcm = a * b/a1;
        System.out.println(lcm);

    }
    public static void main(String[] args) {
        GCDORLCM(2,4);
    }
}
