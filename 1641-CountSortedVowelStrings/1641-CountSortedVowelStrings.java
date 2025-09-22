// Last updated: 9/23/2025, 12:45:07 AM
class Solution {
    public int countVowelStrings(int n) {
        int a = 1, e = 1, i = 1, o = 1, u = 1;

        while (--n > 0) {
            o += u;
            i += o;
            e += i;
            a += e;
        }

        return a + e + i + o + u;
    }
}