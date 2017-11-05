package Trees_and_Graphs;


import java.util.LinkedList;

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

    int height(Node head) {
        if (head == null) {
            return 0;
        } else {
            int lheigh = height(head.left);
            int rheigh = height(head.right);

            if (lheigh > rheigh) return lheigh + 1;
            else return rheigh + 1;
        }
    }


    LinkedList printLevels(Node head) {
        LinkedList values = new LinkedList();
        int height = this.height(head);
        for (int i = 0; i <= height; i++) {
            LinkedList list = new LinkedList();
            printLevelNodes(head, i, list);
            values.add(list);
        }
        return values;
    }

    private void printLevelNodes(Node head, int level, LinkedList list) {
        if (head == null) return;
        else if (level == 1) list.add(head.val);
        else {
            printLevelNodes(head.left, level - 1, list);
            printLevelNodes(head.right, level - 1, list);
        }
    }
}
