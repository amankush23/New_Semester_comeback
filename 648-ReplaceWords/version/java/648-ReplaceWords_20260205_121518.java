// Last updated: 05/02/2026, 12:15:18
1class Solution {
2    public String replaceWords(List<String> Dictionary, String sentence) {
3        Trie t = new Trie();
4        for (String s : Dictionary) {
5            t.insert(s);
6        }
7        String[] arr = sentence.split(" ");
8        StringBuilder sb = new StringBuilder();
9        for (int i = 0; i < arr.length; i++) {  
10            String get = t.search(arr[i]);
11            sb.append(get).append(" ");
12        }
13
14        return sb.toString().trim();
15    }
16    static class Trie {
17
18        class Node {
19            char ch;
20            boolean isTerminal;
21            HashMap<Character, Node> child;
22
23            Node(char ch) {
24                this.ch = ch;
25                this.isTerminal = false;
26                child = new HashMap<>();
27            }
28        }
29
30        private Node root = new Node('*');
31
32        public void insert(String word) {
33            Node curr = root;
34            for (int i = 0; i < word.length(); i++) {
35                char ch = word.charAt(i);
36                curr.child.putIfAbsent(ch, new Node(ch));
37                curr = curr.child.get(ch);
38            }
39            curr.isTerminal = true;
40        }
41
42       
43        public String search(String word) {
44            Node curr = root;
45            StringBuilder prefix = new StringBuilder();
46
47            for (int i = 0; i < word.length(); i++) {
48                char ch = word.charAt(i);
49
50                if (!curr.child.containsKey(ch)) {
51                    return word;
52                }
53
54                curr = curr.child.get(ch);
55                prefix.append(ch);
56
57                if (curr.isTerminal) {   // FIX 4
58                    return prefix.toString();
59                }
60            }
61            return word;
62        }
63    }
64}