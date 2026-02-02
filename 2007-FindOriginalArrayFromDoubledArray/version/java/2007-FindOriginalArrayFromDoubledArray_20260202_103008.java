// Last updated: 02/02/2026, 10:30:08
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        if(changed.length == 1){
4            return new int[]{};
5        }
6        Arrays.sort(changed);
7        List<Integer> ans = new ArrayList<>();
8        Queue<Integer> q = new ArrayDeque<>();
9
10        for(int i = 0; i < changed.length; i++){
11            if(q.size() > 0 && q.peek() == changed[i]){
12                q.remove();
13            }else{
14                ans.add(changed[i]);
15                q.offer(changed[i] * 2);
16            }
17        }
18        if(q.size() > 0){
19            return new int[]{};
20        }
21
22        int arr[] = new int[ans.size()];
23        for(int i = 0; i < ans.size(); i++){
24            arr[i] = ans.get(i);
25        }
26        return arr;
27    }
28}