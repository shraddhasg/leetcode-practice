package com.shraddha;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        Character current;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (stack.isEmpty()) stack.push(current);
            else if (current == '(' || current == '[' || current == '{') stack.push(current);
            else {
                if (current == ')' && stack.peek() == '(') stack.pop();
                else if (current == ']' && stack.peek() == '[') stack.pop();
                else if (current == '}' && stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        String str = "([]{})";
        System.out.println("Input string = " + str);
        boolean isValidParenthesis = isValid(str);
        System.out.println("Is valid = " + isValidParenthesis);
    }
}




