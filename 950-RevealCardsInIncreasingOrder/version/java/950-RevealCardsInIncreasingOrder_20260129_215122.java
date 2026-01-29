// Last updated: 29/01/2026, 21:51:22
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int n = deck.length;
5        Deque<Integer> queue = new ArrayDeque<>();
6
7        for(int i=n-1; i>=0; i--) {
8            if(!queue.isEmpty()) {
9                int x = queue.removeLast();
10                queue.addFirst(x);
11            }
12            queue.addFirst(deck[i]);
13        }
14
15        int[] ans = new int[n];
16        int i=0;
17        for(int x : queue) {
18            ans[i++] = x;
19        }
20
21        return ans;
22    }
23}