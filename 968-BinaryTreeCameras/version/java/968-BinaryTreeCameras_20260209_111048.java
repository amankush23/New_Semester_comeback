// Last updated: 09/02/2026, 11:10:48
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    
18    public int minCameraCover(TreeNode root) {
19        int c = minCamera(root);
20        if(c == -1){
21            Camera++;
22        }
23        return Camera;
24    }
25    int Camera=0;
26        public int minCamera(TreeNode root){
27            if(root == null){
28                return 0;
29            }
30            int left = minCamera(root.left);
31            int right = minCamera(root.right);
32            if(left ==-1 || right == -1){ //is node pr camera ki need hai
33                Camera++;
34                return 1; //camera setup kra h is node pr
35            }
36            if(left ==1 || right ==1){ //inme se kisi ek ke pas ya dono ke pas or ek ke pas camera hai and doosara wala covered hai
37                return 0; //iska matlb  mei covered hu
38            }
39            else{
40                return -1; // need a camera
41            }
42        }
43}