// Last updated: 8/4/2025, 11:09:58 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return FinalValue(operations);
    }
        public static int FinalValue(String[] arr){
        int n = arr.length;
        int X = 0;
            for(int i = 0; i < n; i++){
                if(arr[i].equals("++X") || arr[i].equals("X++")){
                    X++;
                }
                else{
                    X--;
                }
            }
            return X;
        }
}