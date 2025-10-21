// Last updated: 10/21/2025, 10:07:12 PM
class Solution {
    public String removeDuplicates(String s, int k) {
        return removeDuplicate(s, k);
    }
    public String removeDuplicate(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!charStack.isEmpty() && charStack.peek() == ch) {
                countStack.push(countStack.pop() + 1);
            } else {
                charStack.push(ch);
                countStack.push(1);
            }

            if (countStack.peek() == k) {
                charStack.pop();
                countStack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            int count = countStack.pop();
            char ch = charStack.pop();
            for (int i = 0; i < count; i++) {
                sb.insert(0, ch);
            }
        }

        return sb.toString();
    }
}