// Last updated: 26/01/2026, 22:45:52
1class Solution {
2    public int[] topKFrequent(int[] arr, int k) {
3        ArrayList<Integer> ll = new ArrayList<>();
4        HashMap<Integer, Integer >  map = new HashMap<>();
5        for (int i = 0; i < arr.length; i++) {
6            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
7        }
8        while(k > 0 && !map.isEmpty()){
9            int mf = -1;
10            int maxFreq = Integer.MIN_VALUE;
11            for(int key: map.keySet()){
12                int freq = map.get(key);
13                    if(freq > maxFreq){
14                        maxFreq = freq;
15                        mf = key;
16                    }
17                }
18                ll.add(mf);
19                map.remove(mf);
20                k--;
21        }
22        int[] result = new int[ll.size()];
23        for (int i = 0; i < ll.size(); i++) {
24            result[i] = ll.get(i);
25        }
26        return result;
27    }
28}