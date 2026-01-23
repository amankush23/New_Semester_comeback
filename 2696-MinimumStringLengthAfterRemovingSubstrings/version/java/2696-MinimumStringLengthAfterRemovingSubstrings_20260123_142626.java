// Last updated: 23/01/2026, 14:26:26
1class Solution {
2    public int minLength(String s) {
3        Stack<Character> stack = new Stack<>();
4        for (int i = 0; i < s.length(); i++) {
5            char cur_char = s.charAt(i);
6            if (stack.isEmpty()) {
7                stack.push(cur_char);
8                continue;
9            }
10            if (cur_char == 'B' && stack.peek() == 'A') {
11                stack.pop();
12            }
13            else if (cur_char == 'D' && stack.peek() == 'C') {
14                stack.pop();
15            }
16            else {
17                stack.push(cur_char);
18            }
19        }
20        return stack.size();
21    }
22}