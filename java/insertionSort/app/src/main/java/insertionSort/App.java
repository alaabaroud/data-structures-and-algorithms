/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int [] number = {8,9,5};
  System.out.println(Arrays.toString(InsertionSort(number)));

    }


    public static int[] InsertionSort(int[] array) {
      for (int i = 1; i < array.length ; i++) {
        int current = array[i];
        int j = i-1;
        while (j >= 0 && array[j] > current) {
          array[j +1] = array[j];
          j--;
        }
        array[j+1] = current;
      }
      return array;
    }
    }


