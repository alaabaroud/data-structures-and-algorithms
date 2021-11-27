/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void hashTable() {

    HashTable<Object, Object> Table = new HashTable<>();
    Table.add("hello", 5);
    Table.add("from", 7);
    Table.add("hash", 8);
    Table.add("table", 2);
    System.out.println(Table);
    assertEquals(6, Table.hash("Test"));

    assertEquals(" [ {from:7} ] ", Table.printOneBucket("Test"));
    assertEquals("HashTable{hashTable=[ [ {table:2} {hash:8} ] , null,  [ {hello:5} ] , null, null, null,  [ {from:7} ] , null, null, null]}", Table.toString());
    assertEquals(5, Table.get("hello"));
    assertNull(Table.get("null"));


  }
}
