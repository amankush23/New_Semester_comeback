// Last updated: 21/01/2026, 11:58:14
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        return Largest_minimum(position, m);
    }
    public int Largest_minimum(int[] stall, int noc) {
		int lo = 0;
		int hi =stall[stall.length-1]-stall[0];
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(stall,noc, mid)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	public  boolean isitpossible(int[] stall, int noc, int mid) {
		int pos=stall[0];
		int cow=1;
		for (int i = 1; i < stall.length; i++) {
			if(stall[i]-pos>=mid) {
				cow++;
				pos=stall[i];
			}
			if(cow==noc) {
				return true;
			}
		}
		return false;
	}
}