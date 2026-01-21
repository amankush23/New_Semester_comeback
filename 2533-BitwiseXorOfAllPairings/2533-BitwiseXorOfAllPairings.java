// Last updated: 21/01/2026, 11:57:01
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        return XorAllNums(nums1, nums2);
    }
    public static  int XorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n % 2 == 0 && m % 2 == 0) return 0;
        int xor1 = BitwiseXor(nums1);
        int xor2 = BitwiseXor(nums2);
        if(n % 2 == 1 && m % 2 == 1) return xor1^xor2;
        else if(n % 2 == 1 ) return xor2;
        else return xor1;
        }
    public static int BitwiseXor(int[] arr){
        int xor = 0;
        for(int v: arr){
            xor ^= v;
        }
        return xor ;
    }
}