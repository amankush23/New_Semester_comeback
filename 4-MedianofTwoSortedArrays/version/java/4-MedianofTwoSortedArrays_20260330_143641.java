// Last updated: 30/03/2026, 14:36:41
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        int [] mergeSorted = new int[n+m];
6        for(int i = 0 ; i < n;i++){
7            mergeSorted[i] = nums1[i];
8        } 
9        for(int j = 0; j < m; j++){
10           mergeSorted[n+j] =  nums2[j];
11        }
12        Arrays.sort(mergeSorted);
13        int len = mergeSorted.length;
14        int mid = len / 2;
15        if( len % 2 != 0){
16            return mergeSorted[mid];
17        }
18        else{
19            return (mergeSorted[mid-1]+mergeSorted[mid])/2.0;
20        }
21    }
22}