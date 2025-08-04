// Last updated: 8/4/2025, 11:14:02 PM
class Solution {
    public boolean isValid(String s) {
        return validParentheses(s);
    }
    public static char getVal(Character ch){
        switch(ch){
            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            default : return ' ';
        }
    }
    public static boolean validParentheses(String str){
        String opening = "({[";
        String Closing = "]})";
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(opening.indexOf(ch)!= -1){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                char tmp = st.pop();
                if(getVal(ch) !=tmp){
                    return false;
                }
            }
        }
        return st.size() == 0;

    }
}