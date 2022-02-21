package com.company;

public class MyLinkedList {
    public Node head;
    private Node tail;
    private Node currentNode;
    private int numberOfElements;


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.currentNode = null;
        this.numberOfElements = 0;
    }

    void addAtHead(int val) {
        if(head != null) {
            Node newNode = new Node(val);
            newNode.next = this.head;
            this.head.previous = newNode;
            this.head = newNode;
        } else {
            this.head = new Node(val);
            this.tail = this.head;
        }
        this.numberOfElements++;
    }

    void addAtTail(int val) {
        if(this.tail != null) {
            this.tail.next = new Node(val);
            this.tail.next.previous = this.tail;
            this.tail = this.tail.next;
            this.numberOfElements++;
        } else {
            this.addAtHead(val);
        }
    }

    int get(int index) {
        if(index < 0 || this.numberOfElements <= index ) {
            return -1;
        }
        return this.getNodeByIndex(index).value;
    }

    void addAtIndex(int index, int val) {
        if(index == 0) {
            this.addAtHead(val);
        } else if(index == this.numberOfElements) {
            this.addAtTail(val);
        } else if(0 < index && index < this.numberOfElements) {
            this.currentNode = getNodeByIndex(index);
            Node newNode = new Node(val);
            currentNode.previous.next = newNode;
            newNode.previous = currentNode.previous;
            newNode.next = currentNode;
            currentNode.previous = newNode;
            this.numberOfElements++;
        }
    }

    void deleteAtIndex(int index) {
        if(index == 0) {
            if(this.numberOfElements  > 1) {
                this.head.next.previous = null;
                this.head = this.head.next;
            } else {
                this.head = null;
            }
            this.numberOfElements--;
        } else if(index == this.numberOfElements - 1) {
            this.tail.previous.next = null;
            this.tail = this.tail.previous;
            this.numberOfElements--;
        } else if(0 < index && index < this.numberOfElements - 1) {
            this.currentNode = getNodeByIndex(index);
            this.currentNode.next.previous = this.currentNode.previous;
            this.currentNode.previous.next = this.currentNode.next;
            this.numberOfElements--;
        }
    }

    private Node getNodeByIndex(int index) {
        if(index <= this.numberOfElements / 2) {
            this.currentNode = this.getNodeByIndexBeginningFromHead(index);
        } else {
            this.currentNode = this.getNodeByIndexBeginningFromTail(index);
        }
        return this.currentNode;
    }

    private Node getNodeByIndexBeginningFromHead(int index) {
        this.currentNode = this.head;
        for(int i = 1; i <= index; i++) {
            this.currentNode = this.currentNode.next;
        }
        return this.currentNode;
    }

    private Node getNodeByIndexBeginningFromTail(int index) {
        this.currentNode = this.tail;
        for(int i = this.numberOfElements - 2; i >= index; i--) {
            this.currentNode = this.currentNode.previous;
        }
        return this.currentNode;
    }

    class Node {
        int value;
        Node next;
        Node previous;
        Node(int inValue) {
            this.value = inValue;
            this.next = null;
            this.previous = null;
        }
    }


}
