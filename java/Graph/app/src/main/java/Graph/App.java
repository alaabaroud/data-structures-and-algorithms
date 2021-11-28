/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph;

public class App {

    public static void main(String[] args) {
      Graph<String> appGraph = new Graph<String>();

      appGraph.addNode("hello");
      appGraph.addNode("from");
      appGraph.addNode("alaa");
      appGraph.addNode("graph");

      appGraph.addEdge("hello","1");
      appGraph.addEdge("alaa","9000");



      System.out.println(appGraph);
      System.out.println(appGraph.getNodes());
      System.out.println(appGraph.getNeighbors("hello"));
      System.out.println(appGraph.getNeighbors("alaa"));


      System.out.println(appGraph.size());



    }
}
