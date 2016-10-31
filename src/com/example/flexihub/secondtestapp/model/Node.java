package com.example.flexihub.secondtestapp.model;

/**
 * Created by Roman Zahorui on 29.10.2016.
 */
public interface Node {

    void printData();

    void setPrev(Node prevNode);
    Node getPrev();

    void setNext(Node nextNode);
    Node getNext();
}
