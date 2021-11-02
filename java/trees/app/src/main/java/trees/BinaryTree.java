package trees;

import java.util.*;

public class BinaryTree<T> {
    Node<T> root;
    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();


    public BinaryTree(T value) {
      this.root = new Node<>(value);
    }

    public BinaryTree() {
    }

    public ArrayList<T> preOrder(Node<T> root) {
      if(root != null) {
        this.preOrderList.add(root.value);
        if ( root.left != null) {
          preOrder(root.left);
        }
        if( root.right != null ) {
          preOrder(root.right);
        }
      }
      return  this.preOrderList;
    }
    public ArrayList<T> inOrder(Node<T> root) {
      if (root != null) {
        if (root.left != null) {
          inOrder(root.left);
        }
        this.inOrderList.add(root.value);
        if (root.right != null) {
          inOrder(root.right);
        }
      }
      return this.inOrderList;
    }

    public ArrayList<T> postOrder(Node<T> root){
      if(root != null){
        if (root.left != null){
          postOrder(root.left);
        }
        if (root.right != null) {
          postOrder(root.right);
        }
        this.postOrderList.add(root.value);
      }
      return this.postOrderList;
    }

    public  ArrayList<Integer> breadth (BinaryTree<Integer> tree) {
      ArrayList<Integer> list = new ArrayList<Integer>();


      Queue<Node> queue = new LinkedList<>();
      if(tree.root != null) {
        queue.add(tree.root);
        while (!queue.isEmpty()){
          Node node = queue.remove();
          list.add((Integer) node.value);
          if(node.left !=null ){
            queue.add(node.left);
          }
          if (node.right != null) {
            queue.add(node.right);
          }
        }
      }
      return list;
    }


    public Integer max() {
      Integer max = 0;
      ArrayList<T> maxlist = preOrder(this.root);
      for (T t : maxlist){
        if ( max< (Integer) t){
          max = (Integer) t;
        }
      }
      return max;
    }
  }






