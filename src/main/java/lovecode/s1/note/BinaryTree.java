package lovecode.s1.note;


/**
 * @author : mark
 * @Date : 2021/7/27 上午9:40
 *
 * 二叉树
 */
@SuppressWarnings("unchecked")
public class BinaryTree<E> {
    protected int size; // 元素数量
    protected Node<E> root; // 根节点

    /**
     * 访问器接口 ——> 访问器抽象类
     * 增强遍历接口
     */
	/*public static interface Visitor<E>{
		void visit(E element);
	}*/
    public static abstract class Visitor<E> {
        boolean stop;
        // 如果返回true，就代表停止遍历
        public abstract boolean visit(E element);
    }

    /**
     * 内部类，节点类
     */
    public static class Node<E> {
        E element;      // 元素值
        Node<E> left;   // 左节点
        Node<E> right;  // 右节点
        Node<E> parent; // 父节点

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }

        public boolean isLeaf() { // 是否叶子节点
            return left == null && right == null;
        }

        public boolean hasTwoChildren() { // 是否有两个子节点
            return left != null && right != null;
        }

        public boolean isLeftChild(){ // 判断自己是不是左子树
            return parent!=null && this==parent.left;
        }
        public boolean isRightChild(){ // 判断自己是不是右子树
            return parent!=null && this==parent.right;
        }
        /*
         * 返回兄弟节点
         */
        public Node<E> sibling() { // 红黑树中用到, 返回兄弟节点
            if (isLeftChild()) {
                return parent.right;
            }

            if (isRightChild()) {
                return parent.left;
            }
            return null;
        }
    }

    /**
     * 元素的数量
     */
    public int size() {
        return size;
    }

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 清空所有的元素
     */
    public void clear() {
        root = null;
        size = 0;
    }

    /**
     * 创建节点的方法，用于给AVL树创建节点
     */
    protected Node<E> createNode(E element, Node<E> parent){
        return new Node<>(element, parent); // 默认返回一个通用节点
    }

}
