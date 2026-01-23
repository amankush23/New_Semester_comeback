// Last updated: 23/01/2026, 14:29:16
1class Solution {
2    public int minLength(String s) {
3        // Stack<Character> stack = new Stack<>();
4        // for (int i = 0; i < s.length(); i++) {
5        // char ch = s.charAt(i);
6        //     if (stack.isEmpty()) {
7        //         stack.push(cur_char);
8        //         continue;
9        //     }
10        //     if (cur_char == 'B' && stack.peek() == 'A') {
11        //         stack.pop();
12        //     }
13        //     else if (cur_char == 'D' && stack.peek() == 'C') {
14        //         stack.pop();
15        //     }
16        //     else {
17        //         stack.push(cur_char);
18        //     }
19        // }
20        // return stack.size();
21
22        while(s.contains("AB") || s.contains("CD")){
23            s = s.replace("AB", "");
24            s = s.replace("CD", "");
25        }
26            return s.length();
27        
28    }
29}