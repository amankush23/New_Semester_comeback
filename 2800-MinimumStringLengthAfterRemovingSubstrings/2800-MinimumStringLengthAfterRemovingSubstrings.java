// Last updated: 17/02/2026, 10:46:35
class Solution {
    public int minLength(String s) {
        // Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        //     if (stack.isEmpty()) {
        //         stack.push(cur_char);
        //         continue;
        //     }
        //     if (cur_char == 'B' && stack.peek() == 'A') {
        //         stack.pop();
        //     }
        //     else if (cur_char == 'D' && stack.peek() == 'C') {
        //         stack.pop();
        //     }
        //     else {
        //         stack.push(cur_char);
        //     }
        // }
        // return stack.size();

        while(s.contains("AB") || s.contains("CD")){
            s = s.replace("AB", "");
            s = s.replace("CD", "");
        }
            return s.length();
        
    }
}