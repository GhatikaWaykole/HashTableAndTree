package com.example.HashTableAndTree;

import java.util.HashMap;
public class HashTable<k,v> {
    k key;
    v value;
    private class Node{
        int data;
        Node next;
        public Node(int d) {
            data = d;
            next = null;
        }

    }
    HashTable<k,v>next;

    public HashTable(k key, v value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MyMapNode{" + "k").append(key).append(" v=").append(value).append('}');
        if(next != null){
            stringBuilder.append("->").append(next);
        }
        return stringBuilder.toString();
    }
}
