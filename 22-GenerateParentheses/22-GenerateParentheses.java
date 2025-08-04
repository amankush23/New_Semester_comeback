// Last updated: 8/4/2025, 11:13:58 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lt = new ArrayList<>();
        Parenthesis(n, 0, 0, "", lt);
        return lt;
    }    
    public static void Parenthesis(int n, int closed, int open, String ans, List<String> lt){
        if(open == n && closed == n){
            lt.add(ans);
            return;
        }
        if(open > n || closed > open){
            return;
        }
        Parenthesis(n, closed, open+1, ans+"(", lt);
        Parenthesis(n, closed+1, open, ans+")", lt);
    }
}