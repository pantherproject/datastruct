package firstsection;

/**
 * Created by panther on 17-4-1.
 */
public class BinNode<T> {
    private T data;
    private BinNode lchild;
    private BinNode rchild;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinNode<T> getLchild() {
        return lchild;
    }

    public void setLchild(BinNode lchild) {
        this.lchild = lchild;
    }

    public BinNode<T> getRchild() {
        return rchild;
    }

    public void setRchild(BinNode rchild) {
        this.rchild = rchild;
    }
}
