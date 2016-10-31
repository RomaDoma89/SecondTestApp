package com.example.flexihub.secondtestapp.list;

import com.example.flexihub.secondtestapp.model.Node;

/**
 * Created by Roman Zahorui on 29.10.2016.
 */
public class DoublyLinkedList {
    private int nodesCount = 0;
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Node node) {
        if (isEmpty()) last = node;
        else first.setPrev(node);

        node.setNext(first);
        first = node;
        nodesCount++;
    }
    public void deleteFirst() {
        if (!isEmpty()) {
            if (null == first.getNext()) last = null; //if the list contains only one node
            else first.getNext().setPrev(null);
            first = first.getNext();
            nodesCount--;
        }
    }

    public void insertLast(Node node) {
        if (isEmpty()) first = node;
        else {
            last.setNext(node);
            node.setPrev(last);
        }
        last = node;
        nodesCount++;
    }
    public void deleteLast() {
        if (!isEmpty()) {
            if (null == first.getNext()) first = null;
            else last.getPrev().setNext(null);
            last = last.getPrev();
            nodesCount--;
        }
    }

    public void printListForward() {
        System.out.println();
        if (!isEmpty()) {
            System.out.print("list forward : [ ");
            Node current = first;
            while (null != current) {
                current.printData();
                current = current.getNext();
            }
            System.out.print("]");
        } else System.out.print("list is empty");
        System.out.println();
    }

    public void printListBackward() {
        System.out.println();
        if (!isEmpty()) {
            System.out.print("list backward : [ ");
            Node current = last;
            while (null != current) {
                current.printData();
                current = current.getPrev();
            }
            System.out.print("]");
        } else System.out.println("list is empty");
        System.out.println();
    }

    public int size() {
        return nodesCount;
    }
 }