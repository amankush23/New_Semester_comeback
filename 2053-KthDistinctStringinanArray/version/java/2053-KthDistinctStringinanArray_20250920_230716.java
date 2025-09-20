// Last updated: 9/20/2025, 11:07:16 PM
class Solution {
    public String kthDistinct(String[] arr, int k) {
        int dis = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            
            // check if arr[i] is unique in the whole array
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i].equals(arr[j])) {
                    isDistinct = false;
                    break;
                }
            }
            
            // count distinct strings in order
            if (isDistinct) {
                dis++;
                if (dis == k) {
                    return arr[i];
                }
            }
        }
        
        return "";
    }
}
