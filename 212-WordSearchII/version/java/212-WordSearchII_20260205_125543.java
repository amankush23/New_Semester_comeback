// Last updated: 05/02/2026, 12:55:43
1class Solution {
2    static List<String> ll ;
3    public List<String> findWords(char[][] board, String[] words) {
4        ll=new ArrayList<>();
5        Trie t = new Trie();
6         for(String s : words){
7            t.insert(s);
8         }
9         for (int i = 0; i < board.length; i++) {
10            for (int j = 0; j < board[0].length; j++) {
11                if(t.root.child.containsKey(board[i][j])){
12                    t.Search(board, i, j, t.root);
13                }
14            }
15         }
16         return ll;
17    }
18    static class Trie {
19
20        class Node {
21            char ch;
22            boolean isTerminal;
23            String word;
24            HashMap<Character, Node> child;
25
26            Node(char ch) {
27                this.ch = ch;
28                this.isTerminal = false;
29                this.word = null;
30                child = new HashMap<>();
31            }
32        }
33
34         Node root = new Node('*');
35
36        public void insert(String word) {
37            Node curr = root;
38            for (int i = 0; i < word.length(); i++) {
39                char ch = word.charAt(i);
40                curr.child.putIfAbsent(ch, new Node(ch));
41                curr = curr.child.get(ch);
42            }
43            curr.isTerminal = true;
44            curr.word = word;
45        }
46
47        public void Search(char[][] board, int i, int j, Node root2) {
48            if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
49                return;
50            }
51            if (board[i][j] == '*' || !root2.child.containsKey(board[i][j])) {
52                return;
53            }
54            char ch = board[i][j];
55            root2 = root2.child.get(ch);
56            if (root2.isTerminal) {
57                ll.add(root2.word);
58                root2.isTerminal = false;
59            }
60            board[i][j] ='*';
61            Search(board, i+1, j, root2);
62            Search(board, i-1, j, root2);
63            Search(board, i, j+1, root2);
64            Search(board, i, j-1, root2);
65            board[i][j] = ch;
66        }
67
68    }
69}