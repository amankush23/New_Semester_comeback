// Last updated: 13/09/2026, 13:38:52
1import java.util.Arrays;
2
3class Solution {
4    public int sumOfFlooredPairs(int[] arr) {
5        
6    	int i,j,k,max,n=arr.length;
7    	long sum=0,tot=0;
8    	Arrays.sort(arr);
9    	max=arr[n-1];
10    	int count[]=new int[max+1];
11    	for(i=0;i<n;i++)
12    		count[arr[i]]++;
13    	for(i=1;i<=max;i++)
14    		count[i]+=count[i-1];
15    	for(k=0;k<n;k++)
16    	{
17            if(k>0&&arr[k]-arr[k-1]==0)
18                continue;
19            i=arr[k];
20    		for(j=2;j<=max/i+1;j++)
21    		{
22    			int lower=i*(j-1)-1;
23    			int upper=i*(j)-1;
24    			sum+=(count[Math.min(max, upper)]-count[lower])*(j-1);
25    		}
26    		tot+=sum*(count[i]-count[i-1]);
27            sum=0;
28    	}
29        return (int)(tot%1000000007);
30    }
31}