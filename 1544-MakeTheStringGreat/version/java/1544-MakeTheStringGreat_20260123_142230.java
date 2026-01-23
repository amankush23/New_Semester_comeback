// Last updated: 23/01/2026, 14:22:30
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> stack = new Stack<>();
4        int n = s.length();
5        for(int i = 0; i < n;i++){
6            char ch = s.charAt(i);
7            // if(!stack.isEmpty() && stack.peek()+32 == ch){
8            //     stack.pop();
9            // }
10            // else if(!stack.isEmpty() && stack.peek() == ch+32){
11            //     stack.pop();
12            // }
13            if(!stack.isEmpty() && Math.abs(stack.peek()-ch) == 32){
14                stack.pop();
15            }
16             
17            else{
18                stack.push(ch);
19            }
20        }
21        StringBuilder sb= new StringBuilder();
22        while(stack.size() > 0){
23            sb.insert(0,stack.pop());
24        }
25        return sb.toString();
26
27    }
28}