public class BST {
    private Node root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insertToBst(Integer value) {
        if (isEmpty()) {
            this.root = new Node(value);
            System.out.println("Insert Successfully!");
        } else {
            insertNode(this.root, value);
            System.out.println("Insert Successfully!");
        }
    }

    public Node insertNode(Node root, Integer value) {
        Node temp = null;
        Integer rootValue = root.getValue();

        if (rootValue >= value) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(value));
                return root.getLeft();
            } else {
                temp = root.getLeft();
            }
        } else if (root.getRight() == null){
            root.setRight(new Node(value));
            return root.getRight();
        } else {
            temp = root.getRight();
        }
        return insertNode(temp,value);
    }

    public void doPreOrder(Node root){
        if (root == null){
            return;
        }else {
            System.out.print(root.getValue() + " ");
            doPreOrder(root.getLeft());
            doPreOrder(root.getRight());
        }
    }

    public void preOrder(){
        doPreOrder(this.root);
    }
}
