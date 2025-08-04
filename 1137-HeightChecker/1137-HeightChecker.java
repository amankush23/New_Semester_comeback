// Last updated: 8/4/2025, 11:10:47 PM
class Solution {
    public int HeightChecker(int[] heights) {
        return heightChecker(heights);
    }
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] sortArray = new int[heights.length];
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < sortArray.length; i++) {
            if(sortArray[i] != heights[i]) count++;
        }
        return count;
    }
    
}