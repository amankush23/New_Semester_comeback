// Last updated: 21/01/2026, 12:00:52
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]) return Integer.compare(a[1],b[1]);
            return Integer.compare(b[0],a[0]);
        });
        List<int[]>ll=new ArrayList<>();
        for(int[] per:people)
        {
            ll.add(per[1],per);
        }
        return ll.toArray(new int[people.length][]);
    }
}