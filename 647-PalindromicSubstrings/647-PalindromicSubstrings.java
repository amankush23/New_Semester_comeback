// Last updated: 8/4/2025, 11:11:13 PM
class Solution {
    public int countSubstrings(String s) {
        return Count_Palindromic(s);
    }
    public static int Count_Palindromic(String s){
        int odd = 0;
        //odd length
        for(int axis = 0; axis < s.length(); axis++){
            for(int orbit = 0; axis-orbit>=0 && axis+orbit<s.length(); orbit++){
                if(s.charAt(axis-orbit) != s.charAt(axis+orbit)){
                    break;
                }
                odd++;

            }
        }
        //even length
        int even= 0;

        for(double axis = 0.5; axis < s.length(); axis++){
            for(double orbit = 0.5; axis-orbit>=0 && axis+orbit<s.length(); orbit++){
                if(s.charAt((int)(axis-orbit)) != s.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
        return odd+even;
    }
}