import main.linked_list_impl.BinaryNode;
import main.linked_list_impl.BinaryTreeLL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked-List Implelemtation -->" + "\n");

        BinaryTreeLL bt = new BinaryTreeLL();

        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;

        N2.left = N4;
        N2.right = N5;

        N4.left = N8;
        N4.right = N9;

        N3.left = N6;
        N3.right = N7;

        bt.root = N1;

        System.out.println("PreOrder Traversal Sequence -> ");
        bt.preOrder(bt.root);

        System.out.println("\n" + "InOrder Traversal Sequence -> ");
        bt.inOrder(bt.root);

        System.out.println("\n" + "PostOrder Traversal Sequence -> ");
        bt.postOrder(bt.root);
    }
}
