// Last updated: 8/6/2025, 11:16:33 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultlist = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(resultlist,used,new ArrayList<>(),nums);
        return resultlist;
    }
    public void backtrack(List<List<Integer>> resultList,boolean[] used, ArrayList<Integer> temp,int[] arr){
        if(temp.size() == arr.length){
            resultList.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(used[i]) continue;
            if(i>0 && arr[i] == arr[i-1] && !used[i-1]) continue;
            used[i] = true;
            temp.add(arr[i]);
            backtrack(resultList,used, temp, arr);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

}