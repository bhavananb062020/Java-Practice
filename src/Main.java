//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String ins = "aaabcdefgabcc";
        char[] input = ins.toCharArray();
        for (int i = 0; i < 4; i++) {
            int alpha = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[j] == 'a' + i) {
                    alpha++;
                }
            }
            System.out.println(alpha + " ");
        }
        }
    }
