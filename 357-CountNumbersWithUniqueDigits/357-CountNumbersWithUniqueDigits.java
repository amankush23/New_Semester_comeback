// Last updated: 8/4/2025, 11:11:46 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return countnum(n);
    }
    public static int countnum(int n ){
        int pow = (int)Math.pow(10, n);
        int count = 0 ;
        for(int i =  0; i < pow; i++){
            if(isUnique(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isUnique(int n){
        boolean[] visited = new boolean[10];
        while(n > 0){
            int digit = n % 10;
            if(visited[digit]){
                return false;
            }
            visited[digit] = true;
            n = n/10;
        }
        return true;

    }
}