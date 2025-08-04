// Last updated: 8/4/2025, 11:08:58 PM
class Solution {
    public String convertDateToBinary(String date) {
        return ConvertDateToBinary(date);
    }
    public static long DecimalToBin(long num) {
        long sum = 0;
        long mul = 1;
        while(num > 0) {
            int remainder =(int) (num % 2);
            sum += remainder*mul;
            mul *= 10;
            num /= 2;
        }
        return sum;

    }

    public static String ConvertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5,7));
        int tarikh = Integer.parseInt(date.substring(8,10));
        return ""+DecimalToBin(year)+"-"+DecimalToBin(month)+"-"+DecimalToBin(tarikh);
    }
    public static void main(String[] args) {
        String date = "1900-02-29";
        System.out.println(ConvertDateToBinary(date));
    }
}