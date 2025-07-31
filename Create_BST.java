class Create_BST {

    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    // Constructor that accepts the array
    public Create_BST(int[] arr) {
        root = CreateBST(arr, 0, arr.length - 1);
    }

    private Node CreateBST(int[] arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateBST(arr, si, mid - 1);
        nn.right = CreateBST(arr, mid + 1, ei);
        return nn;
    }

    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
    Create_BST bst = new Create_BST(arr);
    bst.printInOrder();  // This will print the BST in sorted order
}

    public void printInOrder() {
    printInOrder(root);
}

private void printInOrder(Node node) {
    if (node == null) return;
    printInOrder(node.left);
    System.out.print(node.val + " ");
    printInOrder(node.right);
}
}
