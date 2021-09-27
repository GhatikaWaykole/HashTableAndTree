package com.example.HashTableAndTree;

import java.util.HashMap;
/* create method for the hashtable
* create a Node of the data
 */
public class HashTable<k,v> {
    Node head;
    Node tail;
    //method to get word from the linked list
    public v get(k word){
        Node<k,v> node = searchNode(word);
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
        Node<k,v> node = searchNode(key);
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
public String toString(){
        return  "linkedListNode{" + head + '}';
}
}
