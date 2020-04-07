public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insertToBst(9);
        bst.insertToBst(10);
        bst.insertToBst(5);
        bst.insertToBst(12);
        bst.insertToBst(8);
        bst.insertToBst(4);
        bst.insertToBst(7);

        bst.preOrder();
    }
}
