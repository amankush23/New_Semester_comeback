// Last updated: 8/4/2025, 11:09:24 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return Targetkomara(hours, target);
    }
        public static int Targetkomara(int[] hours, int target){
        int emptarmet = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                emptarmet++;
            }
        }
        return emptarmet;
    }
}