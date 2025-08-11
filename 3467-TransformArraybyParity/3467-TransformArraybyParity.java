// Last updated: 8/11/2025, 1:57:35 PM
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] transformArray(int[] nums) {
        int counteven = 0;
        int countodd = 0;
        for(int i  = 0 ; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                countodd++;
            }
            else{
                counteven++;
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0 ;  i < countodd; i++){
            list1.add(1);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0 ;  i < counteven; i++){
            list2.add(0);
        }
        List<Integer> combinedList = new ArrayList<>(list2);
        combinedList.addAll(list1);

        int[] result = new int[combinedList.size()];
        for (int i = 0; i < combinedList.size(); i++) {
            result[i] = combinedList.get(i);
        }

        return result;
    }
}