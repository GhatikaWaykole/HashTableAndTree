package com.example.HashTableAndTree;

import java.util.ArrayList;
import java.util.HashMap;
/* create method for the hashtable
* create a Node of the data
 */
public class HashTable<k,v> {
    Node head;
    Node tail;
    private final int noOfBucket;
    ArrayList<Node<k,v>> bucketArray;
    public HashTable() {
        this.noOfBucket =10;
        this.bucketArray = new ArrayList<>(noOfBucket);
        for(int i=0;i<noOfBucket;i++){
            this.bucketArray.add(null);
        }
    }

    //method to get word from the linked list
    public v get(k key){
        int index = this.getBucketIndex(key);
        if(this.bucketArray.get(index) == null){
            return null;
        }
        Node<k,v> node = searchNode(key);
        return(node==null) ? null : node.getValue();
    }
    public Node<k,v> searchNode(k word){
        Node<k,v> current = head;
        int pos =0;
        while(current != null){
            pos++;
            if(current.getKey().equals(word)){
                return current;
            }
            current = current.getNext();
        }
        return current;
    }
    //method to add key and the value in the hash table
    public void add(k key, v value){
        int index = this.getBucketIndex(key);
        Node<k,v> node = this.bucketArray.get(index);
        if(node == null){
            node = new Node<>(key,value);
            this.append(node);
        }
        else
            node.setValue(value);
    }
    private void append(Node<k,v>node){
        if(this.head == null){
            this.head = node;
        }
        if(this.tail == null) {
            this.tail = node;
        }
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
}
public int getBucketIndex(k key){
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % noOfBucket;
        return index;
}
public String toString(){
        return  "linkedListNode{" + head + '}';
}
}
