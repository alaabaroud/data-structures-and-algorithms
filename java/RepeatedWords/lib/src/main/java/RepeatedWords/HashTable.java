package RepeatedWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable <F,J>{
  private ArrayList<Node<F, J>> bucketArray;
  public void add(F key, J value) {

    // gets the head of a linked list for a given key
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);

    Node<F, J> head = bucketArray.get(bucketIndex);

    // check if key present
    while (head != null) {
      if (head.getKey().equals(key) && head.getHashCode() == hashCode) { // checks for duplicates
        // if there is a duplicate just overwrite
        head.value = value;
        return;
      }

      // adds to the chain of the linkedlist, by adding to the front
      head = head.getNext();
    }

  public String  repeatedWord(String text){
    String []allWords=text.split(" ");
    int counter =0;
    List<String> repeatedWords=new ArrayList<>();
    Map<String,Integer> repeatedzwordsWithCounter=new HashMap<>();
    for(int i=0;i<allWords.length;i++){
      for (int j=0;j<i;j++){
        if(allWords[i].equals(allWords[j].toLowerCase())){


          if(!repeatedWords.contains(allWords[i].toLowerCase())){
            repeatedWords.add(allWords[i].toLowerCase());
          }

        }

      }
    }
    for(int x=0;x<repeatedWords.size();x++){
      counter=countOccurrences(text,repeatedWords.get(x));
      repeatedzwordsWithCounter.put(repeatedWords.get(x),counter);

    }
//    System.out.println(repeatedzwordsWithCounter);
    return repeatedzwordsWithCounter.toString();
  }
  static int countOccurrences(String str, String word)
  {
    // split the string by spaces in a
    String a[] = str.split(" ");

    // search for pattern in a
    int count = 0;
    for (int i = 0; i < a.length; i++)
    {
      // if match found increase count
      if (word.equals(a[i]))
        count++;
    }

    return count;
  }

  @Override
  public String toString() {
    return "HashTable{" +
      "bucketArray=" + bucketArray +
      '}';
  }
}

}
