class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultlist = new ArrayList<>();
        backtrack(resultlist,new ArrayList<>(),nums);
        return resultlist;

    }
    public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> temp,int[] arr){
        if(temp.size() == arr.length){
            resultList.add(new ArrayList<>(temp));
            return;
        }
        for(int number : arr){
            if(temp.contains(number))
                continue;
            temp.add(number);
            backtrack(resultList, temp, arr);
            temp.remove(temp.size()-1);
        }
    }
    
}
