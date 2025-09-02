// Last updated: 9/2/2025, 11:23:43 PM
class Solution {
    public int calPoints(String[] operations) {
        int[] records = new int[operations.length];
        int pointer = 0;
        
        int sum = 0;

        for (String s : operations) {

            if (s.equals("+")) {
                records[pointer] = records[pointer - 1] + records[pointer - 2];
                pointer++;
            } else if (s.equals("D")) {
                records[pointer] = records[pointer - 1] * 2;
                pointer++;
            } else if (s.equals("C")) {
                records[--pointer] = 0;
            } else {
                records[pointer++] = Integer.parseInt(s);
            }
        }

        for (int rec : records) {
            sum += rec;
        }

        return sum;
    }
}