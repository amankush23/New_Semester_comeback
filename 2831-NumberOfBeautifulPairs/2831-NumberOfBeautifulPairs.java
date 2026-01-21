// Last updated: 21/01/2026, 11:56:40
class Solution {
    public int countBeautifulPairs(int[] nums) {
        return count(nums);
    }
    public int count(int[] arr){
        int count=0;
        for(int i = 0 ; i < arr.length; i++){
            int first = firstDigit(arr[i]);
            for(int j = i+1; j < arr.length; j++){
                int last = arr[j] % 10; 
                if(gcd(first, last)) count++;
            }
        }
        return count;
    }
    public boolean gcd(int a, int b){
        while(a != b){
            if(a > b) a = a-b;
            else b = b -a;
        }
        if(a == 1) return true;
        else return false;
    }
    public int firstDigit(int n){             
        while(n >= 10){
            n /= 10;
        }
        return n;
    }
}