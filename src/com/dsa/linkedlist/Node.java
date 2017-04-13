package com.dsa.linkedlist;

/**
 * A single generic node in the linked list.
 * @param <A> The actual data in each node in the linked list.
 */
public class Node<A extends Comparable<A>> {
    private A data;
    private Node<A> next;

    // One Argument Constructor
    public Node(A data) {
        this.data = data;
        setNext(null);
    }

    // getter
    public Node<A> getNext() {
        return next;
    }

    // setter
    public void setNext(Node<A> next) {
        this.next = next;
    }

    // getter
    public A getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

}


