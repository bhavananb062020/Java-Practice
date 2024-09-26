public class VowelORConsonent9 {
    public static boolean isVowel(char a ){
        return a == 'a' || a == 'e' || a ==  'i' || a == 'o' || a == 'u';

    }
    public static void main(String[] args) {
        char a = 'z';
        System.out.println(isVowel( a));
    }
}
