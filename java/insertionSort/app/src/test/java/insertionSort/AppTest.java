/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void insertionSortTest() {
int [] array = {8,9,5};
assertEquals( "[5, 8, 9]",Arrays.toString(App.InsertionSort(array)));
    }
 }