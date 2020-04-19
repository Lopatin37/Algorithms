package L6;


import java.util.Random;

public class Main {
    public static void main(String[] args){
        final int size = 20;
        Tree[] trees = new Tree[size];
        for(int i = 0; i < size; i++) {
            trees[i] = randomFillTree(6);
            System.out.println("Tree " + (i+1) + ": left = " + leftBranchSize(trees[i]) + ", right = " + rightBranchSize(trees[i]));
        }

    }

    public static Tree randomFillTree(int level){
        Random rnd = new Random();
        Tree tree = new Tree();
        int size = (int)Math.pow(2, level) - 1;
        for(int i = 0; i < size; i++) {
            tree.insert((rnd.nextInt() * 200 - 100));
        }
        return tree;
    }

     static int leftBranchSize(Tree tree) {
        int size = 0;
        Node node = tree.root;
        if(tree.root != null) size++;
        while(node.leftChild != null) {
            size++;
            node = node.leftChild;
        }
        return size;
     }

    static int rightBranchSize(Tree tree) {
        int size = 0;
        Node node = tree.root;
        if(tree.root != null) size++;
        while(node.rightChild != null) {
            size++;
            node = node.rightChild;
        }
        return size;
    }

}

