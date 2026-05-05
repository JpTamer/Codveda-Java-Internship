public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(new Node(10));
        bst.insert(20);
        bst.insert(30);
        bst.insert(5);
        bst.print();
        System.out.println(bst.search(5));
        bst.delete(10);
        bst.print();
        System.out.println(bst.dfsPreOrder());
        System.out.println(bst.dfsInOrder());
        System.out.println(bst.dfsPostOrder());
        System.out.println(bst.bfs());
    }
}
