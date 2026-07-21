// Last updated: 21/07/2026, 10:01:44
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int n = piles.length;
4        int left = 1;
5        int right = Arrays.stream(piles).max().getAsInt(); 
6        while(left < right){
7            int mid = left + (right - left) /2 ;
8            if(CanEat(piles, h, mid)){
9                right = mid;
10            }
11            else{
12                left = mid+1;
13            }
14        }
15        return left;
16    }
17    public static  boolean CanEat(int[] arr, int h, int mid){
18        int actualHours = 0;
19        for(int x : arr){
20            actualHours += x / mid;
21            if(x % mid!= 0){
22                actualHours++;
23            }
24        }
25        return actualHours <= h;
26
27    }
28}
29