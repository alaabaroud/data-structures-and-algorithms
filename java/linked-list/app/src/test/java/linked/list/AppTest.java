/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {


  @DisplayName("this tests for the insertions ")
  @Test
  public void insertionsTests() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.append(1);
    linkedList.append(80);
    linkedList.append(3);
    System.out.println(linkedList);
    Assertions.assertEquals( " {1} ---> {80} ---> {3} --->", linkedList.toString() );

    linkedList.insertBefore(80, 5);
    Assertions.assertEquals( " {1} ---> {5} ---> {80} ---> {3} --->", linkedList.toString() );

    linkedList.insertAfter(80, 5);
    Assertions.assertEquals( " {1} ---> {5} ---> {80} ---> {5} ---> {3} --->", linkedList.toString() );

  }


}
