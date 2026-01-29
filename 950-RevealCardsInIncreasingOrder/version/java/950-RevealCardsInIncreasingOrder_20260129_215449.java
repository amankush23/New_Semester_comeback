// Last updated: 29/01/2026, 21:54:49
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int n = deck.length;
5        Deque<Integer> queue = new ArrayDeque<>();
6        for(int i=n-1; i>=0; i--) {
7            if(!queue.isEmpty()) {
8                int x = queue.removeLast();
9                queue.addFirst(x);
10            }
11            queue.addFirst(deck[i]);
12        }
13        int[] ans = new int[n];
14        int i=0;
15        for(int x : queue) {
16            ans[i++] = x;
17        }
18        return ans;
19    }
20}