// Last updated: 10/29/2025, 9:53:24 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        return AC(asteroids);
    }
    public int[] AC(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int sum = a + stack.peek();

                if (sum < 0) {
                    stack.pop();

                } else if (sum > 0) {
                    a = 0;

                } else {
                    stack.pop();
                    a = 0;
                }

            }
            if (a != 0)
                stack.push(a);

        }
        int arr[] = new int[stack.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}