package org.mojo;

import org.mojo.linkedlist.AppendExcercise;
import org.mojo.linkedlist.LinkListExcercise;
import org.mojo.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {

        AppendExcercise myLinkedList = new AppendExcercise(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

}