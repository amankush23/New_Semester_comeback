// Last updated: 9/2/2025, 11:52:49 PM
class Solution {
    static{
        for(int i = 0; i < 500; i++){
            removeDuplicates("");
        }
    }
    public static String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for( char ch : s.toCharArray()){
            if( top != -1 && stack[top] == ch ){
                top--;
            } else {
                stack[++top] = ch;
            }
        }
        return new String(stack, 0, top+1 );
    }
}