// Last updated: 27/08/2026, 18:40:06
1import java.util.*;
2
3public class Solution {
4
5    // Returns length of LCS of s1 and s2
6    public int longestCommonSubsequence(String s1, String s2) {
7        if (s1 == null || s2 == null) return 0;
8        int lenA = s1.length();
9        int lenB = s2.length();
10        if (lenA == 0 || lenB == 0) return 0;
11
12        // keep s2 as the shorter one to reduce memory
13        if (lenB > lenA) {
14            String tmpStr = s1; s1 = s2; s2 = tmpStr;
15            int tmp = lenA; lenA = lenB; lenB = tmp;
16        }
17
18        int[] prevRow = new int[lenB + 1];
19        int[] curRow = new int[lenB + 1];
20
21        for (int idxA = 1; idxA <= lenA; idxA++) {
22            char charA = s1.charAt(idxA - 1);
23            for (int idxB = 1; idxB <= lenB; idxB++) {
24                if (charA == s2.charAt(idxB - 1)) {
25                    curRow[idxB] = prevRow[idxB - 1] + 1;
26                } else {
27                    int skipFromA = prevRow[idxB];
28                    int skipFromB = curRow[idxB - 1];
29                    curRow[idxB] = (skipFromA >= skipFromB)? skipFromA : skipFromB;
30                }
31            }
32            // swap rows for next iteration
33            int[] swap = prevRow;
34            prevRow = curRow;
35            curRow = swap;
36            Arrays.fill(curRow, 0);
37        }
38        return prevRow[lenB];
39    }
40
41    // Simple driver for local testing
42    public static void main(String[] args) {
43        Scanner sc = new Scanner(System.in);
44        String a = sc.hasNextLine()? sc.nextLine().trim() : "";
45        String b = sc.hasNextLine()? sc.nextLine().trim() : "";
46        Solution solver = new Solution();
47        System.out.println(solver.longestCommonSubsequence(a, b));
48        sc.close();
49    }
50}