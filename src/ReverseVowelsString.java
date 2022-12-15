import java.util.HashMap;
import java.util.Map;

public class ReverseVowelsString {

    public String ReverseVowelsInString(String str){
        Map<Character, Integer> bank = new HashMap<>();
        bank.put('a',1);
        bank.put('e',2);
        bank.put('i',3);
        bank.put('o',4);
        bank.put('u',5);
        System.out.println(bank);

        int left = 0;
        int right = str.length() - 1;
        System.out.println(right);

        while (left <= right){
//            int mid = left + (right + left) / 2;

            if (bank.containsKey(str.charAt(left)) && bank.containsKey(str.charAt(right))){
                System.out.println("left: " + str.charAt(left) + " right: " + str.charAt(right));
                //TODO: swap the vowels then increment the pointers
                left += 1;
                right -= 1;
            }
            if(!bank.containsKey(str.charAt(left))){
                left += 1;
            }
            if(!bank.containsKey(str.charAt(right))){
                right -= 1;

            }

        }
        return "null";
    }

    public static void main(String[] args) {
        ReverseVowelsString rev = new ReverseVowelsString();

        String str = "hello";
        rev.ReverseVowelsInString(str);
    }
}
