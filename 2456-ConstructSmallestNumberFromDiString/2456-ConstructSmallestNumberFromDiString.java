// Last updated: 8/4/2025, 11:09:42 PM
class Solution {
    public String smallestNumber(String pattern) {
        return Construct_Smallest_Numbers(pattern);
    }
    public static String Construct_Smallest_Numbers(String str){
        int[] ans = new int[str.length() + 1];
        int  c =1;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= str.length(); i++){
            if(i == str.length() || str.charAt(i) == 'I'){
                ans[i] = c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()] = c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
            String s  = "";
            for(int v: ans){
                s +=v;
            
    }
            return s;
        }
}