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

    public int getLength() {
        return length;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


}
