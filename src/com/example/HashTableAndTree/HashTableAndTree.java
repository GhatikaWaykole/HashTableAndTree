package com.example.HashTableAndTree;

import javax.xml.soap.Node;
import java.util.HashMap;

public class HashTableAndTree {
    public static void main(String args[]) {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable<String, Integer> hashtable = new HashTable<>();
        String[] words = sentence.toLowerCase().split("");
        for (String word : words) {
            Integer count = hashtable.get(word);
            if(count == null){
                count = 1;
            }
            else {
                count = count+1;
                hashtable.add(word,count);
            }
        }
        System.out.println(hashtable);
    //    int frequency = hashtable.get("to");
      //  System.out.println(hashtable);
      //  Assert.assertEquals(2,frequency);
    }
}
