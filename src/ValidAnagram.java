
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false

create a counter for every letter in the first string into a hashmap
iterate over the second string and check
for every letter in the second string found in the hashmap count down
if a value is 0 go ahead and delete the key value pair
if the letter is not in the dictionary then we know it cant be a valid anagram return false

return if the dictionary is empty
if it is we know it's a valid anagram else false

Time Complexity: O(n) where we traverse both strings to validate
Space Complexity: 0(n) we have to create a hashmap for the string length n
*/


import java.util.HashMap;

public class ValidAnagram {

    public boolean ValAnagram(String s, String t){

        HashMap<Character, Integer> bank = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(bank.containsKey(ch)){
                bank.put(ch, bank.get(ch) + 1);
            }
            bank.putIfAbsent(ch, 1);
        }
//        System.out.println(s + " = " +bank);
        for(char ch: t.toCharArray()){
            if(bank.containsKey(ch)){
                bank.put(ch, bank.get(ch) - 1);
            }else{
//                System.out.println("Second string contains a letter not in first string");
                return false;
            }
            if(bank.get(ch) == 0){
                bank.remove(ch);
            }
        }
        return bank.size() == 0;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";

        System.out.println(va.ValAnagram(s1,t1));
        System.out.println(va.ValAnagram(s2,t2));


    }
}
