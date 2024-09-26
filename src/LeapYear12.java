public class LeapYear12 {

    public static boolean Checkleap(int year) {
        return (year % 4==0 && year % 100 != 0) || (year % 400 ==0);

    }
    public static void main(String[] args) {
        System.out.println(Checkleap(2024));
    }
}
