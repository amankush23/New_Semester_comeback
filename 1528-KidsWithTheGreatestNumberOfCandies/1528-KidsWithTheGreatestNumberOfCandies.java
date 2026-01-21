// Last updated: 21/01/2026, 11:58:26
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        ArrayList<Boolean> arr = new ArrayList<>();
            for (int element : candies){
                if(element + extraCandies >= maxCandies){
                    arr.add(true);
                }
                else{
                    arr.add(false);
                }
            }
        return arr;
    }
}