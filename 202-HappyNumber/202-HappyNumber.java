// Last updated: 8/4/2025, 11:12:31 PM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>(); // Track already seen numbers to detect cycles
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);  // Store the current number
            n = sumOfSquare(n); // Get the sum of squares of digits
        }
        return n == 1; 
        
    }
    public static int sumOfSquare(int n) {
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += (int) Math.pow(digit,2);
            n = n/10;
            }
            return sum;
        }
}