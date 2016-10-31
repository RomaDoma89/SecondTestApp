package com.example.flexihub.secondtestapp.main;

import com.example.flexihub.secondtestapp.list.DoublyLinkedList;
import com.example.flexihub.secondtestapp.model.DoubleNode;
import com.example.flexihub.secondtestapp.model.IntNode;
import com.example.flexihub.secondtestapp.model.StringNode;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(new DoubleNode(1.2d));
        list.insertFirst(new IntNode(55));
        list.insertFirst(new StringNode("News"));
        list.insertFirst(new StringNode("Banana"));
        list.insertFirst(new DoubleNode(3.0005d));
        list.insertFirst(new IntNode(-44));
        list.insertLast(new StringNode("it's not the end"));
        list.insertLast(new StringNode("the end"));
        list.insertFirst(new StringNode("Hello NODE"));

        System.out.println();
        System.out.println("\nlist size = "+list.size());

        list.printListForward();
        list.printListBackward();

        list.deleteFirst();
        System.out.println();
        System.out.println("delete first node");
        System.out.println("list size = "+list.size());
        list.printListForward();

        while (!list.isEmpty()) {
            list.deleteLast();
            System.out.println();
            System.out.println("delete last node");
            System.out.println("list size = "+list.size());
            list.printListBackward();
        }
    }
}
