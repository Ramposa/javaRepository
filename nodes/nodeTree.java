public class nodeTree
{
    private static Nodesa root;

    public nodeTree(int data)
    {
        root = new Nodesa(data);
    }

    public void add(Nodesa parent, Nodesa child, String orientation)
    {
        if (orientation.equals("left"))
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static void main(String args[])
    {
        Nodesa n1 = new Nodesa(1);
        Nodesa n2 = new Nodesa(4);
        Nodesa n3 = new Nodesa(2);
        Nodesa n4 = new Nodesa(5);

        nodeTree tree = new nodeTree(3); //      3
        tree.add(root, n1, "left"); //         1/ \
        tree.add(root, n2, "right"); //            4
        tree.add(n2, n3, "left"); //             2/ \
        tree.add(n2, n4, "right"); //                5
    }
}

class Nodesa {
    private int key;
    private Nodesa left;
    private Nodesa right;

    Nodesa (int key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(Nodesa left) {
        this.left = left;
    }

    public Nodesa getLeft() {
        return left;
    }

    public void setRight(Nodesa right ) {
        this.right = right;
    }

    public Nodesa getRight() {
        return right;
    }

}