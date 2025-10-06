// Last updated: 10/6/2025, 11:38:39 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>(); 
        String[] directories = path.split("/"); 
        for (String dir : directories) { 
            if (dir.equals(".") || dir.isEmpty()) { 
                continue;
            } else if (dir.equals("..")) { 
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else { 
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); 
    }
}