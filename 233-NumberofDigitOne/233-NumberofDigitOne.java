// Last updated: 9/1/2025, 11:12:10 PM
class Solution {
    public int countDigitOne(int n) {
        long ans=0, factor=1; 
        while(factor<=n){ long high=n/(factor*10), curr=(n/factor)%10, low=n%factor; ans += (curr==0? high*factor : (curr==1? high*factor+low+1 : (high+1)*factor)); factor*=10; }
        return (int)ans;
    }
}
