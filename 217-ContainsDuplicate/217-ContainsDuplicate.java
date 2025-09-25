// Last updated: 9/25/2025, 10:37:52 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > 1){
                return true;
            }
        }
        return false;
    }
}