// Last updated: 12/4/2025, 11:44:07 PM
1class Solution {
2    public int maxProduct(String[] words) {
3        int n = words.length;
4        int[] masks = new int[n];
5        
6        for (int i=0; i<n; i++)
7            for (char c: words[i].toCharArray())
8                masks[i] |= (1 << (c - 'a'));
9        
10        int largest = 0;
11        for (int i=0; i<n-1; i++) 
12            for (int j=i+1; j<n; j++) 
13                if ((masks[i] & masks[j]) == 0) 
14					largest = Math.max(largest, words[i].length() * words[j].length());
15        
16        return largest;
17    }
18}