/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());



        BinarySearchTree<Integer> BST = new BinarySearchTree<>(7);
      BST.root.left = new Node<>(2);
      BST.root.right = new Node<>(8);
      BST.root.left.right=new Node<>(2);
      BST.Add(1);


      System.out.println("must return true if the int is included, and false if not");
      System.out.println(BST.contains(2,BST.root));

      System.out.println(BST.inOrder(BST.root).toString());
      System.out.println(BST.preOrder(BST.root).toString());


    }




}
