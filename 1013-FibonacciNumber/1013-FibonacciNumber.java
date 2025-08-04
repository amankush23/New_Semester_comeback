// Last updated: 8/4/2025, 11:10:49 PM
class Solution {
    public int fib(int n) {
        return fibonacci(n);
    }
    public static int fibonacci(int n ){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) +fibonacci(n-2);
        
    }
}