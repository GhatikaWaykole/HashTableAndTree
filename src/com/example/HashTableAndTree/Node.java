package com.example.HashTableAndTree;

public class Node <k,v>{
    k key;
    v value;
    Node<k,v>next;

    public Node(k key, v value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public Node<k, v> getNext() {
        return next;
    }

    public void setNext(Node<k, v> next) {
        this.next = (Node<k,v>)next;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("node{" + "key=").append(key).append("value =").append(value).append('}');
        if(next != null){
            stringBuilder.append("->").append(next);
        }
        return stringBuilder.toString();
    }
}
