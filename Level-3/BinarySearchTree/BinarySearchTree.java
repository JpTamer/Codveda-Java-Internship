import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node curr, int value) {
        if (curr == null) return new Node(value);
        else if (curr.getValue() < value) {
            curr.setRight(insert(curr.getRight(), value));
        } else if (curr.getValue() > value) {
            curr.setLeft(insert(curr.getLeft(), value));
        }
        return curr;
    }

    public void print() {
        print(root);
    }

    private void print(Node curr) {
        if (curr == null) return;
        print(curr.getLeft());
        System.out.print(curr.getValue() + " ");

        print(curr.getRight());
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node curr, int value) {
        if (curr == null) return false;
        if (curr.getValue() == value) return true;
        else if (value < curr.getValue()) {
            return search(curr.getLeft(), value);
        } else {
            return search(curr.getRight(), value);
        }
    }

    public void delete(int value) {
       root = delete(root, value);
    }

    private Node delete(Node curr, int value) {
        if (curr == null) return null;

        if (curr.getValue() == value) {
            if (curr.getLeft() == null && curr.getRight() == null) return null;
            else if (curr.getRight() == null) curr = curr.getLeft();
            else if (curr.getLeft() == null) curr = curr.getRight();
            else {
                int min = minValue(curr.getRight());
                curr.setValue(min);
                curr.setRight(delete(curr.getRight(), min));

            }
        } else if (value < curr.getValue()) {
            curr.setLeft(delete(curr.getLeft(), value));
        } else {
            curr.setRight(delete(curr.getRight(), value));
        }
        return curr;
    }

    private int minValue(Node curr) {
        while (curr.getLeft() != null) {
            curr = curr.getLeft();
        }
        return curr.getValue();
    }

    public ArrayList<Integer> dfsPreOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        class Traverse {
            public Traverse(Node curr) {
                res.add(curr.getValue());
                if (curr.getLeft() != null) {
                    new Traverse(curr.getLeft());
                }
                if (curr.getRight() != null) {
                    new Traverse(curr.getRight());
                }
            }
        }
        new Traverse(root);
        return res;
    }
    public ArrayList<Integer> dfsInOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        class Traverse {
            public Traverse(Node curr) {
                if (curr.getLeft() != null) {
                    new Traverse(curr.getLeft());
                }
                res.add(curr.getValue());
                if (curr.getRight() != null) {
                    new Traverse(curr.getRight());
                }
            }
        }
        new Traverse(root);
        return res;
    }
    public ArrayList<Integer> dfsPostOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        class Traverse {
            public Traverse(Node curr) {
                if (curr.getLeft() != null) {
                    new Traverse(curr.getLeft());
                }
                if (curr.getRight() != null) {
                    new Traverse(curr.getRight());
                }
                res.add(curr.getValue());
            }
        }
        new Traverse(root);
        return res;
    }

    public ArrayList<Integer> bfs(){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)return res;
        Queue<Node> queue = new LinkedList<>();
        Node curr = root;
        queue.add(curr);
        while(!queue.isEmpty()){
            curr = queue.remove();
            res.add(curr.getValue());
            if(curr.getLeft() != null)queue.add(curr.getLeft());
            if(curr.getRight() != null)queue.add(curr.getRight());
        }
        return res;
    }
}

