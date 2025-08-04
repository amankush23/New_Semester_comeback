// Last updated: 8/4/2025, 11:10:24 PM
class Solution {
    public int minOperations(int n) {
        int mid = n/2;
        return mid*(mid+n%2);
    }
}