// Last updated: 11/25/2025, 10:34:24 PM
class Solution {
    public String capitalizeTitle(String title)
     {
        String[] words=title.split(" ");
        for(int i=0;i<words.length;i++)
        {
            String w = words[i];
        if (w.length() < 3)
        {
             words[i] = w.toLowerCase();
        } 
        else
        {
            words[i] = w.substring(0,1).toUpperCase() 
                                                                                                 + w.substring(1).toLowerCase();
                                                                                 }
    }
                                                                                 return String.join(" ", words);
}
    }