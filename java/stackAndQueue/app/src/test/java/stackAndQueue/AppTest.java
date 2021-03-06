/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  public void push(){
    Stack stack = new Stack();
    stack.push("test1");
    stack.push("test2");
    assertNotEquals("test1", stack.toString());

  }
  @Test
  public void push2() {
    Stack stack2 = new Stack();
    stack2.push("test1");
    stack2.push("test2");
    stack2.push("test3");
    stack2.push("test4");
    System.out.println(stack2.top.value);
    stack2.pop();
    System.out.println("after pop  " + stack2.top.value);

    assertNotEquals("test4", stack2.toString());


  }


  @Test
  public void emptyStack () {
    Stack stackEmpty = new Stack();

    assertTrue(stackEmpty.isEmpty());
  }
@Test
  public void peek () {
    Stack peek = new Stack();
  peek.push("test1");
  peek.push("test2");
  peek.push("test3");
  peek.push("test4");
  assertEquals("test4",peek.peek());
  System.out.println("hereeee peek    " + peek.peek());
}

@Test
  public  void enqueue() {
    Queue enqueue = new Queue();
    enqueue.enqueue("hello");
    enqueue.enqueue("there");
    assertNotEquals("there", enqueue.front);
}
  @Test
  public  void dequeue() {
    Queue dequeue = new Queue();
    dequeue.enqueue("hello");
    dequeue.enqueue("there");
    assertNotEquals("there", dequeue.front);
  }

  @Test
  public void emptyQueue() {
    Queue EmptyQueue = new Queue();
assertTrue(EmptyQueue.isEmpty());  }


  @Test
  public void queuePeek() {
    Queue dequeue = new Queue();
    dequeue.enqueue("hello");
    dequeue.enqueue("there");
    assertEquals("there", dequeue.rear.value);
  }

}

