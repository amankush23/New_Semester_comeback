// Last updated: 8/4/2025, 11:10:11 PM
class Solution {
    public int countTriples(int n) {
        int c = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sum = a * a + b * b;
                int cRoot = (int) Math.sqrt(sum);
                if (cRoot <= n && cRoot * cRoot == sum) {
                    c++;
                }
            }
        }
        return c;
    }
}
