// Last updated: 8/4/2025, 11:09:40 PM
class Solution {
    public int partitionString(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char i : s.toCharArray()){
            if(set.contains(i)){
                count++;
                set = new HashSet<>();
                set.add(i);
            }
            else{
                set.add(i);
            }
        }
        if(!set.isEmpty()) count++;
        return count;
    }
}