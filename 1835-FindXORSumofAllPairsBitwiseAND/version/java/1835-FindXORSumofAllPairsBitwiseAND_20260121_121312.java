// Last updated: 21/01/2026, 12:13:12
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        // int xor1 =0;
4        // int xor2 = 0;
5        // for(int a: arr1){
6        //     xor1 ^= a;
7        // }
8        // for(int b: arr2){
9        //     xor2 ^= b;
10        // }
11        // return xor1&xor2;
12        int xor1 = BitwiseXOR(arr1);
13        int xor2 = BitwiseXOR(arr2);
14        return xor1&xor2;
15
16    } 
17    public static int BitwiseXOR(int[] arr){
18        int xor = 0;
19        for(int v: arr){
20            xor ^= v;
21        }
22        return xor;
23    }
24}