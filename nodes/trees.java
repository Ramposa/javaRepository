import static java.lang.System.out;

class Nodes { // This class will create Nodes
    int key;
    Nodes left, right; // Indicates direction of Nodes...

    public Nodes (int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTrees {
    Nodes root;

    // Traverse tree
    public void traverseTree(Nodes node) {
        if (node != null) {
            traverseTree(node.left);
            out.print(" " + node.key);
            traverseTree(node.right);

        }
    }

    public static void main(String[] args) {

        // Create an object for the binaryTree...

        BinaryTrees tree = new BinaryTrees();

        // Create node of the trees
        tree.root = new Nodes(1);                   // The root/ the head of the tree.
        tree.root.left = new Nodes(2);              // Node branch off to the left.
        tree.root.right = new Nodes(3);             // Node branches off to the right.
        tree.root.left.left = new Nodes(4);         // Noded will branch off from node 2, and branches to the left.
        tree.root.right.right = new Nodes(5);       // Branches off 3 and will be placed at the far right.
        tree.root.left.left.right = new Nodes(6);   

        /*
        
                    TREE:
                                |tree.root = 1 |
                                /              \
                    |tree.root = 2 |    |tree.root = 3 |
                    /                                   \
            |tree.root = 4 |                    |tree.root = 5 |
                    \
                    |tree.root = 6 |    
        
        */

        // Display binaryTree

        out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root.left.left);


    }

}
