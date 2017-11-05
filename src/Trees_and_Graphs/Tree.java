package Trees_and_Graphs;


public class Tree {
    public Node sortedArrayToBST(int[] array) {
        if (array.length == 0) {
            return null;
        }
        
        return sortedArrayToBST(array, 0, array.length - 1);
    }

    Node sortedArrayToBST(int[] array, int start, int end) {

        if (start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(mid);
        root.left = sortedArrayToBST(array, start, mid - 1);
        root.right = sortedArrayToBST(array, mid + 1, end);

        return root;
    }
}
