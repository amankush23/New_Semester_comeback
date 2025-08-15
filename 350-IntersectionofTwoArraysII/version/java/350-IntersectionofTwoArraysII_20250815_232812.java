// Last updated: 8/15/2025, 11:28:12 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    res.add(nums1[i]);
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}