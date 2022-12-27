public class ValidPalindrome {

    /**
     * Checks if it's a palindrome (remove all non-alphanumeric chars
     * and convert all letters to losercase)
     *
     * @param s a String
     * @return a boolean if the string is a palindrome or not
     */
    public boolean isPalindrome(String s) {
        // @TODOd Write the method
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome pal = new ValidPalindrome();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "aba";
        String s4 = " ";
        String s5 = "a bA";
        String s6 = "ab";
        System.out.println(pal.isPalindrome(s1));
        System.out.println(pal.isPalindrome(s2));
        System.out.println(pal.isPalindrome(s3));
        System.out.println(pal.isPalindrome(s4));
        System.out.println(pal.isPalindrome(s5));
        System.out.println(pal.isPalindrome(s6));
    }
}
