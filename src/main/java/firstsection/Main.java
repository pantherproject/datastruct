package firstsection;

import java.util.Stack;

/**
 * Created by panther on 17-4-1.
 */
public class Main {
    public static void main(String[] args) {

    }


    /**
     * 递归前序边历
     *
     * @param binNode
     */
    public void preOrder(BinNode<Integer> binNode) {
        if (binNode != null) {
            System.out.println(binNode.getData());
            preOrder(binNode.getLchild());
            preOrder(binNode.getRchild());
        }
    }


    /**
     * 递归中序边历
     *
     * @param binNode
     */
    public void midOrder(BinNode<Integer> binNode) {
        if (binNode != null) {
            midOrder(binNode.getLchild());
            System.out.println(binNode.getData());
            midOrder(binNode.getRchild());
        }
    }


    /**
     * 递归后序边历
     *
     * @param binNode
     */
    public void postOrder(BinNode<Integer> binNode) {
        if (binNode != null) {
            postOrder(binNode.getLchild());
            postOrder(binNode.getRchild());
            System.out.println(binNode.getData());
        }
    }


    /**
     * 非递归前序边历
     *
     * @param binNode
     */
    public void preOrderNonr(BinNode<Integer> binNode) {
        Stack<BinNode<Integer>> stack = new Stack<BinNode<Integer>>();
        if (binNode == null) {
            System.out.println("the tree is empty\n");
        }
        while (binNode != null) {
            System.out.println(binNode.getData());
            stack.push(binNode);
            binNode = binNode.getLchild();
        }
        
    }
}
