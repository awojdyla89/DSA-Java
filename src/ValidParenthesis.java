
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/


/*
create a lookup dictionary
while iterating over the string
 - add all the open parens to the stack
 if we come across a closed parens
 - we check if the stack is not empty and compare the key to the current value
 if it's a match then pop the stack
 return if the stack is empty or not

 Time = O(n) we need to iterate over the string
 Space = O(n) we are adding all the open parens to the stack
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public boolean ValidParens(String s){

        HashMap<Character, Character> bank = new HashMap<>();
        bank.put(']','[');
        bank.put('}','{');
        bank.put(')','(');

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){

            if(bank.containsKey(ch)){
                if(stack.size() != 0 && stack.peek().equals(bank.get(ch))){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.add(ch);
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {

        ValidParenthesis vp = new ValidParenthesis();

        String str1 = "()[]{}";
        String str2 = "(])";
        String str3 = "()";

        System.out.println(vp.ValidParens(str1));
        System.out.println(vp.ValidParens(str2));
        System.out.println(vp.ValidParens(str3));

    }
}
