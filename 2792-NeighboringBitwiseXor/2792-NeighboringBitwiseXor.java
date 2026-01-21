// Last updated: 21/01/2026, 11:56:45
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        return DoesValidArrayExist(derived);
    }
    public static boolean DoesValidArrayExist(int[] arr){
        int xor = 0;
        for(int v: arr){
            xor ^= v;
        }
        return xor == 0;
    }
}