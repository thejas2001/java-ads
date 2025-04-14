package javaTry;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        for(char c:s.toCharArray()){
            st.push(c);
        }
        while(st.size()>=0){
            Character c= st.pop();
            switch(c){
                case 'a':return true;
            }
        }
        return true;
    }
}
