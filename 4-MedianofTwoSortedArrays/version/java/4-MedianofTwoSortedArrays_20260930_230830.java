// Last updated: 30/09/2026, 23:08:30
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n = nums1.length, m = nums2.length;
4        int[] arr = new int[nums1.length + nums2.length];
5        int i = 0, j = 0, idx = 0;
6        while(i < n  && j < m){
7            if(nums1[i] < nums2[j]){
8                arr[idx++] = nums1[i];
9                i++;
10            }
11            else {
12                arr[idx++] = nums2[j];
13                j++;
14            }
15        }
16        while(i < n){
17            
18                arr[idx++] = nums1[i];
19                i++;
20            
21        }
22        while(j < m){
23            
24                arr[idx++] = nums2[j];
25                j++;
26            
27        }
28        int mid = arr.length /2;
29        if(arr.length  % 2 != 0){
30            return arr[mid];
31        }
32        return (arr[mid]+ arr[mid-1])/2.0;
33        
34
35    }
36}
37