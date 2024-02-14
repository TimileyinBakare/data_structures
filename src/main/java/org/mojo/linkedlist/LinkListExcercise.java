package org.mojo.linkedlist;

public class LinkListExcercise {

    private Node head;
    private Node tail;
    int length;

    public LinkListExcercise(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }


