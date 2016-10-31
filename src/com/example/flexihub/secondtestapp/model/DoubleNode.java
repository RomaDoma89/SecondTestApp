package com.example.flexihub.secondtestapp.model;

/**
 * Created by Roman Zahorui on 29.10.2016.
 */
public class DoubleNode implements Node {

    private double data;
    private Node nextNode;
    private Node prevNode;

    public DoubleNode(double data) {
        this.data = data;
    }

    @Override
    public void printData() {
        System.out.print("double = "+data+"; ");
    }

    @Override
    public void setPrev(Node prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public Node getPrev() {
        return prevNode;
    }

    @Override
    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public Node getNext() {
        return nextNode;
    }
}
