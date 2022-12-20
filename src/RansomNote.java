import java.util.HashMap;

public class RansomNote {
    /**
     * Given two strings ransomNote and magazine,
     * return true if ransomNote can be constructed by using the letters from magazine
     * and false otherwise.
     * See the README.md file for more information.
     * Time Complexity = O(m) where m is the ransom note hashmap being compared
     * to the magazine hashmap through one iteration
     * Space Complexity = O(p) where p is two hashmaps consisting of counts from magazine and ransomNote
     *
     * @param ransomNote - Characters needed to create a valid ransom note.
     * @param magazine   - Characters the magazine has to offer.
     * @return returns true if the magazine contains all characters needed to create ransom note.
     */

    public boolean canConstruct(String ransomNote, String magazine) {
        // @TODOd Write the method
        HashMap<Character, Integer> ransomBank = new HashMap<>();
        HashMap<Character, Integer> magazineBank = new HashMap<>();

        for(char c: ransomNote.toCharArray()){
            if(ransomBank.containsKey(c)){
                ransomBank.put(c, ransomBank.get(c) + 1);
            }
            ransomBank.putIfAbsent(c, 1);
        }
        System.out.println("Ransom Note: " + ransomBank);

        for(char c: magazine.toCharArray()){
            if(magazineBank.containsKey(c)){
                magazineBank.put(c, magazineBank.get(c) + 1);
            }
            magazineBank.putIfAbsent(c, 1);
        }
        System.out.println("Magazine: " + magazineBank);

        for(char ch: ransomBank.keySet()){
            System.out.println("R " + ch + " " + ransomBank.get(ch));
            System.out.println("M " + ch + " " + magazineBank.get(ch));
            if(magazineBank.getOrDefault(ch, -1) < ransomBank.get(ch)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        RansomNote rs = new RansomNote();
        String ransomNote1 = "aabbbcc";
         String magazine1 = "aabbbbbccc";
        String ransomNote2 = "a";
        String magazine2 = "b";

        System.out.println(rs.canConstruct(ransomNote1, magazine1));
        System.out.println(rs.canConstruct(ransomNote2, magazine2));
    }
}
