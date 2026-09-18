// Last updated: 18/09/2026, 15:04:02
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] array =  new String[nums.length];
4        for(int i=0; i<nums.length; i++){
5            array[i] = String.valueOf(nums[i]);
6        }
7        Arrays.sort(array,(a,b)-> (b+a).compareTo(a+b));
8        if(array[0].equals("0")){
9            return "0";
10        }
11        StringBuilder largest = new StringBuilder();
12        for(int i=0; i<array.length; i++){
13            largest.append(array[i]);
14        }
15        return largest.toString();
16    }
17}