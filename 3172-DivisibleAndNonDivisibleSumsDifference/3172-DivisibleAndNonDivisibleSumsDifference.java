// Last updated: 8/4/2025, 11:09:19 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int a = 0;
        int b= 0;
        for(int i = 1 ; i < n+1 ; i++){
            if(i % m != 0){
            a += i;
        }
        else{
            b+=i;
            }
        }
        return a-b;
    }
}