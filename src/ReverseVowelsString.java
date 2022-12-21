import java.util.HashMap;
import java.util.Map;

public class ReverseVowelsString {

    public String ReverseVowelsInString(String str){
        Map<Character, Integer> bank = new HashMap<>();
        bank.put('a',0);
        bank.put('e',0);
        bank.put('i',0);
        bank.put('o',0);
        bank.put('u',0);
        bank.put('A',0);
        bank.put('E',0);
        bank.put('I',0);
        bank.put('O',0);
        bank.put('U',0);

        int left = 0;
        int right = str.length() - 1;
        char[] carr = str.toCharArray();

        while (left <= right){

            boolean leftIsVowel = bank.containsKey(carr[left]);
            boolean rightIsVowel = bank.containsKey(carr[right]);

            if (leftIsVowel && rightIsVowel){
//                System.out.println("left: " + carr[left] + " right: " + carr[right]);
                char temp = carr[left];
                carr[left] = carr[right];
                carr[right] = temp;

                left += 1;
                right -= 1;
            }
            if(!leftIsVowel){
                left += 1;
            }
            if(!rightIsVowel){
                right -= 1;
            }
        }
        return new String(carr);
    }


    public static void main(String[] args) {
        ReverseVowelsString rev = new ReverseVowelsString();

        String str1 = "hello";
        String str2 = "leetcode";
        String str3 = "aeiou";
        String str4 = "AbBa";

        System.out.println(rev.ReverseVowelsInString(str1));
        System.out.println(rev.ReverseVowelsInString(str2));
        System.out.println(rev.ReverseVowelsInString(str3));
        System.out.println(rev.ReverseVowelsInString(str4));

    }
}
