package bagtut_ex;

public class BinNode<T> {
    
    private T value;
    private BinNode<T> left;
    private BinNode<T> right;

    public BinNode(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(T value, BinNode<T> left, BinNode<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setValue(T value){
        this.value = value;
    }

    public void setLeft(BinNode<T> left){
        this.left = left;
    }

    public void setRight(BinNode<T> right){
        this.right = right;
    }

    public T getValue(){
        return this.value;
    }

    public BinNode<T> getLeft(){
        return this.left;
    }

    public BinNode<T> getRight(){
        return this.right;
    }

    public boolean hasLeft(){
        return (this.left != null);
    }

    public boolean hasRight(){
        return (this.right != null);
    }
}
