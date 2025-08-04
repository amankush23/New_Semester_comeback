// Last updated: 8/4/2025, 11:11:48 PM
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        return Intersection(nums1, nums2);
    }

    public static int[] Intersection(int[] a, int[] b) {
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    s.add(a[i]);
                    b[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }

        return s.stream().mapToInt(i -> i).toArray();
    }
}
