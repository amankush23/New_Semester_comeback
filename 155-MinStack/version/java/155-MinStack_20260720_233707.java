// Last updated: 20/07/2026, 23:37:07
1class MinStack {
2
3    Stack<Integer> stack;
4    Stack<Integer> minStack;
5
6    public MinStack() {
7        stack = new Stack<>();
8        minStack = new Stack<>();
9    }
10
11    public void push(int val) {
12        stack.push(val);
13
14        if (minStack.isEmpty()) {
15            minStack.push(val);
16        } else {
17            minStack.push(Math.min(val, minStack.peek()));
18        }
19    }
20
21    public void pop() {
22        stack.pop();
23        minStack.pop();
24    }
25
26    public int top() {
27        return stack.peek();
28    }
29
30    public int getMin() {
31        return minStack.peek();
32    }
33}