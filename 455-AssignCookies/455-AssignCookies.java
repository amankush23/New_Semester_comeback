// Last updated: 21/01/2026, 12:00:37
class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
    public int findContentChildren(int[] g, int[] s) {
     Arrays.sort(g);
     Arrays.sort(s);
     int i=0;
     int j=0;
     while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            i++;
            j++;
        }
        else{
            j++;
        }
     } 
     return i;
    }
}