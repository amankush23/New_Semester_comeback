// Last updated: 21/01/2026, 12:35:11
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        return FindX(num1, num2);
4    }
5    public static int FindX(int n1 , int n2){
6        int set_bit=0;
7        while(n2>0){
8            n2 = (n2&(n2-1));
9            set_bit++;
10        }
11        int x = 0;
12        for(int i =30; i>=0; i--){
13            int mask = (1 << i);
14            if((n1 & mask)!=0){
15                x|= mask;
16                set_bit--;
17                if(set_bit == 0) return x;
18            }
19        }
20        for (int i = 0; i <= 30; i++) {
21            int mask = (1 << i);
22            if((n1 & mask)==0){
23                x|= mask;
24                set_bit--;
25                if(set_bit == 0) return x;
26            }
27        }
28        return x;
29    }
30}